package com.dagger1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		final int CONST3=3;
		final int CONST5=5;
		int value=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		value=sc.nextInt();
		if(value%CONST5==0) {
			System.out.print("Fizz");
		}
		if(value%CONST3==0) {
			System.out.print("Buzz");
		}
		if(value%CONST3!=0 && value%CONST5!=0) {
			System.out.print(value);
		}
		sc.close();
		
	}

}
