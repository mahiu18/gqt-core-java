package com.gqt.Relationships;

class Brain{
	double weight;
	float Iq;
	
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.Iq = iq;
	}

	public double getWeight() {
		return weight;
	}

	public float getIq() {
		return Iq;
	}
	
}

class Heart{
	double Size;
	int valves;
	
	public Heart(double size, int valves) {
		super();
		this.Size = size;
		this.valves = valves;
	}

	public double getSize() {
		return Size;
	}

	public int getValves() {
		return valves;
	}
	
}

class Human{
	Brain bn = new Brain(30, 82.7f);
	Heart h = new Heart(45, 4);
}


class Book{
	String name;
	int cost;
	
	public Book(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
}

class Mobile1{
	String company;
	String  name;
	
	public Mobile1(String company, String name) {
		super();
		this.company = company;
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}
	public String getName() {
		return name;
	}
	
}

class Student extends Human{
	
	void hasBook(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getCost());
		System.out.println("...........................");
	}
	
	void hasMobile(Mobile1 m) {
		System.out.println(m.getCompany());
		System.out.println(m.getName());
		System.out.println("...........................");
	}
	
} 

public class Launch {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Book bk = new Book("I Too had a Love Story" , 160);
		Mobile1 m = new Mobile1("Apple","Iphone15");
		
		System.out.println(s.bn.getWeight());
		System.out.println(s.bn.getIq());
		System.out.println("...........................");

		System.out.println(s.h.getSize());
		System.out.println(s.h.getValves());
		System.out.println("...........................");

		s.hasBook(bk);
		s.hasMobile(m);
	}
}
