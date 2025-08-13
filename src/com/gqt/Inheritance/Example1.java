package com.gqt.Inheritance;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal zero Parametarized Constructor is invoked");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal Parametarized Constructor is invoked");
		System.out.println("The animal constructor received the message as :"+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello from Elephant");
		System.out.println("Hi from Elephant constructor");
	}
	public Elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		System.out.println(name);
		System.out.println(weight);
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Elephant e=new Elephant();
		System.out.println("....................");
		Elephant e1=new Elephant("Ramu",2000);

	}

}
