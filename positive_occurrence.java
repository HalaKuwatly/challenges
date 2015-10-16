package com.test;

/**
 * Write a function that when given a zero-indexed array A of N integers, sorted
 * in non decreasing order, and some integer X, looks for X in A. If X is
 * present in A, then it returns a positive index of an occurrence of X in A.
 * Otherwise, the functions returns -1. It should work like this: If I have
 * A[0]=1, A[1]=1 and X=1 it should return 0 because A[0]=1.
 **/

class Solution
{
	int solution(int[] A, int X)
	{
		int N = A.length;
		if (N == 0)
			return -1;
		int l = 0;
		int r = N - 1;
		while (l < r)
		{
			int m = (l + r) / 2;
			if (A[m] == X)
				return m;
			if (A[m] > X)
			{
				r = m - 1;
			}
			else
			{
				l = m + 1;
			}
		}
		return -1;
	}
}
