package Javapractice.dev.lpa2.Abstraction_Generalisation.AbstractionClassChallenge;
abstract class ProductForSale{
	private String type;
	private String description;
	private double price;

	
	public ProductForSale(String type, String description, double price) {
		this.type = type;
		this.description = description;
		this.price = price;
	}

	//getters
	public String getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}

	// concrete methods
	public double getSalesPrice(int quantity){
		return quantity*price;
	}

	public void printPricedLineItem(int quantity){
		System.out.println("Sales Reciept");
		System.out.println("-".repeat(30));
		System.out.println();
		System.out.printf("%-10s %19s%n","Item Name","Price");
		System.out.printf("%-10s %19s%n",getType(),getPrice());
	}

	//abstract method
	public abstract void showDetails();
		
}

class OrderItem{
	int quantity;
	ProductForSale productForSale;

	public OrderItem(int quantity, ProductForSale productForSale) {
		this.quantity = quantity;
		this.productForSale = productForSale;
	}

	public int getQuantity() {
		return quantity;
	}

	public ProductForSale getProductForSale() {
		return productForSale;
	}

	public void addItemToOrder() {
		
	}

}
public class Store{
	public static void main(String[] args) {
		
	}
}
