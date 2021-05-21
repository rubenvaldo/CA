package fridge;

public class Chocolate extends Fridge {

	public Chocolate(String brand, double price) {
		super(brand, price);
		
	}
	
	public String toString() {
		return getBrand() + " " + getPrice();
	}
	
	

}
