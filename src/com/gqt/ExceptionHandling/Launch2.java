package com.gqt.ExceptionHandling;

import java.util.Scanner;
//try with single catch block
public class Launch2 {
	public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int n1=sc.nextInt();//critical statement
		System.out.println("Enter the second number ");
		int n2=sc.nextInt();//critical statement
		
		int res=n1/n2;//critical statement
		
		System.out.println(res);
		sc.close();
	   }
	catch (Exception e) {
		System.out.println("Exception Occured and handled in catch block.");
	}
 }

}
