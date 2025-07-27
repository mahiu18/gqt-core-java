package com.gqt.corejava.staticvariables;
class People{
	String name;
	int adhaarnumber;
	static String nationality;
	int DOB;
	static{
		nationality="Indian";
	}
	void allocatedata1() {
		name="Ram";
		adhaarnumber=23243083;
		DOB=05032002;		
	}
	void allocatedata2(){
		name="Suresh";
		adhaarnumber=345630838;
		DOB=22062001;		
	}
	void allocatedata3() {
		name="Kishore";
		adhaarnumber=452330838;
		DOB=21072003;		
	}
	void display1(){
		System.out.println("Name = "+name);
		System.out.println("Adhaar Number = "+adhaarnumber);
		System.out.println("DOB = "+DOB);
		System.out.println("Nationality = "+nationality);
	}
}
public class Myadhaar {

	public static void main(String[] args) {
		People p1=new People();
		People p2=new People();
		People p3=new People();
		p1.allocatedata1();
		p1.display1();
		System.out.println("................");
		p2.allocatedata2();
		p2.display1();
		System.out.println("................");
		p3.allocatedata3();
		p3.display1();
	}
}
