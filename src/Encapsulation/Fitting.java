package Encapsulation;

public class Fitting {
	private String Mirror;
	private int fPrice;
	public String getMirror() {
		return Mirror;
	}
	public void setMirror(String mirror) {
		Mirror = mirror;
	}
	public int getFPrice() {
		return fPrice;
	}
	public void setPrice(int fPrice) {
		this.fPrice = fPrice;
	}
	public Fitting(String mirror, int price) {
		super();
		Mirror = mirror;
		this.fPrice = fPrice;
	}
	@Override
	public String toString() {
		return "Fitting [Mirror=" + Mirror + ", price=" + fPrice + "]";
	}
	
	
	
	
	

}
