package com.gqt.corejava.staticvariables;
class Calculator{
	void add(int a,int b) {
		int res=a+b;
		 System.out.println(res);
	}
	void sub(int a,int b) {
		int res=a-b;
		System.out.println(res);
	}
}
public class Launch2 {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(10,20);
		c1.sub(30, 20);
	}
}
