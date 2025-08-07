package com.gqt.corejava.StringProgramming;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Ramayana. ");
		StringBuffer sb2=new StringBuffer("Is the best Mythological Story ");
	
		sb1.append(sb2);
		System.out.println(sb1);
		
		System.out.println("......................");
		
		StringBuilder sb3=new StringBuilder("Mahabharata. ");
		StringBuilder sb4=new StringBuilder("Is the best Mythological History ");
	
		sb3.append(sb4);
		System.out.println(sb3);
	}
}
