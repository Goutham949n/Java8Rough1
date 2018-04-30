package com.test.testFromBehind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMethodRef127 {

	public static void main(String[] args) {

		String[] strArray = new String[] { "Tiger", "Rat", "Cat", "Lion" };
		
		List<String> ls = new ArrayList<String>();
		ls.add("Tiger");
		ls.add("Rat");
		ls.add("Cat");
		ls.add("Lion");
		
		
		Arrays.sort(strArray, CheckClass :: checkValue);
		
		ls.sort(CheckClass :: checkValue);
		ls.sort((a1,a2) -> (-1)* a1.length() - a2.length());
		ls.forEach(System.out::println);


		for (String s : strArray) { 
			
			System.out.print (s + " ");
		}

	}

}

class CheckClass {

	public static int checkValue(String s1, String s2) {
		return s1.length() - s2.length();
	}

}
