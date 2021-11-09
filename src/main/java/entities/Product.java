package entities;

public class Product {
	
	public Product() {}
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "data: " + name
				+ ", $" 
				+ price 
				+ ", "
				+ quantity 
				+ " units, Total: $ "
				+ totalValueInStock();
	}
	
	

}
