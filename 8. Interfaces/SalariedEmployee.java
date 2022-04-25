public class SalariedEmployee extends Employee implements Payable{
	private double weeklySalary;


	public SalariedEmployee(String fName, String lName, String ssn, double ws){
		super(fName, lName, ssn);
		weeklySalary = ws;
	}


	public double getPaymentAmount(){
		return weeklySalary;
	}
	

}