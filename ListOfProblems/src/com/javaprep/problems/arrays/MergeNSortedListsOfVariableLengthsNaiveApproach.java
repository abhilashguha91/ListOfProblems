package com.javaprep.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Input:
 * [10, 20, 30, 40]
   [15, 25, 35]
   [27, 29, 37, 48, 93]
   [32, 33]
   Output:
   10 15 20 25 27 29 30 32 33 35 37 40 48 93 
 */
/*
 * For this lame approach we will make another array which is the length of all the arrays combined.
 * We will iterated over each one of the arrays and insert it in the new array
 * We will then sort the final array with Arrays.sort
 * Thus we will be getting the time complexity of O(Mn)+O(nLog(n)) = O(Mnlog(n)) if M is variable it's almost O(n^2)
 * And auxiliary space complexity of O(n)
 */
public class MergeNSortedListsOfVariableLengthsNaiveApproach {
	
	public static void main(String args[]) {
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(10, 20, 30, 40),
											Arrays.asList(15, 25, 35),
											Arrays.asList(27, 29, 37, 48, 93),
											Arrays.asList(32, 33));
		
		mergeLists(list);
	}
	
	public static void mergeLists(List<List<Integer>> list) {
		
		List<Integer> mergedList = new ArrayList<Integer>();
		for(List<Integer> eachList : list ) {
			for(Integer eachNumber : eachList) {
				mergedList.add(eachNumber);
			}
		}
		Integer[] arr = mergedList.toArray(new Integer[mergedList.size()]);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
