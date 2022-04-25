public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;


	public Employee(String fName, String lName, String ssn){
		firstName = fName;
		lastName = lName;
		socialSecurityNumber = ssn;
	}
	
}