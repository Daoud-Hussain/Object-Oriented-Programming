public class Person2{
	private String name, email;
	private String address, phoneNumber;

	//Setters
	public void setName(String n){
		if(n!=""){
			name = n;
		}
	}

	public void setAddress(String n){
		if(n!=""){
			address = n;
		}
	}


	public void setEmail(String n){
		if(n != "" && n.contains("@")){
			email = n;
		}
	}

	public void setPhoneNumber(String n){
		if(n!="" && n.length() == 11){
			phoneNumber = n;
		}
	}

	public Person2(String a, String n, String p, String e){
		if(a != "" && n != "" &&  p!="" && e != ""){
			email = e;
			address = a;
			phoneNumber = p;
			name = n;
		}
	}

	//Getters
	public String getName(){
		return name;
	}	

	public String getAddress(){
		return address;
	}	

	public String getPhoneNumber(){
		return phoneNumber;
	}	

	public String getEmail(){
		return email;
	}	
}