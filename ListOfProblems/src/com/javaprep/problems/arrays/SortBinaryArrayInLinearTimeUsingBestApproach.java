package com.javaprep.problems.arrays;

import java.util.Arrays;

//Input:
//Arr =[0, 0, 1, 0, 1, 1, 0, 1, 0, 0]
//Output: 
//Arr =[0, 0, 0, 0, 0, 0, 1, 1, 1, 1]

/*
* the best approach would be to use the partition logic of quicksort 
* so we use 1 as pivot and make one pass of partition process the result would be sorted
* i.e we test if the current element is less than 1, we swap the element with the pointer from the beginning 
* Time complexity is O(n) and auxiliary space complexity O(1)
*/
public class SortBinaryArrayInLinearTimeUsingBestApproach {
	
	
	public static void main (String[] args){
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

		sort(A);

		// print the rearranged array
		System.out.println(Arrays.toString(A));
	}
	
	public static void sort(int[] A)
	{
		int pivot = 1;
		int j =0;
		
		for (int i = 0; i < A.length; i++) {
			
			if(A[i] < pivot) {
				// swap a[i] and a[j] and increment j
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j++;
			}
			
		}
		
	}

}
