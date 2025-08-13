package com.gqt.Abstraction;

abstract class Animal12{
	abstract void drink();
	abstract void eat();
	void breath() {
		System.out.println("Animal will breath");
	}
}
class Elephant12 extends Animal12{
	@Override
	void drink() {
		System.out.println("Elephnat drinks more water ");
	}
	@Override
	void eat() {
		System.out.println("Elephant eat Sugarcane");
	}
	void size() {
		System.out.println("The Elephant size is big");
	}
}
class Lion12 extends Animal12{
	@Override
	void drink() {
		System.out.println("Lion drinks water ");
	}
	@Override
	void eat() {
		System.out.println("Lion eat Meat");
	}
	void size() {
		System.out.println("The Lion size is medium ");
	}
}
class Rabbit12 extends Animal12{
	@Override
	void drink() {
		System.out.println("Rabbit drinks less water ");
	}
	@Override
	void eat() {
		System.out.println("Rabbit eat carrots ");
	}
	void size() {
		System.out.println("The Rabbit size is small ");
	}
}
class Jungle{
	void permit(Animal12 ref) {
		ref.drink();
		ref.eat();
		ref.breath();
	}
}
public class Example2 {

	public static void main(String[] args) {
		Elephant12 e=new Elephant12();
		Lion12 l=new Lion12();
		Rabbit12 r=new Rabbit12();
		
		Jungle j=new Jungle();
		j.permit(e);
		e.size();
		System.out.println(".................");
		j.permit(l);
		l.size();
		System.out.println(".................");
		j.permit(r);
		r.size();
		System.out.println(".................");
		
		Animal12 a=new Animal12() {
			
			@Override
			void eat() {
			     System.out.println("Eat");
				
			}
			
			@Override
			void drink() {
				System.out.println("Drink");
				
			}
		};
		a.eat();
		a.drink();
		a.breath();
	}

}

