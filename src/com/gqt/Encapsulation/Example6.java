package com.gqt.Encapsulation;
class calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(double a,float b) {
		return a+b;
	}
	double add(float a,double b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(int a,double b,float c) {
		return a+b+c;
	}
	double add(double a,int b,float c) {
		return a+b+c;
	}
	double add(float a,int b,double c) {
		return a+b+c;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float m=10.11f,n=20.22f,o=30.33f;
		double p=10.111,q=20.222,r=30.333;
		
		calculator c1=new calculator();
		System.out.println(c1.add(a, b));
        System.out.println(c1.add(a,p,m));
        System.out.println(c1.add(m, b));
        System.out.println(c1.add(a,n));
        System.out.println(c1.add(a,m,p));
        System.out.println(c1.add(p,a,o));
	}

}
