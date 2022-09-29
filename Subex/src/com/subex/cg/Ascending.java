package com.subex.cg;

public class Ascending {
	public static int numberCheck() {
		int num=1000,i, count=1000000;
		for(i=0;i<=num;i++) {
			if(num%i==0); {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int i, count;
		numberCheck();
		if(count==0); {
			System.out.println("numberCheck");
		}
	}

}