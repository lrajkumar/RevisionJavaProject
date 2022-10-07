package Encapsulation;

public class Engine {
	private int price;
	private String brand;
	private String capacity;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Engine(int price, String brand, String capacity) {
		super();
		this.price = price;
		this.brand = brand;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Engine [price=" + price + ", brand=" + brand + ", capacity=" + capacity + "]";
	}
	
	
	
	
	

}
