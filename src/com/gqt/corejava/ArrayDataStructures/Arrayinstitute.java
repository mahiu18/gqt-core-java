package com.gqt.corejava.ArrayDataStructures;
import java.util.Scanner;
class Arrayoperationinstitute1 {
	String arr[][][];
	long m_annual;
	long e_annual;
	long d_annual;
	long total_revenue;
	Scanner sc = new Scanner(System.in);
    //Creating array 
	void createarray() {
		System.out.println("Enter college count :");
		int clg=sc.nextInt();
		arr=new String[clg][][];
		
		//collect college count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classrooms inside college no :"+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		//collecting student count 
		for(int i=0;i<arr.length;i++) {
			System.out.println(" Inside college no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of capacity inside classroom no :"+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}
		System.out.println("......................");
		
		System.out.println("Enter the annual fee  of medical college : ");
		m_annual=sc.nextLong();
		System.out.println("Enter the annual fee of engineering college : ");
		e_annual=sc.nextLong();
		System.out.println("Enter the annual fee of degree college : ");
		d_annual=sc.nextLong();
		System.out.println("......................");
		System.out.println("Array is Created ");
		System.out.println("......................");
	}

	void collectrevenuedata() {
		for (int i=0;i<arr.length;i++) {
			System.out.println("Inside college no :"+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Inside classroom no :"+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the student name with capacity no  :"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data is collected ");
		System.out.println("......................");

	}
	void displaydata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside classroom no :" + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The name  of student with classroom no :" + (j+ 1)+" is = " + arr[i][j][k]);
				}
			}
		}
		System.out.println("......................");
	}
	void calculateTotalFees() {
		long totalFees = 0;
		for(int i=0;i<arr.length;i++) {
			int studentCount = 0;
			// Count students in each college
			for(int j=0;j<arr[i].length;j++) {
				studentCount += arr[i][j].length;
			}
			long feePerStudent = 0;
			// Assign fees based on college index
			if (i == 0) {
				feePerStudent = m_annual;
			} else if (i == 1) {
				feePerStudent = e_annual;
			} else if (i == 2) {
				feePerStudent = d_annual;
			} else {
				System.out.println("No fee data defined for college no: " + (i + 1));
			}
			long collegeTotal = feePerStudent * studentCount;
			
			totalFees += collegeTotal;

			System.out.println("Total fee collected from College no " + (i + 1) + " = " + collegeTotal);
		}
		System.out.println("Overall fee collected from all colleges = " + totalFees);
	}

}

public class Arrayinstitute {

	public static void main(String[] args) {
		Arrayoperationinstitute1  ao =new Arrayoperationinstitute1();
		ao.createarray();
		ao.collectrevenuedata();
		ao.displaydata();
		ao.calculateTotalFees();
	}

}
