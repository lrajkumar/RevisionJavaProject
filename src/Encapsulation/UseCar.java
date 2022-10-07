package Encapsulation;

public class UseCar {

	public static void main(String[] args) {
		Engine e1=new Engine(25000,"cummins","2000cc");
		Engine e2=new Engine(30000,"caterpillar","2500cc");
		Engine e3=new Engine(45000,"Daimler","30000cc");
		
		Car c1=new Car("Hyundai","Black",e1,500000);
		Car c2=new Car("Maruthi Suzuki","Grey",e2,600000);
		Car c3=new Car("BMW","Red",e3,750000);
		
		System.out.println("Car1" +c1+" ,"+"Car2 "+c2+", "+"Car "+c3);
		System.out.println(c1.getBrand());
		
	}
	
	
	
}
