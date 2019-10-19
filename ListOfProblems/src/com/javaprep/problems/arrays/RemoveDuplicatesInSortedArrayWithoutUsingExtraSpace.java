package com.javaprep.problems.arrays;

public class RemoveDuplicatesInSortedArrayWithoutUsingExtraSpace {

	
public static void main(String args[]) {
		
		int[] a = {1, 1, 2};

		int newLength = removeDuplicates(a, a.length);
		for(int k=0; k<newLength;k++) {
			System.out.println(a[k]);
		}
		
		
	}
	
	/*
	 * This time the logic will be same but rather than creating a new temp array and then moving temp to input array,
	 * we create a seperate pointer in the same array.
	 * this returns length of modified array
	 */
	public static int removeDuplicates(int[] a, int length){
		
		if(length == 1|| length == 0)
		return length;
		
		int j=0;
		for(int i =0;i<=length-2;i++) {
			
			if(a[i]!=a[i+1]) {
				a[j] = a[i];
				j++;
			}
			
		}
		a[j++]= a[length-1];
		
		return j;
		
	}
	
}
