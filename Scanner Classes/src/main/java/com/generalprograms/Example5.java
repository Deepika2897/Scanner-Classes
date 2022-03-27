package com.generalprograms;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int r;
		double pi=3.14,perimeter;

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter radius of circle:");
		r=scanner.nextInt();
		perimeter=(2*pi*r);
		System.out.println("perimeter of circle:"+perimeter);
	
	scanner.close();

	}

}
