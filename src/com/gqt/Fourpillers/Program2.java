package com.gqt.Fourpillers;

import java.util.Scanner;

interface Shapes1 {
    void collect(Scanner sc);
    void calculate();
    double getArea();

    default void display() {
        System.out.println("The Area is : " + getArea());
    }
}

class Circle1 implements Shapes1 {
    private double r;
    private final double pi = 3.147;
    private double area;

    @Override
    public void collect(Scanner sc) {
        System.out.println("Enter the radius : ");
        r = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = pi * r * r;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Rectangle1 implements Shapes1 {
    private double l, b;
    private double area;

    @Override
    public void collect(Scanner sc) {
        System.out.println("Enter the length : ");
        l = sc.nextDouble();
        System.out.println("Enter the breadth : ");
        b = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = l * b;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Square1 implements Shapes1 {
    private double side;
    private double area;

    @Override
    public void collect(Scanner sc) {
        System.out.println("Enter the side : ");
        side = sc.nextDouble();
    }

    @Override
    public void calculate() {
        area = side * side;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Geometry1 {
    void hasShapes(Shapes1 s, Scanner sc) {
        s.collect(sc);
        s.calculate();
        s.display();
    }
}

public class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle1 c = new Circle1();
        Rectangle1 r = new Rectangle1();
        Square1 s = new Square1();

        Geometry1 g = new Geometry1();

        g.hasShapes(c, sc);
        System.out.println("............");
        g.hasShapes(r, sc);
        System.out.println("............");
        g.hasShapes(s, sc);

        sc.close();
    }
}
