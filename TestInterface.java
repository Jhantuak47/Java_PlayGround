
class TestInterface{

		public static void main(String[] args){
			Idancer id = new Programmer("jhantu","male",23,new String[]{"java"});
			Irunner ir = new Manager("sumit","male",23,5);

			new Programmer("jhantu","male",23,new String[]{"java"}).work();
			id.dance();

			ir.runs();
		}

}

class Employee{
	private String name;
	private String gender;
	private int age;
	public Employee(String name,String gender,int age){
		this.name = name;
		this.gender=gender;
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public String getGender()
	{
		return this.name;
	}
	void work(){

		System.out.println("Inside Employee...");
	}
}
class Programmer extends Employee implements Idancer{
	private String[] language;

	public Programmer(String name,String gender,int age,String[] language){
		super(name,gender,age);
		this.language=language;
	}
	public void dance(){
		System.out.println("I am programer I can dance also...");
		}

		//overriding
		void work(){
			System.out.println("name: "+super.getName()+"Gender: "+super.getGender());
		}
}
class Manager extends Employee implements Irunner{
	private int noOfTeam;
	public Manager(String name,String gender,int age,int noOfTeam){
		super(name,gender,age);
		this.noOfTeam=noOfTeam;
	}
		public void runs(){
		System.out.println("I am Manager I run..");
		}
}

interface Idancer{
	public void dance();
}
interface Irunner{
	public void runs();
}