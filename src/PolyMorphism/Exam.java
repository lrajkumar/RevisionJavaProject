package PolyMorphism;

public class Exam {
             public int marks (int maths ,int physics) {
            	 return maths+physics;
             }
             
            public int marks (int maths,int physics,int english) {
            	return maths+english+physics;
            }
             
            public static void main(String[] args) {
            	Exam e=new Exam();
            	e.marks(60, 65);
            	e.marks(75, 85, 96);
				
			} 
            }
