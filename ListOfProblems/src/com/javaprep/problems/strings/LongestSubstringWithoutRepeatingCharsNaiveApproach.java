package com.javaprep.problems.strings;

import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharsNaiveApproach {
	
	public static void main(String args[]) {
		
		System.out.println(longestSubstringWithoutRepeatingCharacters("abcabcbb"));
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
        
        for(int i=0;i<l;i++){
            Set<Character> set = new TreeSet<Character>();
            set.add(a[i]);
            for(int j=i+1;j<l;j++){
                
                if(!set.contains(a[j])){
                    set.add(a[j]);
                }else{
                    break;
                } 
            }
            if(longestSubstring<set.size()){
                longestSubstring = set.size();
            }
            
        } 
        return longestSubstring;
		
	}

}
