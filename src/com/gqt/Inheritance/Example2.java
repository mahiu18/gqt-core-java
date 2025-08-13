package com.gqt.Inheritance;

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

public class Example2 {

	public static void main(String[] args) {
		cargoPlane cp=new cargoPlane();
		passengerPlane pp=new passengerPlane();
		fighterPlane fp=new fighterPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("....................");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println(".....................");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}
}
