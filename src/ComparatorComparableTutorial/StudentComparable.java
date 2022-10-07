package ComparatorComparableTutorial;

public class StudentComparable implements Comparable<Student> {
	int rollno;  
	String name;  
	int age;  
	void Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(Student st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
	
}
