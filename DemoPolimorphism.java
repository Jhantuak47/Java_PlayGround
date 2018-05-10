package com.trainingcore.java;
//Emplementing pollimorphism...
public class DemoPolimorphism {
	public static void main(String[] args) {
	
		//Referencing using same class
		programerp p3 = new programerp("james","address1","123",new String[] {"java"});
		p3.work();
		p3.train();
		//Referencing using base class
		Employeep e1=new programerp("jerry","address1","123",new String[] {"java","c#"});
		e1.work();
		//e1.train();//not allow it'l give error because train method is not available at child class(programp).
		e1 = p3;
		e1.work();
		
		//Referencing using interface
		ITrainable t1=p3;//here i can create instance of type ITrainable and point it to p3 object this is valid cozz programmer class empliment ITrainable
		t1.train();//possible coz train() method is available in Itrainable also t1 an instance of itrainable have authority to use this...
		
		//t1.work();//t1 is instance of interfase so it can only see the method those are available in the interface not outside of it..
	}

}
class Employeep {
	
	String name;
	String address;
	String phone;
	
	public Employeep(String name, String add,String phone) {
		
		this.name=name;this.address=add;this.phone=phone;
	}
	
	void work() {
		System.out.println("I am working at base class:");
	}
}

class programerp extends Employeep implements ITrainable{

	String[] language;
	
	public programerp(String name, String add,String phone,String[] language) {
		super(name,add,phone);
		this.language=language;
	}
	
	public void work() {
		
		System.out.println("I am coding:");
	}

	@Override
	public void train() {
		
		System.out.println("Get trained-Manager:");
		
	}

}
class managerp extends Employeep implements IInterviewer,ITrainable{
	
	String Itemsize;
	
	public managerp(String name, String add,String phone,String item) {
		super(name,add,phone);
		this.Itemsize=item;
	}
	
	void work() {
		System.out.println("I am maging my task:");
	}

	@Override
	public void interview() {
		System.out.println("Tavke interview:");
		
	}

	@Override
	public void train() {
		
		System.out.println("Get trained-Manager:");
		
	}
}

interface ITrainable {
	public void train();

}

interface IInterviewer {
	public void interview();

}

