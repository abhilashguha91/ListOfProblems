package com.javaprep.problems.arrays;

import java.util.Arrays;

//Input:
//Arr =[0, 0, 1, 0, 1, 1, 0, 1, 0, 0]
//Output: 
//Arr =[0, 0, 0, 0, 0, 0, 1, 1, 1, 1]

/*
* A better approach would be to count number of 0s and then place each 0 from beginning for each encountered 0, 
* once array end is reached fill the rest with 1
* Time complexity is O(2n) = O(n) and auxiliary space complexity O(1)
*/
public class SortBinaryArrayInLinearTimeUsingBetterApproach {

	public static void main (String[] args)
	{
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

		sort(A);

		// print the rearranged array
		System.out.println(Arrays.toString(A));
	}
	
	public static void sort(int[] A)
	{
		// Insert positions for the array
		int k = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				A[k] = 0;
				// once inserted increment the insertion pointer
				k++;
			}
		}

		// put 1's from the end
		for (int j = k; j < A.length; j++) {
			A[j] = 1;
		}
		
	}

}
