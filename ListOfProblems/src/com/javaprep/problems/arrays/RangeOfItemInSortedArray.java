package com.javaprep.problems.arrays;

public class RangeOfItemInSortedArray {
	
	public static void main(String args[]) {
		
		int[] a = {5,7,7,8,8,10};

		int range[] = searchRange(a, 10);
		System.out.println("["+range[0]+","+range[1]+"]");
		
		
	}
	
	/*
	 * Couple of Border cases to keep in mind:
	 * 1. Array length is 1 or 2 and items match
	 * 2. Array length is 1 or 2 and items don't match
	 * 3. Item is found in Last of the array 
	 */
	public static int[] searchRange(int[] a, int target) {
        
        int[] range = new int[2];
        int start=-1;
        boolean isFound = false;
        
        // Iterating till last of the array, i.e i<=a.length-1 hence need to keep checks wherever a[i+1] is used
        // Mention border condition with else if(i==a.length-1) This would take care of Item is found in Last of the array and array length is 1 and found
        // if not found make sure range is populated
        for(int i =0;i<=a.length-1;i++) {
			
            	if(a[i]== target){
                isFound = true;
                if(start==-1){
                    start = i;
                 }
                   
                if(i!=a.length-1 && a[i]!=a[i+1]) {
				range[0]=start;
                range[1]=i;       
			    }else if(i==a.length-1){
                    range[0]=start;
                    range[1]=i;
                }
            }
        }
        
        if(!isFound){
           range[0]=start;
            range[1]=start; 
        }
        return range;        
        
    }

}
