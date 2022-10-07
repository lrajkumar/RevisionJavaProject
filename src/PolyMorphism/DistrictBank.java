package PolyMorphism;


// same method name, same parameter but different class
public class DistrictBank extends StateBank {
	public int loan(int amount,int interest) {
		return amount-interest;
		}
       public static void main(String[] args) {
		DistrictBank db=new DistrictBank();
		System.out.println(db.loan(8000, 5000));
		System.out.println(db.loan(8000, 5000));
	}
       
	
	
	
}
