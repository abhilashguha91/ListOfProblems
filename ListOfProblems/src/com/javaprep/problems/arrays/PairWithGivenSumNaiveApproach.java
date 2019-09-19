package com.javaprep.problems.arrays;

// O(n^2) all cases for all pairs, If only one pair is required O(n^2) worst case
public class PairWithGivenSumNaiveApproach {
	
	
	// Input:
	// Arr =[8,7,2,5,3,1]
	// Sum = 10
	// Output: 
	// Pairs found at: [0,2] [1,4]

	public static void main(String[] args) {
		
		int[] a = {8,7,2,5,3,1};
		int sum = 10;
		
		findPair(a, sum);
		
	}
	
	public static void findPair(int[] a, int sum) {
		
		boolean foundFlag = false;
		for(int i = 0; i < a.length ; i++) {
			
			for(int j = i+1 ; j < a.length ; j++) {
				
				if(a[i] + a[j] == sum ) {
					foundFlag = true;
					System.out.println("["+a[i]+","+a[j]+"]");
				}
				
			}
			
		}
		if(!foundFlag) {
			System.out.println("No pairs found!");
		}
		
	}

}
