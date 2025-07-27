package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern10A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the count: ");
	int n=sc.nextInt();
	//Top
	for(int i=n;i>=1;i--){
		for(int s=1;s<=n-i;s++){
			System.out.print("  ");
			}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print(i+" ");
			}
		System.out.println();
		}
	//Bottom
    for(int i=2;i<=n;i++) {
    	for(int s=1;s<=n-i;s++){
    		System.out.print("  ");
    		}
    	for(int k=1;k<=2*i-1;k++){
    		System.out.print(i+" ");
    		}
    	System.out.println();
    	}
    sc.close();
	}
}
