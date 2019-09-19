package com.javaprep.problems.arrays;

import java.util.Arrays;


//O(nlog(n)) for the sort and the O(n) for the pair finding, total = O(nlog(n))
public class PairWithGivenSumUsingSorting {

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
			
			// First sort the array by Arrays.sort this would take nLog(n) in average scenario
			Arrays.sort(a);
			
			//now we start two pointers one from low and another from high 
			// if the sum matches 10 we call it a pair
			// if the sum is less than 10 we increase the low pointer
			// if the sum is more than 10 we decrease the high pointer
			int high = a.length-1;
			int low = 0;
			
			while(low < high) {
				
				if(a[low] + a[high] == sum) {
					System.out.println("["+a[low]+","+a[high]+"]");
					low++;
					high--;
				}
				else if(a[low] + a[high] < sum) {
					low++;
				}else {
					high--;
				}
				
			}
		}
}
