package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

class Arraymoviecode{
	long arr[][][];
	long investment;
	long previous_year;
	long sum_revenue;
	Scanner sc=new Scanner(System.in);
	
	void createdata() {
		System.out.println("Enter language count :");
		int lan=sc.nextInt();
	    System.out.println("Enter category in each language :");
		int cat=sc.nextInt();
		System.out.println("Enter movies count in each category :");
		int mov=sc.nextInt();
		arr=new long[lan][cat][mov];
		System.out.println("Array is Created ");
		//
		System.out.println("Enter the Investment made : ");
		investment=sc.nextLong();
		System.out.println("Enter the Previous year revenue : ");
		previous_year=sc.nextLong();
		System.out.println("......................");
	}
	void collectmovrevenue() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Language no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category no :"+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the revenue generated in movie no :"+(k+1));
					arr[i][j][k]=sc.nextLong();
					sum_revenue+=arr[i][j][k];
				}
			}
		}
		System.out.println("Data is collected & calculated  ");
		System.out.println("......................");
	
	}
	void displaydata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Language no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" Inside Category no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The revenue of the movie no "+(k+1)+" is = " + arr[i][j][k]);
				}
			}
			
		}
		System.out.println("------------------");
		if(sum_revenue>investment) {
			long profit=sum_revenue-investment;
			System.out.println("The profit hemanth made is "+profit);
			System.out.println("......................");
			if(profit>previous_year) {
				System.out.println("Hemanth had made more profit than previous year ");
			}else {
				System.out.println("Hemanth had made less profit than previous year ");
			}
		}
		else {
			System.out.println("Hemanth is in loss side compare to previous year around :"+(investment - sum_revenue));
		}
		System.out.println("......................");
	}
}
public class Arraymovie {

	public static void main(String[] args) {
		Arraymoviecode mv=new Arraymoviecode();
		mv.createdata();
		mv.collectmovrevenue();
		mv.displaydata();
	}

}
