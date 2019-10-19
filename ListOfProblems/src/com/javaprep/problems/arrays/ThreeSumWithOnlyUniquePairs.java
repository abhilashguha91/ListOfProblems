package com.javaprep.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSumWithOnlyUniquePairs {

/*
 * Whenever we are talking about not having duplicates in any pair, or only unique pairs. We have to keep implement two logics:
 * 1. Keep a set with a concatenated values as key, to understand if the pair appeared before
 * 2. Sort the array such that all the indices are fixed to all the elements. This will ensure that [-1,0,1] and [0,1,-1] do not exist in the o/p differently.	
 */
	public static void main(String args[]) {
		
		int[] a = {-1,0,1,2,-1,-4};
		int sum = 0;
		
		find3Sum(a, sum);
		
	}
	
	public static void find3Sum(int[] a, int sum){
		
		Set<String> set = new TreeSet<String>();
		boolean foundFlag = false;
        Arrays.sort(a);
		for(int i=0; i<a.length-2; i++) {
			
			int l = i+1;
			int r= a.length-1;
			
			while(l<r) {
				if(a[i]+a[l]+a[r]==0) {
                    String uniqueKey = a[i]+":"+a[l]+":"+a[r];
                        if(!set.contains(uniqueKey)){
                            set.add(uniqueKey);
                            System.out.println("["+a[i]+","+a[l]+","+a[r]+"]");
                            foundFlag = true;
                        }
					
					l++;
					r--;
				}
				else if(a[i]+a[l]+a[r]<0) {
					l++;
				}else if(a[i]+a[l]+a[r]>0) {
					r--;
				}
			}
		}
		if(!foundFlag) {
			System.out.println("No pairs found!");
		}
	}
	
}
