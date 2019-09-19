package com.javaprep.problems.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Input:
 * [2, 2, 2, 4, 4, 4, 4, 5, 6, 8, 8, 9]
   Output:
    {2=3, 4=4, 5=1, 6=1, 8=2, 9=1}
 */
/*
 * We will use Binary search methodology to traverse through the array as it is a sorted one. If not sorted we will sort it first.
 * 
 */
public class FindFrequenciesOfEachElementsInSortedArrayByIteration {
	
	public static void main(String args[]) {
		
		int[] A = { 2, 2, 2, 4, 4, 4, 4, 5, 6, 8, 8, 9};
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		
		findFrequency(A, freqMap);
		
		System.out.println(freqMap);
		
	}
	
	public static void findFrequency(int[] A, Map<Integer, Integer> freqMap) {
		
		int left = 0, right = A.length-1; 
		
		// equal is very necessary here as if left and right are at same and the elem values match we need to add one more to the map
		while(left<=right) {
			
			// If A[left] == A[right] add the count from right to left to the freqMap
			if(A[left] == A[right]) {
				
				// handle if map is empty
				if(freqMap.get(A[left]) == null) {
					freqMap.put(A[left], 0);
				}
				
				// as left and right are same all values from left to right should be added to frequency
				freqMap.put(A[left], freqMap.get(A[left]) + (right-left+1));
				
				// start left from next to right and bring right again to end
				left = right +1;
				right = A.length-1;
			}else {
				
				// If A[left] != A[right] reduce right, bring it in between right and left 
				right = (left+right)/2;
			}
		}
	}
}
