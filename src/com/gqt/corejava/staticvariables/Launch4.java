package com.gqt.corejava.staticvariables;

import java.util.Scanner;

class Program2{
	double principle;
	double rate;
	double time;
	double si;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle =");
		principle=sc.nextDouble();
		System.out.println("Enter the Time =");
		time=sc.nextDouble();
		rate=2.789;
	}
	void calculate() {
		si=(principle*rate*time)/100;
	}
	void displaydata() {
		System.out.println("SI ="+si);
	}
}
public class Launch4 {

	public static void main(String[] args) {
		
		Program2 p1=new Program2();
		Program2 p2=new Program2();
		Program2 p3=new Program2();
		System.out.println("farmer-1");
		p1.collectData();
		p1.calculate();
		p1.displaydata();
		System.out.println("...............");
		System.out.println("farmer-2");
		p2.collectData();
		p2.calculate();
		p2.displaydata();
		System.out.println("...............");
		System.out.println("farmer-3");
		p3.collectData();
		p3.calculate();
		p3.displaydata();
	}

}
