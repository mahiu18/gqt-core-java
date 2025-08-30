package com.gqt.Multithreaded;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Addition Operation Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result = "+res);
		System.out.println("Addition Operation Completed");
		
		System.out.println("Printing operation Started");
		for(int i=1;i<=10;i++) {
			System.out.println("Hello Everyone");
			Thread.sleep(3000);
		}
		System.out.println("Printing operation Completed");
		
		System.out.println("Banking Operation Started");
		System.out.println("Enter the account Number : ");
		int acno=sc.nextInt();
		System.out.println("Enter the Pin Number : ");
		int pin=sc.nextInt();
		System.out.println("Data collected ");
		System.out.println("Banking operation Completed");
	}
}
