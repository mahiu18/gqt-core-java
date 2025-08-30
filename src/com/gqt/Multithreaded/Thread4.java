package com.gqt.Multithreaded;

import java.util.Scanner;

class Operation1 extends Thread{
	@Override
	public void run(){
		System.out.println("Addition Operation Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result = "+res);
		System.out.println("Addition Operation Completed");
		sc.close();
		
	}
}
class Operation2 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing operation Started");
		for(int i=1;i<=10;i++) {
			System.out.println("Hello Everyone");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation Completed");
	}
}
class Operation3 extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking Operation Started");
		System.out.println("Enter the account Number : ");
		int acno=sc.nextInt();
		System.out.println("Enter the Pin Number : ");
		int pin=sc.nextInt();
		System.out.println("Data collected ");
		System.out.println("Banking operation Completed");
	}
}
public class Thread4 {
	public static void main(String[] args) {
		Operation1 op1=new Operation1();
		Operation2 op2=new Operation2();
		Operation3 op3=new Operation3();
		op1.start();
		op2.start();
		op3.start();
	}
}
