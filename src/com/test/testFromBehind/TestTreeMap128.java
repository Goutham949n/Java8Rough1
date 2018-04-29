package com.test.testFromBehind;

import java.util.HashMap;
import java.util.Map;

public class TestTreeMap128 {

	public static void main(String[] args) {
		//Map<Integer, String> books = new TreeMap<>(); 
		Map<Integer, String> books = new HashMap<>();
		
		books.put (1007, "A");
		books.put (1002, "C");

		books.put (1001, "B");

		books.put (1003, "B"); 
		System.out.println (books);


	}

}
