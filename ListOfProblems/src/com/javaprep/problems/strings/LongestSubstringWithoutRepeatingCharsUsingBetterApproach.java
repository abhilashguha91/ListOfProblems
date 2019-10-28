package com.javaprep.problems.strings;

import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharsUsingBetterApproach {
	
public static void main(String args[]) {
		
		System.out.println(longestSubstringWithoutRepeatingCharacters("aab"));
	}
	
	public static int longestSubstringWithoutRepeatingCharacters(String s) {
		
		char[] a = s.toCharArray();
        int l = a.length;
        
        if(l==0){
            return 0;
        }else if(l==1){
            return 1;
        }
        
        int longestSubstring= 0;
        
        
        int pointer=1;
        Set<Character> set = new TreeSet<Character>();
        int i=0;
        while(i<l){
            
            
            if(!set.contains(a[i])){
                set.add(a[i]);
                i++;
            }else{
                i= pointer;
                pointer++;
                set.clear();
            } 
            
            if(longestSubstring<set.size()){
                longestSubstring = set.size();
            }
            
        } 
        return longestSubstring;
		
	}

}
