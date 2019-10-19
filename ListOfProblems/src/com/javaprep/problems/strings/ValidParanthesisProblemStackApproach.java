package com.javaprep.problems.strings;

import java.util.Stack;

public class ValidParanthesisProblemStackApproach {

	public static void main(String args[]) {
		
		String s = "((";

		
		System.out.println(searchRange(s));
		
		
	}
	
	public static boolean searchRange(String s) {
		
		Stack<Character> charStack = new Stack<Character>();
		boolean balanced = true;
		
		if(s.toCharArray().length == 1)
            return false;
		
		for(Character r:s.toCharArray()) {
			
			
		   if(r.equals('}') || r.equals(')') || r.equals(']')) {
				if(charStack.isEmpty()) {
					balanced = false;
				}else {
					char sr = charStack.pop();
					if(!isBracketMatch(sr,r)) {
						balanced = false;
					}
				}
				
			}else if(r.equals('{') || r.equals('(') || r.equals('[')){
				charStack.add(r);
			}
				
				
		}
		
		if(!charStack.isEmpty())
			balanced = false;
		
		return balanced;
		
	}
	
	static boolean isBracketMatch(Character openingBrace, Character closingBrace) {
		
		if(openingBrace.equals('(') && closingBrace.equals(')'))
			return true;
		if(openingBrace.equals('{') && closingBrace.equals('}')) 
			return true;
		if(openingBrace.equals('[') && closingBrace.equals(']')) 
			return true;
		
		return false;
				
		
	}
	
	
	
	
}
