package AbstractClass;

public abstract class CentralBank {
 abstract public void loanInterest(int loan);
	
	public void addcustomer(int age) {
		if(age > 60) {
			System.out.println("Above 60 years cannot open account");
		}
		else {
			System.out.println("Account can be opened");
		}
	}

}
