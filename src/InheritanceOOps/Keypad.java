package InheritanceOOps;

public class Keypad extends Landline  {
	public void Text( ) {
		System.out.println("Texting");
	}

	public static void main(String[] args) {
		Keypad k=new Keypad();
		k.call();
		k.Text();
	}
	
	
}
