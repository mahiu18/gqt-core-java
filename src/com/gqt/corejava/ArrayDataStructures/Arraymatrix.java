package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

class Arraymatrixoperations{
	long m[][];
	long n[][];
	long p[][];
	int row,col;
	Scanner sc=new Scanner(System.in);
	
	void createarray() {
		//creating array for matrix 1
		System.out.println("Enter number of rows :");
		row=sc.nextInt();
	    System.out.println("Enter number of columns :");
		col=sc.nextInt();
		m=new long[row][col];
		n=new long[row][col];
		p=new long[row][col];
		
		System.out.println("Array is Created ");
		System.out.println("......................");
	}
	void collectdata1() {
		System.out.println("Enter data for Matrix 1:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				System.out.print("Matrix 1 [" + i + "][" + j + "] = ");
				m[i][j] = sc.nextLong();
			}
		}
	}
	void collectdata2() {
		System.out.println("Enter data for Matrix 2:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Matrix 2 [" + i + "][" + j + "] = ");
				n[i][j]=sc.nextLong();
			}
		}
	}
	void addMatrices() {
		System.out.println("Adding the matrices...");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				p[i][j] = m[i][j] + n[i][j];
			}
		}
	}
	
	void displayResult() {
		System.out.println("Result Matrix after Addition:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class Arraymatrix {

	public static void main(String[] args) {
		 Arraymatrixoperations ao=new  Arraymatrixoperations();
		ao.createarray();
		ao.collectdata1();
		ao.collectdata2();
		ao.addMatrices();
		ao.displayResult();
	}

}
