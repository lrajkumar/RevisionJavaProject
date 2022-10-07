package Encapsulation;

public class Car {
	private String brand;
	private String Colour;
	public Car(String brand, String colour, Engine engine, int price) {
		super();
		this.brand = brand;
		this.Colour = colour;
		this.engine = engine;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", Colour=" + Colour + ", engine=" + engine + ", price=" + price + "]";
	}
	private Engine engine;
	
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	private int price;
	
	
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
	
	

}
