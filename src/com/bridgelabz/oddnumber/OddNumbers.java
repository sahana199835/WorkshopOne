package com.bridgelabz.oddnumber;

public class OddNumbers {

	public static void main(String[] args) {
		
		int N = 10, sum=0;
		System.out.println("list the odd numbers");
		
		for (int i=1; i<=10;i++) {
			if(i%2!=0) {
				sum +=i;
				System.out.println(i + " ");
				System.out.println("Sum of all odd numbers between 1 to  " + N + " = " +sum);
			}
		}

	}

}
