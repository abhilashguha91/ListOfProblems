package com.javaprep.problems.arrays;

/*
 * Input: 
 * [1, 2, 3, 4, 4]
 * Output:
 * 4
 * Note here the range is defined. We are expecting an array within a closed range
 * So what this means is, we were expecting this array to be 1,2,3,4,5 but it is 1,2,3,4,4 and 5 is skipped
 * We are going to do it with hashing, 
 * but as the value range is closed from 1 to n-1 we don't really need a hashmap another boolean array should suffice
 * so we can make an array of size 5 and we'll use value of one array as 
 * the index of the boolean array to tell us if it was visited before
 * 
 */
public class FindDuplicateElementInLimitedRangeArray {
	
	public static void main(String args[]) {
		
		// input array contains n numbers between [1 to n - 1]
		// with one duplicate, where n = A.length
		int[] A = { 1, 2, 3, 2, 5 };

		findDuplicate(A);
	}
	
	public static void findDuplicate(int[] A) {
		
		boolean[] positionVsValueArray = new boolean[A.length+1];
		
		for(int i=0;i<A.length;i++) {
			
			if(positionVsValueArray[A[i]]) {
				System.out.println(A[i]);
			}
			
			positionVsValueArray[A[i]] = true;
			
		}
		
	}
	
	

}
