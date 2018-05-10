package com.trainingcore.java;
//IMPLIMENTING INHERITENCE with method overriding
public class TestInheritance{
	public static void main(String args[]) {
		Programer p1=new Programer("john","234","adderess1",new String[] {"java"} );
		//p1.work();
		Employee2 m2 = p1;
		m2.work();
		//Employee2 m3 = new Programer("john","234","adderess1",new String[] {"java"} );
		//m3.work();
		
		//Programer pq = (Programer) new Employee2(null, null, null);
		
		/*Employee2 m1=new Manager("MIKE","12","ADDRESS2",4);
		m1.work();
		m1 = new Employee2("PETTER", "203", "JHARIA");
		m1.work();*/
	}
}
class Employee2 {
	
	String name=null;
	String phone=null;
	String address=new String();
	public Employee2(String name,String phone,String address ) {
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
 
    public void work() {
		System.out.println("hey i am coding at base class !!");
    }
}

class Programer extends Employee2 {
	
		String[] language=new String[10];		
			public Programer(String name,String phone,String address,String[] language) {
				super(name,phone,address);
				this.language=language;
			}
			public void work() {
				//System.out.println("hey i am coding !!");  //if you uncoment this you will see best example of method overdiding
				System.out.println("name:"+ super.name);
				System.out.println("phone:"+phone);
				System.out.println("address:"+address);
			}
}
class Manager extends Employee2 {
	int team;
	
	public Manager(String name,String phone,String address,int team) {
		super(name,phone,address);
		this.team=team;
	}
	public void work(){
			System.out.println("hey i am WORKING!!");
		}		
  }
