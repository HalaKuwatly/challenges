package com.test;

/**
 * Write a method that takes an integer "height" and char argument "c" 
 * and prints out an "X" that is "height" characters tall using the special character in "c"
 **/

class Solution
{
	void solution(int size, char c)
	{
		String result="";
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j)
					result+=" "+Character.toString(c);
				else if(i==size-j-1)
					result+=" "+Character.toString(c);
				else
					result+="  ";
			}
			result+="\n";
		}
		System.out.println(result);
		
	}
}
