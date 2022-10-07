package PolyMorphism;


//Method overloading
//same method name,diff parameter,same class
public class Test {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.unitTest(65));
		System.out.println(t.UnitTest(15));
	}
	 public String unitTest(int mark) {
		 if(mark < 35) {
			 return "Fail";
		 }
		 else {
			 return "pass";
		 }
	 }
	 public String UnitTest(int rank) {
		if(rank < 3) {
			return "Topper";
		}
		else if (rank < 10 && rank > 5) {
			return "Average";
	 }
		else {
			return "Below Average";
		}
	 }
	 
}
