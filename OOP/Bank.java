package Javapractice.OOP;

public class Bank {

	private String custName;
	private String accountNo;
	private String email;
	private double accBalance;
	private int phoneNum;

	//contrsuctors

	public Bank(){
		this("hi", "1234A", "default", 500, 12344584); // its a good practice
		System.out.println("default constructor invoked");
	}

	public Bank(String custName, String accountNo, String email, double accBalance, int phoneNum){
		System.out.println("constructor with additional parameters invoked");
		// it is a good practice with only one major constructor that assign
		this.custName = custName;
		this.accountNo = accountNo;
		this.email = email;
		this.accBalance = accBalance;
		this.phoneNum = phoneNum;

	}

	public Bank(String custName, String accountNo){
		this(custName, accountNo, "0", 0, 123); // its a good practice

	}


	//get method
	public String getCustName() {
		return this.custName;
	}


	public String getAccountNo() {
		return this.accountNo;
	}

	public String getEmail() {
		return this.email;
	}


	public double getAccBalance() {
		return this.accBalance;
	}


	public int getPhoneNum() {
		return this.phoneNum;
	}

	// set method
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccBalance(double accBalance){
		this.accBalance = accBalance;
	}

	// other methods
	public void deposit(int amt) {
		this.accBalance += amt;
	}

	public void withdraw(int amt){

		if(this.accBalance >= 0){
			this.accBalance -= amt;
		}else{
			System.out.println("Insufficient Funds!");
		}
	}




	
}
