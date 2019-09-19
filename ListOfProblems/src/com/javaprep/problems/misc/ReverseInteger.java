package com.javaprep.problems.misc;

// Handle negative integer and well as overflow
public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println(reverse(-1234567));
		
	}
	
	static int reverse(int i) {
		
		boolean negativeFlag = false; 
        if (i < 0){ 
            negativeFlag = true; 
            i = -i; 
        } 
		
		int rev=0, prev_rev=0, d;
		while(i>0) {
			d = i%10;
			rev = rev*10 + d;
			// checking if the reverse overflowed or not. 
            // Declare a prev rev, update it with rev num at every iteration
			// The values of (rev_num - curr_digit)/10 and 
            // prev_rev_num must be same if there was no 
            // problem.
			if ((rev - d)/10 != prev_rev) 
            { 
                System.out.println("WARNING OVERFLOWED!!!"); 
                return 0; 
            } 
			prev_rev = rev;
			i=i/10;
		}
		
		return (negativeFlag == true)? -rev : rev; 
		
		
		
	}

}
