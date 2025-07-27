package com.gqt.corejava.datatypes;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the byte data :");
		byte b=sc.nextByte();
		System.out.println("The byte data :"+b);
		System.out.println("------------------------");
		System.out.println("Enter the short data :");
		short s=sc.nextShort();
		System.out.println("The short data :"+s);
		System.out.println("------------------------");
		System.out.println("Enter the int data :");
		int i=sc.nextInt();
		System.out.println("The int data :"+i);
		System.out.println("------------------------");
		System.out.println("Enter the long data :");
		long l=sc.nextLong();
		System.out.println("The long data :"+l);
		System.out.println("------------------------");
		System.out.println("Enter the float data :");
		float f=sc.nextFloat();
		System.out.println("The float data :"+f);
		System.out.println("------------------------");
		System.out.println("Enter the double data :");
		double d=sc.nextDouble();
		System.out.println("The double data :"+d);
		System.out.println("------------------------");
		System.out.println("Enter the String data :");
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println("The string data :"+str);
		System.out.println("------------------------");
		sc.close();
	}

}
