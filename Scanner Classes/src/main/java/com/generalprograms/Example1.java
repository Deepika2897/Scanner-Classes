package com.generalprograms;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Example1

{
    public static void main( String[] args )
    {//declared variables
      int num1,num2,sum;
      //create scanner class object
      Scanner scanner = new Scanner(System.in);
      //read values from keyboard
    		  System.out.println("Enter first value:");
    		  num1= scanner.nextInt();
    		  System.out.println("Enter the second value:");
    		  num2= scanner.nextInt();
    	//write logic or operation
    		  sum=num1+num2;
    		  System.out.println("Sum:"+sum);
    		  scanner.close();
      
    }
}
