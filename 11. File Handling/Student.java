import java.util.*;
import java.io.Serializable;


public class Student extends Person implements Serializable{
	private double gpa; 
	private int semester; 
	private String section; 
	private Department typeDepartment;

	public Student(){
		//Default Argument Constructor
		Department myDept = new Department();
	}

	public Student(String name, String phone, String gender, double gpa, int semester, String section, Department myDept){
		super(name, phone, gender);
		this.gpa = gpa;
		this.semester = semester;
		this.section = section;
		this.typeDepartment = myDept;
	}

	//Setters
	public void setGPA(double gpa){
		if(gpa != 0)
			this.gpa = gpa;
	}

	public void setSemester(int semester){
		if(semester != 0)
			this.semester = semester;
	}

	public void setSection(String section){
		if(section != "")
			this.section = section;
	}

	public void setDepartment(Department deptObj){
		if(deptObj != null)
			this.typeDepartment = deptObj;
	}


	//Getters
	public double getGPA(){
		return this.gpa;
	}

	public String getSection(){
		return this.section;
	}

	public int getSemester(){
		return this.semester;
	}

	public Department getTypeDepartment(){
		return this.typeDepartment;
	}


}