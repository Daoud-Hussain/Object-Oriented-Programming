public class Student extends Person{
	double cgpa;


	//Setter of name in child class
	public void setCGPA(String nam, double cgpaStu){
		super.setName(nam);
		if(cgpaStu!=0){
			cgpa = cgpaStu;
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