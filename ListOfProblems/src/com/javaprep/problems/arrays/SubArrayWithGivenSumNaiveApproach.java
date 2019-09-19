package com.javaprep.problems.arrays;

import java.util.HashMap;
import java.util.Map;

// O(n^2) 
public class SubArrayWithGivenSumNaiveApproach {

			// Input:
			// Arr =[3,4,-7,1,3,3,1,-4]
			// Sum = 7
			// Output: 
			// Pairs found at: [3,4] [3,4,-7,1,3,3] [1,3,3] [3,3,1]

			public static void main(String[] args) {
				
				int[] a = {3,4,-7,1,3,3,1,-4};
				int sum = 7;
				
				findSubArray(a, sum);
			}
			
			public static void findSubArray(int[] a, int sum) {

				for(int i=0; i<a.length ; i++) {
					
					int curr_sum = 0;
					for(int j=i; j<a.length ; j++) {
						curr_sum+=a[j];
						if(curr_sum == sum) {
							System.out.println("["+i+","+j+"]");
						}
					}
					
				}
			}
}
