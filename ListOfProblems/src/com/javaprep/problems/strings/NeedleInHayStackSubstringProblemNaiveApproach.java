package com.javaprep.problems.strings;

/*
 * Input : s1 = "for", s2 = "geeksforgeeks"
Output : 5
String "for" is present as a substring
of s2.

Input : s1 = "practice", s2 = "geeksforgeeks"
Output : -1.
 */
public class NeedleInHayStackSubstringProblemNaiveApproach {

	public static void main(String args[]) {
		
		System.out.println(needleInHaystackSubstringProblemNaiveApproach("mississippi","pi"));
		
	}
	
	public static int needleInHaystackSubstringProblemNaiveApproach(String haystack, String needle) {
        
        if(haystack.equals("")
          && needle.equals("")){
            return 0;
        }else if(!haystack.equals("")
          && needle.equals("")){
            return 0;
        }else if(haystack.equals("")
          && !needle.equals("")){
            return -1;
        }else if(haystack.equals(needle)){
            return 0;
        }
        
        char[] str = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        
        int position =-1;
		for(int i=0; i< (str.length-pattern.length)+1 ; i++) {
			
			boolean  found=false;
			for(int j=0, k=i;j<pattern.length;j++,k++) {
				if(str[k]!=pattern[j]) {
					found = false;
					break;
				}
				found = true;
			}
			if(found) {
				position = i;
                break;
			}
			
		}
        return position;
        
    }
	
	
}
