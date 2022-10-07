package PolyMorphism;

public class HalfYearlyExam extends AnnualExam {
	 public void subject(int physics,int maths,int science) {
		 System.out.println(physics+maths+science);
				
	 }
	 public static void main(String[] args) {
		HalfYearlyExam hf=new HalfYearlyExam();
		hf.subject(85, 75, 65);
		hf.subject(50, 50, 50);
		
		//void  show() {
			//super.subject()
		//}
		
	}

}
