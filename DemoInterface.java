package com.trainingcore.java;
//IMPLIMENTING INTERFACE
public class DemoInterface {
	public static void main(String args[]) {
		Programer1 p1=new Programer1("john","234","adderess1",new String[] {"java"} );
		p1.work();
		
		Manager m1=new Manager("MIKE","12","ADDRESS2",4);
		m1.work();
		
		Employee2 e1 = new Programer("sumit", "163738","dhanbad",new String[] {"java"});
		e1.work();
		
		
		IDancer d1=new Programer1("marry","234","adderess1",new String[] {"java"} );
		d1.dance();
		
		IRunner R1=new Programer1("jack","234","adderess1",new String[] {"java"} );
		R1.run();
		//R1.work(); //invalid,will not compile..
		
		R1=new Carpanter();//This is valid...
		R1.run();//Reference type interface can only see the method which is define in the interface..
		/*
		IRunner R2=new Carpanter();
		R2.run();*/
	}
}
class Employee3 {
	
	String name=null;
	String phone=null;
	String address=new String();
	public Employee3(String name,String phone,String address ) {
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
 
    public void work() {
		System.out.println("hey i am coding at base class !!");
    }
}

class Programer1 extends Employee3 implements IRunner,IDancer{
	
		String[] language=new String[10];		
			public Programer1(String name,String phone,String address,String[] language) {
				super(name,phone,address);
				this.language=language;
			}
			public void work() {
				//System.out.println("hey i am coding !!");  //if you uncoment this you will see best example of method overdiding
				System.out.println("name:"+ super.name);
				System.out.println("phone:"+phone);
				System.out.println("address:"+address);
			}
			@Override
			public void run() {

				System.out.println("programer is running:");
					
			}
			@Override
			public void dance() {
				
				System.out.println("programer is Dancing:");
				
			}
}
class Manager2 extends Employee3 {
	int team;
	
	public Manager2(String name,String phone,String address,int team) {
		super(name,phone,address);
		this.team=team;
	}
	public void work(){
			System.out.println("manager: hey i am WORKING!!");
		}		
  }

class Worker {
	 
	 public void doWork() {
		 System.out.println("Iam aworker and i am working:");
	 }

}

class Carpanter extends Worker implements IRunner {
	
	 public void doWork() {
		 System.out.println("I create table artified:");
	 }

	@Override
	public void run() {
		
		System.out.println("carpanter is running:");
		
	}
}

 interface IRunner {
//any one who empliment this interface should provide a defination of this method	  
	 void run();
 }
 
 interface IDancer {
	//we can have more than one interface all we need to do is that to impement it
		 void dance();
	 }