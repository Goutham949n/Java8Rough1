package pacSmallP;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		Function<Integer, String> function = (t) -> {
			if (t % 2 == 0) {
				return t+ " is even number";
			} else {
				return t+ " is odd number";
			}
		};

		String apply = function.apply(9);
		System.out.println(apply);
		System.out.println(function.apply(8));
	}

}
