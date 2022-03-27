

package com.generalprograms;

import java.util.Scanner;


public class Example4 {

	public static void main(String[] args) {
		// write a java program to validate the given no is positive,if positive then find it is even or odd using nested if
		int number;
		Scanner scanner=new Scanner(System.in);
				System.out.println("Enter any number:");
		number=scanner.nextInt();
		if(number>0)
			{
			if(number%2==0)
			{
				System.out.println("the number is an even");
			}
			else
			{
				System.out.println("the number is an odd");
			}
			}
		else
		{System.out.println("the number is negative");
			}
		scanner.close();
	}
			}

