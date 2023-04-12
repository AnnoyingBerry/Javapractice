package Javapractice.OOP.Inheritance.Inheritance_p2;

public class SalariedEmployee extends Employee{

	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(){

	}

		
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = false;
	}

	
	public void retire(){
		// this work because the parent class( employee) does not override its parents(Worker) methods
		// in this way it can be called in any descendants
		terminate("12/12/2021");
		this.isRetired = true;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + "]" + "\n" + super.toString();
	}

	@Override
	public double collectPay(){
		double paycheck = annualSalary/26;
		double adjustedPay = (isRetired)? 0.9*paycheck: paycheck;

		return (int) adjustedPay;
	}
		
}
