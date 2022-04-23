public class Student extends Person{
	private String regNo; 
	private String pswd; 


	public Student(){
		//Default Constructor
	}


	//Argument-Constructor
	public Student(String nam, int ag, String n, String a){
		super(nam, ag);
		if(n!="" && a != ""){
			regNo = n;
			pswd = a;
		}
	}

	//Setter
	public void setregNo(String n){
		if(n!=""){
			regNo = n;
		}
	}


	public void setpswd(String a){
		if(a != ""){
			pswd = a;
		}
	}


	//Getters
	public String getregNo(){
		return regNo;
	}


	public String getpswd(){
		return pswd;
	}


	public String toString(){
		String text = regNo + " " + pswd;
		return text;
	}
}