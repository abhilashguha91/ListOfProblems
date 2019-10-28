package com.javaprep.problems.strings;

public class NeedleInHayStackSubstringProblemUsingKMPAlgo {

	
public static void main(String args[]) {
		
		System.out.println();
		
		//needleInHaystackSubstringProblemNaiveApproach("adsgwadsxdsgwadsgz","dsgwadsgz");
		needleInHaystackSubstringProblemNaiveApproach("ABABDABACDABABCABAB","ABABCABAB");
		
		
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
		
		int position =-1;
        
        char[] str = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        
        int strLen = str.length;
        int patternLen = pattern.length;
        
        int[] lps = calculateLPSArray(pattern, patternLen);
        
        // Now comparing the pattern and string
        int i=0; // index for string
        int j=0; // index for pattern
        
        while(i<strLen) {
        	
        	if(str[i] == pattern[j]) { // This is simple, just go along with the next chars of both
        		i++;
        		j++;
        	}
        	
        	if(j==patternLen) { // if j has reached it's finish line it means the pattern is found.
        		System.out.println("Pattern found at: "+(i-j)); // i is already at the end of the pattern
        		j = lps[j-1]; // take it to the last occurance of j
        	}
        	
        	if(i<strLen && str[i] != pattern[j]){ 
        		    // i<strLen is checked as we increment i before this and after while check, so it can give out of bounds
        		    // Now things get tricky on where to get back, remember for KMP we do not make the i(String index) go back
        			// So j has to go back, back to the position of it's previous occurance + 1, which is held as VALUE in LPS array
        		
        		if(j!=0) { // check if while reducing j have we not reached the beginning of the pattern.
        			j = lps[j-1];
        		}else { // if beginning of the pattern is reached, that means there were no substrings with matching prefix and suffix, so just move on with i, and start with j=0;
        			i++;
        		}
        		
        	}
        	
        }
        
        
        
		
        
        return position;
        
    }
	
	public static int[] calculateLPSArray(char[] pattern, int patternLen) {
		
		
		int lps[] = new int[patternLen];
		int i = 1;
		int len=0;
		
		// first element of LPS is always 0
		lps[0] = 0;
		
		while(i<patternLen) {
			
			// If an there is a character is repeated. 
			// Assign the LPS of this repeated char one more than the position of the last char.
			// The reason we take the POSTION here and not the VALUE is, this should hold the POSTION of last occurance of this char.
			// So we need to come back to this place if our string pattern matching fails post this point.**
			// And then we increment both i and len to check if there is any pattern to this char match.
			if(pattern[len]==pattern[i]) {
			
				lps[i] = len+1;
				len++;
				i++;
			}else{ // If an there is a character is not repeated. We should simply be moving ahead i and mark lps[i] as 0
				
				if(len == 0) {
					lps[i] = 0;
					i++;
				}else { // but is the len value is not zero we should match this with it's previous substring as well, so take len to the lps[len-1] and don't increment i
					len = lps[len-1]; // here we assign len<-lps[len - 1] i.e the previous VALUE not position, as the VALUE is the position of the last occurance of this char.**
				}
			}
			
		}
		
		 
		
		
		return lps;
	}
	
	
	
}
