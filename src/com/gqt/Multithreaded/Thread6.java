package com.gqt.Multithreaded;
//Daemon threads 
class Microsoftword1 extends Thread{
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
//Primary operation
	public void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
//secondary operation
	public void checking() {
		try {
			for(;;) {
				System.out.println("Checking in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//secondary operation
	public void saving() {
		try {
			for(;;) {
				System.out.println("saving in progress.....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread6 {
	public static void main(String[] args) {
		Microsoftword1 ms1=new Microsoftword1();
		ms1.setName("typing");
		Microsoftword1 ms2=new Microsoftword1();
		ms2.setName("checking");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		Microsoftword1 ms3=new Microsoftword1();
		ms3.setName("saving");
		ms3.setPriority(9);
		ms3.setDaemon(true);
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		System.out.println(".......................");
		ms1.start();
		ms2.start();
		ms3.start();

	}
}
