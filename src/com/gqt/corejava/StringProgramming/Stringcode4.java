package com.gqt.corejava.StringProgramming;

public class Stringcode4 {

	public static void main(String[] args) {
		String s1=new String("RAMA");
		String s2=new String("RAMA");
		String s3=new String("rama");
		String s4=new String("SITA");
		System.out.println("case 1 :Same Strings ");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings equal");
		}else {
			System.out.println("Strings not equal");
		}
		System.out.println(".........................");
		if(s1==s2) {
			System.out.println("References equal ");
		}else {
			System.out.println("References not equal ");
		}
		System.out.println("================================");
		
		System.out.println("case 2 :different Strings ");
		if(s1.equalsIgnoreCase(s4)==true) {
			System.out.println("Strings equal");
		}else {
			System.out.println("Strings not equal");
		}
		System.out.println(".........................");
		if(s1==s4) {
			System.out.println("References equal ");
		}else {
			System.out.println("References not equal ");
		}
		System.out.println("================================");
		
		System.out.println("case 3 :Same Strings with different case ");
		if(s1.equalsIgnoreCase(s3)==true) {
			System.out.println("Strings equal");
		}else {
			System.out.println("Strings not equal");
		}
		System.out.println(".........................");
		if(s1==s3) {
			System.out.println("References equal ");
		}else {
			System.out.println("References not equal ");
		}
		System.out.println("================================");

	}

}
