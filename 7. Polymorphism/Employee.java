public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String ssn;


	//Argument-Constructors
	public Employee(String fn, String ln, String secSecNum)
	{
		if(fn != "" && ln != "" && secSecNum != ""){
			firstName = fn;
			lastName = ln;
			ssn = secSecNum;
		}
	}

	//Abstract class method
	public abstract double earnings();


	//Method to display values
	public String toString(){
		String text = "First Name: " + firstName + " Last Name: " + lastName + " Social Security Number: " + ssn;
		return text;
	}
}