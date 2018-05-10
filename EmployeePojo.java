package com.trainingcore.nestedclass.demo;

public class EmployeePojo {

	private String emp_name;
	private int emp_sal;

	 void accessPrivateClass() {
		Innerclass1 obj = new Innerclass1();
		System.out.println(obj.getHike_sal());
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}
	

	@Override
	public String toString() {
		return "EmployeePojo [emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}


	private class Innerclass1{
		
		private int hike_sal = emp_sal+10;

		public int getHike_sal() {
			return hike_sal;
		}

		public void setHike_sal(int hike_sal) {
			this.hike_sal = hike_sal;
		}

		@Override
		public String toString() {
			return "Innerclass1 [hike_sal=" + hike_sal + "]";
		}
		
		
	}
	
	protected static class Innerclass2{
		private String new_emp;
		private int new_sal;
		public String getNew_emp() {
			return new_emp;
		}
		public void setNew_emp(String new_emp) {
			this.new_emp = new_emp;
		}
		public int getNew_sal() {
			return new_sal;
		}
		public void setNew_sal(int new_sal) {
			this.new_sal = new_sal;
		}
		@Override
		public String toString() {
			return "Innerclass2 [new_emp=" + new_emp + ", new_sal=" + new_sal + "]";
		}
		
	}
}
