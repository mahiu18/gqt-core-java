package com.gqt.corejava.Polymorphism;

class Animal1{
	void drink() {
		System.out.println("Animal will Drink ");
	}
	void eat() {
		System.out.println("Animal will eat ");
	}
	void breath() {
		System.out.println("Animal will breath");
	}
}
class Elephant1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Elephant eat Sugarcane");
	}
	void size() {
		System.out.println("The Elephant size is big");
	}
}
class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("Lion eat Meat");
	}
	void size() {
		System.out.println("The Lion size is medium ");
	}
}
class Rabbit extends Animal1{
	@Override
	void eat() {
		System.out.println("Rabbit eat carrots ");
	}
	void size() {
		System.out.println("The Rabbit size is small ");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Elephant1 e=new Elephant1();
		Lion l=new Lion();
		Rabbit r=new Rabbit();
		
		Animal1 ref;
		ref=e;
		
		ref.drink();
		ref.eat();
		ref.breath();
		e.size();
		System.out.println(".................");
		ref=l;
		
		ref.drink();
		ref.eat();
		ref.breath();
		l.size();
		System.out.println(".................");
		ref=r;
		
		ref.drink();
		ref.eat();
		ref.breath();
		r.size();
	}

}
