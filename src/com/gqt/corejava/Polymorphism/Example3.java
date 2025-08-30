package com.gqt.Polymorphism;

class Plane1{
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
class cargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("cargoplane flys at low heights");
	}
	void carryGoods() {
		System.out.println("cargoplane carries goods");
	}
	
}
class passengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("passengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("passengerPlane carries humans");
	}
}
class fighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("fighterPlane flys at high heights");
	}
	void carryWeapons() {
		System.out.println("fighterPlane carries weapons");
	}
}
class Airport{
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Example3 {

	public static void main(String[] args) {
		cargoPlane1 cp=new cargoPlane1();
		passengerPlane1 pp=new passengerPlane1();
		fighterPlane1 fp=new fighterPlane1();
		
		Airport ap=new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("....................");
		ap.permit(pp);
		pp.carryHumans();
		System.out.println(".....................");
		ap.permit(fp);
		fp.carryWeapons();
	}
}
