package com.gqt.corejava.staticvariables;
class Program1{
	int a,b,c;
	static int p,q,r;

{
	a=10;
	b=20;
	c=30;
}
static {
	p=100;
	q=200;
	r=300;
}
void display1() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
static void display2() {
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
}
}
public class Launch3
{

	public static void main(String[] args) 
	{
		Program1.display2();
		Program1 p1=new Program1();
		p1.display1();
		p1.display2();
	}
}
