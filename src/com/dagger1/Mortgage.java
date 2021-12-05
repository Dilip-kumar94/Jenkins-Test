package com.dagger1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		int years=0;
		double loanAmount;
		double interest;
		double rateOfInterest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Loan Amount: ");
		loanAmount=sc.nextDouble();
		System.out.println("Enter the Interest: ");
		interest=sc.nextDouble();
		System.out.println("Enter the No.of.Years: ");
		years=sc.nextInt();
		rateOfInterest=interest/12/100;
		double numerator= loanAmount* rateOfInterest * Math.pow((1+rateOfInterest), (years*12));
		double denominator=Math.pow((1+rateOfInterest), (years*12))-1;
		double result =numerator/denominator;
		System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance(Locale.US).format(result));
		sc.close();
		}

}
