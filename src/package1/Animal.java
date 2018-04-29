package package1;

 public class Animal {

	String name = "????";
	
	static class Lion extends Animal {
		String name = "Leo";
	}
	
	public static void main(String[] args) {
		Animal animal= new Lion();
		 Lion animal2 = new Lion();
		System.out.println(animal.name);
		System.out.println(animal2.name);
		
				
	}
}



