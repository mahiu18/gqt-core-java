package com.gqt.Relationships;

class Os{
	String version_name;
	double version_number;
	
	public Os(String version_name, double version_number) {
		super();
		this.version_name = version_name;
		this.version_number = version_number;
	}

	public String getVersion_name() {
		return version_name;
	}

	public double getVersion_number() {
		return version_number;
	}
	
}

class Charger{
	
	String company;
	double voltage;
	
	public Charger(String company, double voltage) {
		super();
		this.company = company;
		this.voltage = voltage;
	}
	
	public String getCompany() {
		return company;
	}
	public double getVoltage() {
		return voltage;
	}
	
}
class Mobile{
	
	Os os = new Os("Windows" ,12.7);
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
		
	}
}

public class LauncMobile {
	public static void main(String[] args) {
		
		Charger c = new Charger("HP",18);
		Mobile m = new Mobile();
		
		System.out.println(m.os.version_number);
		System.out.println(m.os.version_name);
		System.out.println(".....................................");
		
		m.hasCharger(c);
		System.out.println(".....................................");

		m=null;
		
//		System.out.println(m.os.version_number);
//		System.out.println(m.os.version_name);
		
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
	}
}
