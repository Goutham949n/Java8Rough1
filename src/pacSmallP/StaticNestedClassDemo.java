package pacSmallP;

//Java program to demonstrate accessing 
//a static nested class

//outer class
class OuterClass
{ 
	
	int distance;
	
	OuterClass(){}
	
	public OuterClass(int x){
		this.distance = x;
	}
	
 // static member
 static int outer_x = 10;
  
 // instance(non-static) member
 int outer_y = 20;
  
 // private member
 private static int outer_private = 30;
 
 public void increaseSpeed(int time) {
	 int timeTravel = time;
  
 // static nested class
		class StaticNestedClass {
			int value =0;

			void display() {
				value = distance/timeTravel; // distance can be accessed because its not a static class. 

				// can access static member of outer class
				System.out.println("value = " + value);

				
			}
		}
		new StaticNestedClass().display();
	}
}

//Driver class
public class StaticNestedClassDemo
{
 public static void main(String[] args)
 {
     // accessing a static nested class
     OuterClass nestedObject = new OuterClass(100);
      
     nestedObject.increaseSpeed(60);
      
 }
}