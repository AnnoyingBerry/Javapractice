package Javapractice.dev.lpa;

import java.util.ArrayList;

public class AutoboxingChallenge {
	public static void main(String[] args) {

		Bank sata = new Bank("sata");
		sata.addNewCustomer("Mary");
		sata.addATransaction("Mary", 20);
		sata.addATransaction("Mary", -50);
		sata.printCustDetails("Mary");

		sata.addNewCustomer("john");
		System.out.println(sata.getCust());

	}
}
class Customer{
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
	}

	//GETTERS
	public String getName() {
		return name;
	}


	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", transactions=" + transactions + "]";
	}
	

	
}
class Bank{
	private String bankName;
	private ArrayList<Customer> cust;


	public Bank(String bankName) {
		this.bankName = bankName;
		this.cust = new ArrayList<Customer>();
	}

	public void addATransaction(String name, double amt) {
		for (int i = 0; i < cust.size(); i++) {
	
			if(cust.get(i).getName().equals(name.toLowerCase())){
				cust.get(i).getTransactions().add(amt);
				break;
			}	
		}
	}

	public void addNewCustomer(String name){
		cust.add(new Customer(name.toLowerCase()));
	}


	//getters
	public String getBankName() {
		return bankName;
	}

	public ArrayList<Customer> getCust() {
		return cust;
	}
	

	public void printCustDetails(String name) {

		for (int i = 0; i < cust.size(); i++) {

			if(cust.get(i).getName().equals(name.toLowerCase())){
				System.out.println("_".repeat(30));
				System.out.println("Customer's name " + cust.get(i).getName());
				System.out.println("Transactions");
				for (double d : cust.get(i).getTransactions()) {
					System.out.printf("$%10.2f (%s)%n",d,d < 0 ? "debit":"credit");
				}
				
			}	
		}

		
	}


}