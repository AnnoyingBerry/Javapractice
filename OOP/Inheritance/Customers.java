package Javapractice.OOP.Inheritance;

public class Customers {

	private String name;
	private int creditLimit;
	private String email;

	//constructor

	// default 
	public Customers(){
		this("empty", "empty");

	}

	public Customers(String name, int creditLimit, String email){
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public Customers(String name , String email){
		this(name,1000,email);
	}

	//get method
	public String getName() {
		return this.name;
	}

	public int getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmail() {
		return this.email;
	}


	
}
