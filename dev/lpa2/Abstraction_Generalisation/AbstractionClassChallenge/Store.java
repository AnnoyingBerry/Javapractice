package Javapractice.dev.lpa2.Abstraction_Generalisation.AbstractionClassChallenge;

import java.util.ArrayList;

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

		System.out.printf("%-10s x%d %16.2f%n",getType(),quantity,getPrice());
	}

	//abstract method
	public abstract void showDetails();
		
}

class ArtObject extends ProductForSale{

	public ArtObject(String type, String description, double price) {
		super(type, description, price);
		
	}

	@Override
	public void showDetails() {
		System.out.println("This " + getType() + " is a beautiful reproduction");
		System.out.printf("The price of the piece is $%6.2f %n",getPrice());
		System.out.println(getDescription());
	}





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

}

public class Store{

	private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

	public static void main(String[] args) {

		storeProducts.add(new ArtObject("Oil Painting", "Impressionistic work by ABF", 1350));
		storeProducts.add(new ArtObject("Sculpture", "Bronze Work by JKF", 2000));

		listProducts();

		System.out.println("\nOrder 1");
		var order1 = new ArrayList<OrderItem>();
		addItemtoOrder(order1, 1, 2);
		addItemtoOrder(order1, 0, 1);
		printOrder(order1);
		
	
	}

	public static void listProducts(){

		for (var item : storeProducts) {
			System.out.println("-".repeat(30));
			item.showDetails();
		}


	}

	public static void addItemtoOrder(ArrayList<OrderItem> order, int orderIndex,int quantity) {
		order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
	}

	public static void printOrder(ArrayList<OrderItem> order) {
		
		double salesTotal = 0;
		System.out.println("Sales Reciept");
		System.out.println("-".repeat(30));
		System.out.printf("%-10s %19s%n","Item Name","Price");

		for (var item: order){
			item.getProductForSale().printPricedLineItem(item.getQuantity());
			salesTotal += item.getProductForSale().getSalesPrice(item.getQuantity());
		}
		System.out.printf("Sales Total = $%16.2f %n",salesTotal);
		
	}


}
