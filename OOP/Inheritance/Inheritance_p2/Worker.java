package Javapractice.OOP.Inheritance.Inheritance_p2;
public class Worker {

	private String name;
	private String birthDate;
	private String endDate;

	// default constructor
	public Worker(){

	}

	public Worker(String name,String birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}



	//methods
	public int getAge(){

		int currentYear = 2023;
		// start at the 6th character 19/09/1970
		int birthYear = Integer.parseInt(birthDate.substring(6));
		return (currentYear - birthYear);
	}

	public double collectPay(){
		return 0d;
	}

	public void terminate(String endDate){
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}

	
	
}
