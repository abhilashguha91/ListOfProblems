package com.javaprep.problems.arrays;

public class RemoveDuplicatesInSortedArrayUsingExtraSpace {

	public static void main(String args[]) {
		
		int[] a = {1, 2, 2, 3, 4, 4, 4, 5, 5};

		int newLength = removeDuplicates(a, a.length);
		for(int k=0; k<newLength;k++) {
			System.out.println(a[k]);
		}
		
		
	}
	
	/*
	 * this returns length of modified array
	 */
	public static int removeDuplicates(int[] a, int length){
		
		if(length == 1|| length == 0)
		return length;
		
		int[] temp = new int[length];
		int j=0;
		for(int i =0;i<length-2;i++) {
			
			if(a[i]!=a[i+1]) {
				temp[j] = a[i];
				j++;
			}
			
		}
		for(int k=0; k<=j;k++) {
			a[k]=temp[k];
		}
		
		return j;
		
	}
	
}
