package com.javaprep.problems.strings;

public class ReverseStringOtherWays {

	public static void main(String[] args) {
		
		String s = "Hello World!";
		String s1 = "Hello World";
		System.out.println(reverseByStringBuilder(s));
		System.out.println(reverseByString(s));
		
		System.out.println(reverseByStringBuilder(s1));
		System.out.println(reverseByString(s1));

	}
	
	static String reverseByStringBuilder(String s) {
		
		StringBuilder sb = new StringBuilder("");
		for(int i = s.length()-1;i>=0;i--) {
			sb = sb.append(s.charAt(i));
		}
		
		return new String(sb);
	}
	
	
	static String reverseByString(String s) {
		
		String s1 = "";
		for(int i = s.length()-1;i>=0;i--) {
			s1 = s1 + s.charAt(i);
		}
		
		return s1;
	}

}
