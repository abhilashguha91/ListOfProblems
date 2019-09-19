package com.javaprep.problems.arrays;

import java.util.HashMap;
import java.util.Map;

//O(n) and auxiliary space complexity is also O(n) in worst case
public class PairWithGivenSumUsingHashing {
	
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
		
		// If we don't need to display index, we can use a set as well instead
		public static void findPair(int[] a, int sum) {
			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i=0; i<a.length ; i++) {
				
				// check if the sum - current element (i.e it's deficit value) is in the map or not
				if(map.containsKey(sum - a[i])) {
					System.out.println("["+a[i]+","+a[map.get(sum - a[i])]+"]");
				}else {
					map.put(a[i], i);
				}
				
			}
			
		}

}
