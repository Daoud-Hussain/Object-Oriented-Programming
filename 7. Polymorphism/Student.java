public class Student extends Person{
	double cgpa;


	//One-Argument-Constructor
	public Student(String n, double np){
		super(n);
		cgpa = np;
	}


	//Setter
	public void setcgpa(double n){
		if(n!=0){
			cgpa = n;
		}
	}


	//Getters
	public double getcgpa(){
		return cgpa;
	}


	//Over-riding method in child class 
	public boolean isOutstanding(){
		if(cgpa > 3.5){
			return true;
		}
		return false;
	}	
}