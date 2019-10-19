package com.javaprep.problems.misc;

public class RomanToInteger {

	public static void main(String args[]) {

		String s = "MCDLXXVI";

		System.out.println(romanToInt(s));

	}

	public static int romanToInt(String s) {

		int romanNumber = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {

			int currentValue = 0;

			if ('I' == c[i]) {
				if (i != c.length - 1) {
					if ('V' == c[i + 1]) {
						currentValue = 4;
						i++;
					} else if ('X' == c[i + 1]) {
						currentValue = 9;
						i++;
					} else {
						currentValue = 1;
					}
				} else {
					currentValue = 1;
				}
			}
			else if ('X' == c[i]) {
				if (i != c.length - 1) {
					if ('L' == c[i + 1]) {
						currentValue = 40;
						i++;
					} else if ('C' == c[i + 1]) {
						currentValue = 90;
						i++;
					} else {
						currentValue = 10;
					}
				} else {
					currentValue = 10;
				}
			}
			else if ('C' == c[i]) {
				if (i != c.length - 1) {
					if ('D' == c[i + 1]) {
						currentValue = 400;
						i++;
					} else if ('M' == c[i + 1]) {
						currentValue = 900;
						i++;
					} else {
						currentValue = 100;
					}
				} else {
					currentValue = 100;
				}

			}
			else if ('V' == c[i]) {
				currentValue = 5;
			}
			else if ('L' == c[i]) {
				currentValue = 50;				
				
			}else if ('D' == c[i]) {
				currentValue = 500;
				
			}else if ('M' == c[i]) {
				currentValue = 1000;
				
			}
			

			romanNumber = romanNumber + currentValue;

		}
		return romanNumber;
	}

}
