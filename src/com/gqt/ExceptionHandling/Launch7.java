package com.gqt.ExceptionHandling;

import java.util.Scanner;

class Operation1{ //Srinivas
	void function1() throws Exception {
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
class Operation2{ //anil
	void function2() throws Exception {
		System.out.println("Inside Function-2");
		Operation1 op1=new Operation1();
		op1.function1();
		System.out.println("Outoff Function-2");
	}
}
class Operation3{  //bheemesh
	void function3(){
		System.out.println("Inside Function-3");
		Operation2 op2=new Operation2();
		try {
			op2.function2();
		} catch (Exception e) {
			System.out.println("Exception occured and handled in function-3 ");
		}
		System.out.println("Outoff Function-3");
	}
}
public class Launch7 { //gowthami
	public static void main(String[] args){
		System.out.println("Inside Main Function");
		Operation3 op3=new Operation3();
		op3.function3();
		System.out.println("Outoff main Function");
	}
}
