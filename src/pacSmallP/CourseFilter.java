package pacSmallP;

import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> { 
	
	public default boolean test (String str) {
		
     return str.equals("Java");
     

}

}

