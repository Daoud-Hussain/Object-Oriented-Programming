public class WeeklyEmployee extends Employee{
	private double WeeklySalary;


	//Argument-Constructor
	public WeeklyEmployee(String fn, String ln, String secSecNum, double ws){
		super(fn, ln, secSecNum);
		if(ws > 0){
			WeeklySalary = ws;
		}
	}


	//Method to calculate Weekly Salary
	public double earnings(){
		return WeeklySalary;
	}
	

	//Method to display values
	public String toString(){
		String text = "First Name: " + firstName + " Last Name: " + lastName + " SSN: " + ssn + " Weekly Salary: " + WeeklySalary;
		return text;
	}

}