package Javapractice.OOP.Inheritance.Inheritance_p2;

public class Employee extends Worker {

	private long employeeid;
	private String hireDate;

	private static int employeeno = 1;
	//defualt
	public Employee() {

	}
	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate);
		this.employeeid = employeeno++;
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", hireDate=" + hireDate + "]" + "\n" 
			+ super.toString();
	}


	


	
	
}
