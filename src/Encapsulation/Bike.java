package Encapsulation;

public class Bike {
	private String brand;
	private int price;
	private String colour;
	private Fitting fitting;
	
	
	

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Fitting getFitting() {
		return fitting;
	}
	public void setFitting(Fitting fitting) {
		this.fitting = fitting;
	}
	public Bike(String brand, int price, String colour, Fitting fitting) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.fitting = fitting;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	
	
	
	
	
}
