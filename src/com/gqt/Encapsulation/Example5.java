package com.gqt.Encapsulation;

import java.util.Scanner;

class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class Example5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name=sc.nextLine();
		System.out.println("Enter the Color :");
		String color=sc.nextLine();
		System.out.println("Enter the Breed :");
		String breed=sc.nextLine();
		System.out.println("Enter the Age :");
		int age=sc.nextInt();
		System.out.println("Enter the Cost :");
		int cost=sc.nextInt();
		
		Dog3 d=new Dog3();
		d.setName(name);
		d.setColor(color);
		d.setBreed(breed);
		d.setAge(age);
		d.setCost(cost);
		System.out.println();
		System.out.println("The Data is ........");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
		sc.close();
	}

}
