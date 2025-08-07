package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

class Arraymatrixoperations1{
	long m[][];
	long n[][];
	long p[][];
	int row1,col1,row2,col2;
	Scanner sc=new Scanner(System.in);
	
	void createarray() {
		//creating array for matrix 1
		System.out.println("Enter number of rows :");
		row1=sc.nextInt();
	    System.out.println("Enter number of columns :");
		col1=sc.nextInt();
		m=new long[row1][col1];
		//creating array for matrix 2
		System.out.println("Enter number of rows :");
		row2=sc.nextInt();
		System.out.println("Enter number of columns :");
		col2=sc.nextInt();
		n=new long[row2][col2];
		if (col1!=row2) {
			System.out.println("Matrix multiplication not possible ");
			System.exit(0);
		}

		// Result matrix
		p = new long[row1][col2];
		
		System.out.println("Array is Created ");
		System.out.println("......................");
	}
	void collectdata1() {
		System.out.println("Enter data for Matrix 1:");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++){
				System.out.print("Matrix 1 [" + i + "][" + j + "] = ");
				m[i][j] = sc.nextLong();
			}
		}
	}
	void collectdata2() {
		System.out.println("Enter data for Matrix 2:");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print("Matrix 2 [" + i + "][" + j + "] = ");
				n[i][j]=sc.nextLong();
			}
		}
	}
	void calculate() {
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < col1; k++) {
					p[i][j] += m[i][k] * n[k][j];
				}
			}
		}
	}
	
	void displayResult() {
		System.out.println("Result Matrix after Multiplication :");
		for (int i = 0; i <p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class Arraymatrix2 {

	public static void main(String[] args) {
		 Arraymatrixoperations1 ao=new  Arraymatrixoperations1();
		ao.createarray();
		ao.collectdata1();
		ao.collectdata2();
		ao.calculate();
		ao.displayResult();
	}

}
