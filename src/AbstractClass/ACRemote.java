package AbstractClass;

public class ACRemote extends Remote {
          public int batteryLife() {
        	 return 95;
         }
          public static void main(String[] args) {
			ACRemote ac=new ACRemote();
			System.out.println(ac.batteryLife());
		}
}
