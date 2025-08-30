package com.gqt.Multithreaded;
//Race Condition
class Microsoftword extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")){
			typing();
			
		}else if(Thread.currentThread().getName().equals("checking")){
			checking();
		}
		else{
			saving();
		}	
	}

	public void saving() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checking() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Checking in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("saving in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread5 {
	public static void main(String[] args) {
		Microsoftword ms1=new Microsoftword();
		ms1.setName("typing");
		Microsoftword ms2=new Microsoftword();
		ms2.setName("checking");
		Microsoftword ms3=new Microsoftword();
		ms3.setName("saving");
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		System.out.println(".......................");
		ms1.start();
		ms2.start();
		ms3.start();
	}
}
