package pacSmallP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME"); 
		Predicate<String> cf1 = s -> s.length() > 3;
		Predicate cf2 = new CourseFilter() {
			
			@Override
			public boolean test (String s) {
		return s.contains ("Java");

		}

		};

		long c = strs.stream()

		.filter(s -> s.length() > 3)

		.filter(cf2)//line n2

		.count(); 
		System.out.println(c);


	}

}
