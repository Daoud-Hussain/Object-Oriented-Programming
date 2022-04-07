public class University{
	String[] departments = new String[20];
	String uniName, location, rectorName;

	public University(){
		//Default Constructor
	}

	//Two-Argument Constructor
	public University(String a,String b){
		if(a!="" && b!=""){
			uniName = a;
			location = b;
		}
	}

	//Full-Argument Constructor
	public University(String a,String b, String c, String[] s){
		if(a!="" && b!="" && c!=""){
			uniName = a;
			location = b;
			rectorName = c;
		}
		if(s.length < departments.length){
			for(int i=0; i<s.length; i++){
				departments[i]  = s[i];
			}

		}
		else{
			for(int i=0; i<departments.length; i++){
				departments[i]  = s[i];
			}
		}
		
	}

	//Method to Add a department
	public void addADepartment(String abc){
		for(int i=0; i<departments.length; i++){
			if(departments[i] == null){
				departments[i] = abc;
				break;
			}

		}
	}
	
	//Method to check whether the location provided is in Islamabad or not
	public boolean checkIfLocatedInCapital(){
		if(location == "Islamabad"){
			return true;
		}
		else{
			return false;
		}

	}


	//Method to check whether the EE department is present or not
	public boolean searchDepartment(){
		boolean flag = false;
		for(int i=0; i<departments.length;i++){
			if(departments[i] == "CS"){
				flag = true;
			}
		}
		if(flag){
			return true;
		}
		else{
			return false;
		}
	}


	//Method to display all the values
	public void display(){
		System.out.println("UNIVERSITY NAME: " + uniName+ "\n" + "LOCATION: " + location + "\n"+ "RECTOR NAME: " + rectorName +"\n"+ "DEPARTMETNS");
		for(int i=0; i<departments.length;i++){
			if(departments[i]!=null){
				System.out.print(i+1+"." + departments[i] + "\n");

			}
		}
	}

}

