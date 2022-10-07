package Encapsulation;

public class UseBike {
	public static void main(String[] args) {
		
		Fitting f1=new Fitting("Saint Goblin",25000);
		Fitting f2=new Fitting("PHILIPPE STARC",35000);
		
		Bike b1=new Bike("TVS",120000,"Black",f1);
		Bike b2=new Bike("Honda",135000,"Blue",f2);
		
		System.out.println("Bike "+b1.getPrice()+", "+"Bike2 "+b2);
		if(b1.getPrice()>50000)  
			if(b1.getBrand().equalsIgnoreCase("TVS"))
			System.out.println("Display the brand "+b1.getPrice()+", "+"Colour "+b1.getColour() );
		}
		
			
		}
		
	

	

