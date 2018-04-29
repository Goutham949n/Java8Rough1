package package1;

import java.util.ArrayList;
import java.util.List;

class A<T>{
	private T content;
	
}
class B extends A{
	
}
class C extends B{
	
}
public class GenericTest {

	public static void main(String[] args) {

		List<?> list1 = new ArrayList<>();
	}

}
