import java.util.*;
import java.io.Serializable;


public class Student extends Person implements Serializable{
	private String gpa; 
	private String semester; 
	private String section; 
	private Department typeDepartment;

	public Student(){
		//Default Argument Constructor
		Department myDept = new Department();
	}

	public Student(String name, String phone, String gender, String gpa, String semester, String section, Department myDept){
		super(name, phone, gender);
		this.gpa = gpa;
		this.semester = semester;
		this.section = section;
		this.typeDepartment = myDept;
	}

	//Setters
	public void setGPA(String gpa){
		if(gpa != "")
			this.gpa = gpa;
	}

	public void setSemester(String semester){
		if(semester != "")
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
	public String getGPA(){
		return this.gpa;
	}

	public String getSection(){
		return this.section;
	}

	public String getSemester(){
		return this.semester;
	}

	public Department getTypeDepartment(){
		return this.typeDepartment ;
	}

	//Method to display values
	public String toString(){

		String text = super.toString()+ "\nGPA: "  + gpa + "\nSemester: " + semester + "\nDepartment Name: " + typeDepartment.getName() + "\nLocation: " + typeDepartment.getLocation() + "\n\n";
		return text;
	}

}