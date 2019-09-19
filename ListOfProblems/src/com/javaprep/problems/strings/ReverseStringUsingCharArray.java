package com.javaprep.problems.strings;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {

		System.out.println(reverse("Hello World!"));
		System.out.println(reverse("Hello World"));
		

	}
	
	
	static String reverse(String s) {
		
		char a[] = s.toCharArray();
		char tmp;
		for(int i = s.length()-1 , j = 0; i>s.length()/2-1 ; i--, j++) {
			
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		return new String(a);
		
		
	}

}
