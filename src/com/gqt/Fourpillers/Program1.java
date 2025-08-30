package com.gqt.Fourpillers;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collect(Scanner sc);
	abstract void calculate();
	void display() {
		System.out.println("The Area is : "+area);
	}
	
}
class Circle extends Shapes{
	private double r;
	private final double pi=3.147;
	
	@Override
	void collect(Scanner sc) {
	System.out.println("Enter the radius : ");
	r=sc.nextDouble();
	}

	@Override
	void calculate() {
		area=pi*r*r;	
	}
	
}
class Rectangle extends Shapes{
	private double l,b;

	@Override
	void collect(Scanner sc) {
	System.out.println("Enter the length : ");
	l=sc.nextDouble();
	System.out.println("Enter the breadth : ");
	b=sc.nextDouble();
	}

	@Override
	void calculate() {
		area=l*b;
	}
	
}
class Square extends Shapes{
	private double side;

	@Override
	void collect(Scanner sc) {
	System.out.println("Enter the side : ");
	side=sc.nextDouble();
	}

	@Override
	void calculate() {
		area=side*side;
	}
}
class Geometry{
	void hasShapes(Shapes s,Scanner sc) {
		s.collect(sc);
		s.calculate();
		s.display();
	}
}

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		
		Geometry g=new Geometry();
		
		g.hasShapes(c,sc);
		System.out.println("............");
		g.hasShapes(r,sc);
		System.out.println("............");
		g.hasShapes(s,sc);
	}
}
