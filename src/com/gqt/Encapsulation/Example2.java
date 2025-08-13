package com.gqt.Encapsulation;
class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	void setData(String name,String color,String breed,int age,int cost) {
		name=name;
		color=color;
		breed=breed;
		age=age;
		cost=cost;
	}
	void getData() {
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Breed = "+breed);
		System.out.println("Age = "+age);
		System.out.println("Cost = "+cost);
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setData("Rocky","Brown","PUG", 5, 6000);
		d.getData();
	}

}
