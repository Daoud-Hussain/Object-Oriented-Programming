public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String ssn;


	//Constructors
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
}