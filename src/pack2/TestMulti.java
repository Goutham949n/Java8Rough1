package pack2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestMulti {

	public static void main(String[] args) {
       
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Future<Integer> future1 = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				String st = "";
				System.out.println("Starting 1...");
				for(int i=0; i<1000; i++) {
					for(int j=0; j<100; j++) {st = st +"a";}
				}
				System.out.println("finished 1.");
				return 1;
			}
		});
		
		Future<Integer> future2 = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				String st = "";
				System.out.println("Starting 2...");
				for(int i=0; i<1000; i++) {
					for(int j=0; j<100; j++) {st = st +"a";}
				}
				System.out.println("finished 2.");
				return 2;
			}
		});
		System.out.println("somewhere in main thread");
		Future<Integer> future3 = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				String st = "";
				System.out.println("Starting 3...");
				for(int i=0; i<1000; i++) {
					for(int j=0; j<10; j++) {st = st +"a";}
				}
				System.out.println("finished 3.");
				return 3;
			}
		});
		
		shutdownAndAwaitTermination(executorService);
		try {
			System.out.println("Result..."+ " "+ future1.get());
			System.out.println("Result..."+ " "+ future2.get());
			System.out.println("Result..."+ " "+ future3.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ended in main thread");
		
	}

	 static void shutdownAndAwaitTermination(ExecutorService pool) {
		   pool.shutdown(); // Disable new tasks from being submitted
		   try {
		     // Wait a while for existing tasks to terminate
		     if (!pool.awaitTermination(1, TimeUnit.SECONDS)) {
		    	 
		       pool.shutdownNow(); // Cancel currently executing tasks
		       System.out.println("Cancel currently executing tasks");
		       // Wait a while for tasks to respond to being cancelled
		       if (!pool.awaitTermination(11, TimeUnit.SECONDS))
		           System.err.println("Pool did not terminate");
		     }
		   } catch (InterruptedException ie) {
		     // (Re-)Cancel if current thread also interrupted
		     pool.shutdownNow();
		     // Preserve interrupt status
		     Thread.currentThread().interrupt();
		   }
		 }
}
