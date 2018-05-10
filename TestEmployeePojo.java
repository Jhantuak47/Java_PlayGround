package com.trainingcore.nestedclass.demo;

public class TestEmployeePojo {

	public static void main(String[] args) {
		
		EmployeePojo emp = new EmployeePojo();
		emp.setEmp_name("jhantu");
		emp.setEmp_sal(1500);
		
		System.out.println("Employee details:"+emp.getEmp_name());
		System.out.print("Hicked sallary:");
		emp.accessPrivateClass();
	}
}
