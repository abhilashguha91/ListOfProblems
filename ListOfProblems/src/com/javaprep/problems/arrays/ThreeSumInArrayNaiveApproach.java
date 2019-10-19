package com.javaprep.problems.arrays;

/*
 * In this approach let's start with 3 loops and find out three numbers one by one.
 * Time complexity is highened to o(n^3) and 
 */
public class ThreeSumInArrayNaiveApproach {
	
	public static void main(String args[]) {
		
		int[] a = {8,7,2,5,3,1};
		int sum = 10;
		
		find3Sum(a, sum);
		
	}
	
	public static void find3Sum(int[] a, int sum){
		
		boolean isFound = false;
		for(int i=0; i<a.length-3 ; i++) {
			for(int j=i+1; j<a.length-2; j++) {
				for(int k=j+1; k<a.length-1; k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
						isFound = true;
					}
				}
			}
		}
		if(!isFound) {
			System.out.println("No Pairs found");
		}
	}
	

}
