package pacSmallP;

import java.util.ArrayList;

public class JavaForEachTest {

	public static void main(String[] args) {
	    ArrayList<String> stringList = new ArrayList<>();
	    stringList.add("a");
	    stringList.add(null);
	    stringList.add("b");
	    stringList.add("c");

	    stringList.stream()
	    
	    .forEach(str -> {
	        if ("b".equals(str)) return; // only skips this iteration.

	        System.out.println(str);
	    });
	}


}
