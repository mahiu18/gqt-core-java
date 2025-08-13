package com.gqt.Encapsulation;

/**class Object{
      object(){
    	  ///////
      }
   }*/
//Orphan class
class Dog12{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//Zero Parametarized 
	public Dog12(){
		
		super();
		
		System.out.println("Inside the zero Parametarized");
		this.name="Ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="Pumorian";
		
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("..............................");
	}
	
	//One Parametarized 
		public Dog12(String name){
			
			this();
			
			System.out.println("Inside the one Parametarized");
			this.name=name;
			
			System.out.println(name);
			System.out.println(color);
			System.out.println(cost);
			System.out.println(age);
			System.out.println(breed);
			System.out.println("..............................");
		}
	            //Two Parametarized 
				public Dog12(String name,String color){
					
					this("Chintu");
					
					System.out.println("Inside the two Parametarized");
					this.name=name;
					this.color=color;
					
					System.out.println(name);
					System.out.println(color);
					System.out.println(cost);
					System.out.println(age);
					System.out.println(breed);
					System.out.println("..............................");
				}
	            //Three Parametarized 
				public Dog12(String name,String color,int cost){
					
					this("Tommy","Blue");
					
					System.out.println("Inside the three Parametarized");
					this.name=name;
					this.color=color;
					this.cost=cost;
					
					System.out.println(name);
					System.out.println(color);
					System.out.println(cost);
					System.out.println(age);
					System.out.println(breed);
					System.out.println("..............................");
				}
	            //Four Parametarized 
				public Dog12(String name,String color,int cost,int age){
					
					this("Dobby","Orange",9000);
					
					System.out.println("Inside the four Parametarized");
					this.name=name;
					this.color=color;
					this.cost=cost;
					this.age=age;
					
					System.out.println(name);
					System.out.println(color);
					System.out.println(cost);
					System.out.println(age);
					System.out.println(breed);
					System.out.println("..............................");
				}
	            //Five Parametarized 
				public Dog12(String name,String color,int cost,int age,String breed){
					
					this("Jimmy","Purple",7000,7);
					
					System.out.println("Inside the five Parametarized");
					this.name=name;
					this.color=color;
					this.cost=cost;
					this.age=age;
					this.breed=breed;
					
					System.out.println(name);
					System.out.println(color);
					System.out.println(cost);
					System.out.println(age);
					System.out.println(breed);
					System.out.println("..............................");
				}
}
				
	
public class MainApp {

	public static void main(String[] args) {
		Dog12 d1=new Dog12("Rocky","White",8000,8,"GR");

	}

}




//name =null ,Ramu,chintu,tommy,Dobby,jimmy,rocky
//color=null,brown,blue,Orange,Purple,White
//cost=0,7000,9000,7500,8000
//age=0,3,7,8
//breed=null,pemorian,GR
