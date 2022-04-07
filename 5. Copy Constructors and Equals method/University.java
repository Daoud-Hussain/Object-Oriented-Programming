public class University{
	String[] departments = new String[20];
	String uniName, location, rectorName;

	public University(){
		//Default Constructor
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

	public void setUniName(String un){
		if(un!=""){
			uniName = un;
		}
	}

	public void setLocation(String l){
			if(l!=""){
				location = l;
			}
	}


	public void setRectorName(String rn){
		if(rn!=""){
			rectorName = rn;
		}
	}

	public void setDepartments(String[] s){
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

	public String getUniName(){
		return uniName;
	}

	public String getRectorName(){
		return rectorName;
	}

	public String getLocation(){
		return location;
	}

	public void getDepartments(){
		for(int i=0; i<departments.length; i++){
			if(departments[i] != null){
				System.out.print(departments[i] + " ");

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
 
}

