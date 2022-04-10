public class Person{

	private String firstName;
	private String lastName;
	private Address homeAddress;



	Person(){
		homeAddress = new Address();
	}

	Person(String f, String l, Address ha){
		firstName = f;
		lastName = l;
		homeAddress = ha;
	}

	public void setFirstName(String fn){
		if(fn != ""){
			firstName = fn;
		}
	}

	public void setLastName(String ln){
		if(ln != ""){
			lastName = ln;
		}
	}

	public void setHomeAddress(Address ha){
		homeAddress = ha;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getlastName(){
		return lastName;
	}

	public Address getHomeAddress(){
		return homeAddress;
	}


	public void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(homeAddress.getHome() + " " + homeAddress.getStreet() + " " + homeAddress.getCity());

	}


	public boolean checkCity(String city){
		if(homeAddress.getCity() == city){
			return true;
		}
		return false;
	}
}

