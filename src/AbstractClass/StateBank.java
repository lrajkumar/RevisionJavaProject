package AbstractClass;

public class StateBank extends CentralBank {


	public void loanInterest(int loan) {
		if(loan > 100000 ) {
			System.out.println(loan+5000);
		}
		
	}

	public static void main(String[] args) {
		StateBank sb=new StateBank();
		sb.addcustomer(75);
		sb.loanInterest(150000);
	}

	

}
