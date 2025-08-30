package com.gqt.ExceptionHandling;

import java.util.Scanner;

class Operation11{
	void function11() throws Exception {
		System.out.println("Inside Function-1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Division Operation");
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();//critical statement -- InputMismatchException
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();//critical statement -- InputMismatchException
		int res = n1 / n2;//critical statement -- ArithmeticException
		System.out.println(res);
		System.out.println("Outoff Function-1");
		sc.close();
	}
}
class Operation22{
	void function22() throws Exception {
		System.out.println("Inside Function-2");
		Operation11 op1=new Operation11();
		op1.function11();
		System.out.println("Outoff Function-2");
	}
}
class Operation33{ 
	void function33() throws Exception {
		System.out.println("Inside Function-3");
		Operation22 op2=new Operation22();
		try {
			op2.function22();
		} catch (Exception e) {
			System.out.println("Exception occured and handled in function-3 ");
			throw e;
		}
		System.out.println("Outoff Function-3");
	}
}
public class Launch8 { 
	public static void main(String[] args) throws Exception {
		System.out.println("Inside Main Function");
		Operation33 op3=new Operation33();
		op3.function33();
		System.out.println("Outoff main Function");
	}
}
