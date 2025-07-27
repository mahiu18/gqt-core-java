package com.gqt.corejava.datatypes;

import java.util.Scanner;

public class WrapperExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the byte data :");
		Byte b=new Byte(sc.nextByte());
		System.out.println("The byte data :"+b);
		System.out.println("-------------------");
		System.out.println("Enter the short data :");
		Short s=new Short(sc.nextShort());
		System.out.println("The short data :"+s);
		System.out.println("-------------------");
		System.out.println("Enter the integer data :");
		Integer i=new Integer(sc.nextInt());
		System.out.println("The Integer data :"+i);
		System.out.println("-------------------");
		System.out.println("Enter the Long data :");
		Long l=new Long(sc.nextLong());
		System.out.println("The Long data :"+l);
		System.out.println("-------------------");
		System.out.println("Enter the Float data :");
		Float f=new Float(sc.nextFloat());
		System.out.println("The Float data :"+f);
		System.out.println("-------------------");
		System.out.println("Enter the Double data :");
		Double d=new Double(sc.nextDouble());
		System.out.println("The double data :"+d);
		System.out.println("-------------------");
		System.out.println("Enter the Character data :");
		Character c=new Character('a');
		System.out.println("The Character data :"+c);
		System.out.println("-------------------");
		System.out.println("Enter the String data :");
		sc.nextLine();
		String str=new String(sc.nextLine());
		//sc.nextLine();
		System.out.println("The String data :"+str);
		System.out.println("-------------------");
		System.out.println("Enter the boolean data :");
		Boolean bl=new Boolean(sc.nextBoolean());
		System.out.println("The boolean data :"+bl);
		System.out.println("-------------------");
		sc.close();
	}

}
