package com.javaprep.problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrayWithGivenSumUsingHashing {

		// Input:
		// Arr =[3,4,-7,1,3,3,1,-4]
		// Sum = 7
		// Output: 
		// Pairs found at: [3,4] [3,4,-7,1,3,3] [1,3,3] [3,3,1]

		public static void main(String[] args) {
			
			int[] a = {3,4,-7,1,3,3,1,-4};
			int sum = 7;
			
			findSubArray(a, sum);
		}
		
		public static void findSubArray(int[] a, int sum) {
			
			//We make a map with key as the sumSoFar - Sum (deficit of the sum) 
			// and the list of the last index where it matches the key
			Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
			// insert (0, -1) pair into the map to handle the boderline case when
			// sub-array with 0 sum starts from index 0
			insertInMap(map, 0, -1);
			int sumSoFar=0;
			
			for(int i=0;i <a.length ; i++) {
				
				sumSoFar += a[i];
				
				if(map.containsKey(sumSoFar - sum)) {
					List<Integer> list = map.get(sumSoFar - sum);
					// print subarray from each element to current index
					for(Integer eachIndexInList : list) {
						printSubarray(a, eachIndexInList+1, i);
					}
				}
				
				// Insert sumSoFar and current index
				insertInMap(map, sumSoFar, i);
				
			}
		}
		
		public static void insertInMap(Map<Integer, List<Integer>> map, int key, int value) {
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(value);
		}
		
		// Utility function to print a subarray A[i, j]
		public static void printSubarray(int[] A, int i, int j)
		{
			System.out.println(IntStream.range(i, j + 1)
										.mapToObj(k -> A[k])
										.collect(Collectors.toList()));
		}

}
