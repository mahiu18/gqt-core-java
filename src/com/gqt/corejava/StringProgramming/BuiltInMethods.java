package com.gqt.corejava.StringProgramming;

public class BuiltInMethods {

	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		//1.length()
		int len=str.length();//it will provide the total length of the string 
		System.out.println("The length of the string is :"+len);
		
		//2.charAt()
		char c1=str.charAt(0);//it will provide the character at the specified position 
		System.out.println("The character at 0th position is :"+c1);
		
		//char c=str.charAt(100);//it leads to the IndexOutOfBounds exception as we have only 21 positions in string
		//System.out.println("The character at 0th position is :"+c);
		
		//3.concat()
		String str1=str.concat(" is the best batsman in the world"); //it merges the two strings 
		System.out.println(str1);
		
		System.out.println("........contains............");
	    //4.contains()
		boolean res1=str.contains("Ramesh");//it will check if substring is available in main string 
		System.out.println(res1);
		
		System.out.println("..........endswith.............");
		//5.endsWith()
		boolean res2=str.endsWith("Tendulkar");//it will check if the substring present at the end of main string 
		System.out.println(res2);
		
		System.out.println(".........startswith.............");
		//6.startsWith()
		boolean res3=str.startsWith("Sachin");//it will check if the substring present at the start of main string 
		System.out.println(res3);
		
		//7.getClass()
		Class class1=str.getClass();//it will provide the root class path of the object
		System.out.println(class1);
		
		//8.hashCode()
		int in1= str.hashCode();//it will return the hash value of the given object
		System.out.println(in1);
		
		//9.indexOf()
		int in2=str.indexOf('S');//it will provide the index of the specified character in the main string
		System.out.println(in2);
		
		System.out.println("..........Blank...............");
		//10.isBlank()
		boolean res4=str.isBlank();//checks if the string is empty or has only spaces 
		System.out.println(res4);
		String str21="      ";
		res4=str21.isBlank();//checks if the string is empty or has only spaces 
		System.out.println(res4);
		String str22="";
		res4=str22.isBlank();//checks if the string is empty or has only spaces 
		System.out.println(res4);
		
		System.out.println("..............Empty.................");
		//11.isEmpty()
		boolean res5=str.isEmpty();//check if the string is empty
		System.out.println(res5);
		String str31="     ";
		res5=str31.isEmpty();
		System.out.println(res5);
		String str32="";
		res5=str32.isEmpty();
		System.out.println(res5);
				
		
		//12.lastIndexOf()
		int c2= str.lastIndexOf('R');//it will provide the last occurrence position of the specified character
		System.out.println(c2);
		
		//13.replace()
		String str4=str.replace('S','$');//it will replace the old character with new character 
		System.out.println(str4);
		
		//14.substring(int start)
		String in3=str.substring(6);//it provide the substring from the specified position 
		System.out.println(in3);
		
		//15.Substring(int start,int end)
		String in4=str.substring(0,12);//it provide the substring from the specified position to the specified position
		System.out.println(in4);
		
		//16.toUpperCase()
		String str5=str.toUpperCase();//convert string to uppercase 
		System.out.println(str5);
		
		//17.toLowercase()
		String str6=str.toLowerCase();//convert string to lowercase
		System.out.println(str6);
	}
}
