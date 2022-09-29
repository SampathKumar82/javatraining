package com.subex.cg;

public class ArmStrongNumber {
	
	/**
	 * Check given number is an Armstrong number
	 * class Name is ArmStrNumber
	 * @param args
	 */
	public static boolean isArmStrNumber(int num) {
		int sum = 0;
		if(num < 0) {
			return false;
		}
		
		else if(num >= 0 && num <= 9) {
			return true;
		}
		else
		{
			int power = power(num);
			int copyNum = num;
		
			while (copyNum != 0) {
				int lastDigit = copyNum % 10;
				int factor = 1;
				for(int i = 0; i < power; i++) {
					factor = factor * lastDigit;
				}
				sum = sum + factor;
				copyNum = copyNum / 10;
			}
		}
	
		if (sum == num) {
			return true;
		}
		return false;
	}
	
	private static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(isArmStrNumber(0));
		System.out.println(isArmStrNumber(9));
		System.out.println(isArmStrNumber(-1));
		System.out.println(isArmStrNumber(153));
		System.out.println(isArmStrNumber(370));
		System.out.println(isArmStrNumber(371));		
		System.out.println(isArmStrNumber(407));
	}

}

