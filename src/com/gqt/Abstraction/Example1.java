package com.gqt.Abstraction;

abstract class Test{
	void land() {
		System.out.println("Plane lands");
	}
}
abstract class Plane1{
	abstract void takeOff();
	abstract void fly();
	void land() {
		System.out.println("Plane lands");
	}
}
class cargoPlane1 extends Plane1{
	@Override
	void takeOff() {
		System.out.println("cargo planes require long runway ");
	}
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
	void takeOff() {
		System.out.println("passenger planes require medium runway ");
	}
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
	void takeOff() {
		System.out.println("fighter planes require small runway ");
	}
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

public class Example1 {

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
		System.out.println(".....................");
		
		//Plane1 p=new Plane1(); 
				
		Plane1 p1=new Plane1(){
			
			@Override
			void takeOff() {
				System.out.println("takeOff");
				
			}
			
			@Override
			void fly() {
				System.out.println("Fly");
			}
		};
		p1.takeOff();
		p1.fly();
		p1.land();
		
		Test t=new Test() {};
	}
}
