public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;


	//Argument-Constructor
	public HourlyEmployee(String fn, String ln, String secSecNum, int hrsWrk, int hrsWag){
		super(fn, ln, secSecNum);
		hoursWorked = hrsWrk;
		hourlyWages = hrsWag;
		
	}

	//Overriding Abstract class method earnings()
	public double earnings(){
		if(hoursWorked < 40){
			return hoursWorked * hourlyWages;
		}
		else{
			return 40 * hourlyWages + (hoursWorked - 40) * hourlyWages * 1.5; 
		}

	}



	//Method to display values
	public String toString(){
		String text = "First Name: " + firstName + " Last Name: " + lastName + " SSN: " + ssn + " Hourly Wages: " + hourlyWages + " Hours Worked: " + hoursWorked;
		return text;
	}

}