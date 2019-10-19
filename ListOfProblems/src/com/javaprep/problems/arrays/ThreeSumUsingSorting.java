package com.javaprep.problems.arrays;

import java.util.Arrays;

/*
 * In this approach let's start with 3 loops and find out three numbers one by one.
 * Time complexity for sorting the array is o(nlog(n)) and then we'll need two more nested loops to find the rest of the two numbers i.e o(n^2)
 * This brings the compounded complexity to o(n^2)
 * But the space complexity is constant
 */
public class ThreeSumUsingSorting {

public static void main(String args[]) {
		
		int[] a = {8,7,2,5,3,1};
		int sum = 10;
		
		find3Sum(a, sum);
		
	}
	
	public static void find3Sum(int[] a, int sum){
		
		Arrays.sort(a);
		boolean isFound = false;
		for(int i=0; i<a.length-2; i++) {
			
			int l = i+1;
			int r= a.length-1;
			
			while(l<r) {
				if(a[i]+a[l]+a[r]==sum) {
					System.out.println("["+a[i]+","+a[l]+","+a[r]+"]");
					isFound = true;
					l++;
					r--;
				}
				else if(a[i]+a[l]+a[r]<sum) {
					l++;
				}else if(a[i]+a[l]+a[r]>sum) {
					r--;
				}
			}
		}
		if(!isFound) {
			System.out.println("No pairs found!");
		}
	}
	
}
