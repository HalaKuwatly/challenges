package com.test;

/**
 * A method to reverse a string using recursion
 **/

class Solution
{
	String solution(String s)
	{
		String result = reverse(s);
		return result;
	}
	
	static String reverse(String s) {
		if (s.length() == 0)
			return s;
		char ch = s.charAt(s.length()-1);
		if (s.length() == 1)
			return Character.toString(ch);
		return ch +reverse(s.substring(0,s.length()-1)); 

    }
}
