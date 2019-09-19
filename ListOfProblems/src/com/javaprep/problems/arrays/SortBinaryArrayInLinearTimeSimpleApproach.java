package com.javaprep.problems.arrays;

import java.util.Arrays;

//Input:
// Arr =[0, 0, 1, 0, 1, 1, 0, 1, 0, 0]
// Output: 
// Arr =[0, 0, 0, 0, 0, 0, 1, 1, 1, 1]

/*
 * Simple approach would be to count number of 0s and then replace all beginning numbers with 0s and rest with 1s
 * or vice versa
 * Time complexity is O(3n) = O(n) and auziliary space complexity O(1)
 */
public class SortBinaryArrayInLinearTimeSimpleApproach {

	public static void main (String[] args)
	{
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

		sort(A);

		// print the rearranged array
		System.out.println(Arrays.toString(A));
	}
	
	public static void sort(int[] A)
	{
		// count number of 0's
		int zeros = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeros++;
			}
		}

		// put 0's in the beginning
		int k = 0;
		while (zeros-- != 0) {
			A[k++] = 0;
		}

		// fill all remaining elements by 1
		while (k < A.length) {
			A[k++] = 1;
		}
	}

}
