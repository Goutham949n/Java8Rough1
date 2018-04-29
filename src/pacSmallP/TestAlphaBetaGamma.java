package pacSmallP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestAlphaBetaGamma {

	public static void main(String[] args) {
		
		List<Alpha> strs = new ArrayList<Alpha>(); 
		
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		strs.forEach(s -> {
			
			String doStuff = s.doStuff("Java");
			System.out.println(doStuff);
			
			/*BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;//line n1 
			System.out.println(val.apply(10, 10.5));*/

			


			
		});
		
	}

}
