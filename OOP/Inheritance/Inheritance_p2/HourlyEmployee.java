package Javapractice.OOP.Inheritance.Inheritance_p2;

public class HourlyEmployee extends Employee{

	private double hourlyPayRate;

	public HourlyEmployee() {
	}

	public HourlyEmployee(String name, String birthDate, String hireDate,double hourlyPayRate) {
		super(name, birthDate, hireDate);
		this.hourlyPayRate=hourlyPayRate;
	}

	@Override
	public double collectPay(){
		return 40*hourlyPayRate;
	}

	//method
	public double getDoublePay(){
		// it will call collect pay in this class
		return collectPay()*2;
	}

	//toString

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyPayRate=" + hourlyPayRate + "]" + "\n" + super.toString();
	}


	
	
}
