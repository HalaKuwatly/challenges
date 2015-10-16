package com.test;

/**
 * A positive integer N is given. The goal is to construct the shortest possible
 * sequence of integers ending with N,<br>
 * using the following rules:<br>
 * the first element of the sequence is 1; more specifically: A[0] = 1,<br>
 * each of the following elements is generated by multiplying the previous
 * element by 2 or increasing it by 1; <br>
 * more precisely: A = A[i−1] * 2 or A = A[i−1] + 1, for i ≥ 1.<br>
 * For example, for N = 17, the shortest sequence is:<br>
 * A[0] = 1<br>
 * A[1] = 2<br>
 * A[2] = 4<br>
 * A[3] = 8<br>
 * A[4] = 16<br>
 * A[5] = 17<br>
 * Write a function:<br>
 * class Solution { public int solution(int N); }<br>
 * that, given a positive integer N, returns the length of the shortest possible
 * sequence of integers satisfying the above conditions and ending with N.<br>
 * For example, given N = 17, the function should return 6, as explained above.<br>
 * Assume that:.<br>
 * N is an integer within the range [1..2,147,483,647].<br>
 * <b>Complexity:</b><br>
 * expected worst-case time complexity is O(log(N));<br>
 * expected worst-case space complexity is O(1)<br>
 **/

class Solution
{
	public int solution(int N)
	{
		int num = N;
		int total = 0;
		while (num > 0)
		{
			if (num % 2 == 0)
				num = num / 2;
			else
				num -= 1;
			total++;
		}
		return total;
	}
}
