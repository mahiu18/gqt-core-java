package com.gqt.Encapsulation;
class Dog1{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	void setData(String name,String color,String breed,int age,int cost) {
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
	}
	void getData() {
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Breed = "+breed);
		System.out.println("Age = "+age);
		System.out.println("Cost = "+cost);
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.setData("Rocky","Brown","PUG", 5, 6000);
		d.getData();
	}

}
