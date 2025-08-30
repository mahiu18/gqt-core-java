package com.gqt.corejava.Polymorphism;

class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class cargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("cargoplane flys at low heights");
	}
	void carryGoods() {
		System.out.println("cargoplane carries goods");
	}
	
}
class passengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("passengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("passengerPlane carries humans");
	}
}
class fighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("fighterPlane flys at high heights");
	}
	void carryWeapons() {
		System.out.println("fighterPlane carries weapons");
	}
}

public class Example1 {

	public static void main(String[] args) {
		cargoPlane cp=new cargoPlane();
		passengerPlane pp=new passengerPlane();
		fighterPlane fp=new fighterPlane();
		
		Plane ref;
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("....................");
		ref=pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println(".....................");
		ref=fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
	}
}
