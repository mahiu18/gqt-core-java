package com.gqt.corejava.staticvariables;
import java.util.Scanner;

class Farmer {
	double principle;
	static double rate;
	double time;
	double si;
	static {
		rate=2.789;
	}
	
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle =");
		principle=sc.nextDouble();
		System.out.println("Enter the Time =");
		time=sc.nextDouble();
	}
	void calculate() {
		si=(principle*rate*time)/100;
	}
	void displaydata() {
		System.out.println("SI ="+si);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Farmer p1=new Farmer();
		Farmer p2=new Farmer();
		Farmer p3=new Farmer();
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