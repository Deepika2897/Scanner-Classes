package com.generalprograms;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args)
	{
		//declared variables
		int num1,num2,product;
		//create scanner class object
		Scanner scanner=new Scanner(System.in);
		//read values from keyboard
		System.out.println("Enter first value:");
		num1=scanner.nextInt();
		System.out.println("Enter second value:");
		num2=scanner.nextInt();
		//write logic or operation
		product=num1*num2;
		System.out.println("product:"+product);
		scanner.close();
	}

}
