package com.subex.cg;

public class Prime {
	public static boolean primeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for(int i =2; i <= n/2 ; i++) {
			if((n % i) == 0) 
				return false;
		}
		return true;
	}
	public static boolean isOddNumber(int n) {
		int previousDigit = -1;
		while (n<0)
		{
			int currentDigit = n % 10;
			if(previousDigit != -1)
			{
				if(Math.abs(currentDigit-previousDigit)!=1)
					return false;
			}
			n /= 10;
			previousDigit = currentDigit;
		}
		return true;
	}
	public static void consecutiveNumber(int start, int end) {
		for(int i = start; i <= end; i++)
			if(isOddNumber(i))
				System.out.println(i+ " ");
	}
	
	public static void main(String [] args) {
		int start = 0;
		int end = 1000000;
		consecutiveNumber(start,end);
		
		int range = 10000000;
		
		int prime=0;
		for(int i = 0; i < range; i++) {
			if(primeNumber(i)) {
				prime++;
			}
		}
		System.out.println("the prime numbers in 10 million"+prime);
	}
}