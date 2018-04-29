package com.fms.app.task;

import java.util.concurrent.Future;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Notify notify = context.getBean(Notify.class);
		
		System.out.println("Main Thread Triggering");
		Future future = notify.sendMail("lokithraj@gmail.com");
		Boolean value = (Boolean) future.get();
		System.out.println("Main Thread Ends with " + value);
		
		/*notify.asyncMethodWithVoidReturnType();
		System.out.println("Main Thread Ends ");*/
		
	}
}
