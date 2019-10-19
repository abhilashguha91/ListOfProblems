package com.javaprep.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Here we'll use two nested loops and a hashmap to hold all the all the indices and the difference between the sum and these two numbers
 * 
 */
public class ThreeSumUsingHashing {

	public static void main(String args[]) {
		
		int[] a = {8,7,2,5,3,1};
		int sum = 10;
		
		find3Sum(a, sum);
		
	}
	
	public static void find3Sum(int[] a, int sum){
		
		for(int j=0; j<a.length-2 ; j++) {
		
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=j+1; i<a.length ; i++) {
				
				// check if the sum - current element (i.e it's deficit value) is in the map or not
				if(map.containsKey(sum - (a[i]+a[j]))) {
					System.out.println("["+a[j]+","+a[i]+","+a[map.get(sum - (a[i]+a[j]))]+"]");
				}else {
					map.put(a[i], i);
				}
				
			}
		}
	}
}
	

