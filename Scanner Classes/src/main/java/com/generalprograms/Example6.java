package com.generalprograms;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
double length=scanner.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		double width=scanner.nextDouble();
		//area =length*width;
		double area=length*width;
		System.out.println("Area of rectangle is:"+area);
	
	scanner.close();

}
}