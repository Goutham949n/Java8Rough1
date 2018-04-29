package package1;

public class Test {
	
	int sum= 0;
	public void doCheck(int number) throws Exception{
		if(number % 2 == 0) {
		System.out.println("");
		}else {
			for(int i=0; i<number; i++) {
				sum += i;
				throw new Exception();
			}
		}
	}

	public static void main(String[] args) throws Exception{
		Test obj = new Test();
		obj.doCheck(3);
		System.out.println(obj.sum);

	}

}
