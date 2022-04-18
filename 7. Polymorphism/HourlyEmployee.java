public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;


	//Argument-Constructor
	public HourlyEmployee(String fn, String ln, String secSecNum, int hrsWrk, int hrsWag){
		super(fn, ln, secSecNum);
		hoursWorked = hrsWrk;
		hourlyWages = hrsWag;
		
	}

	public double earnings(){
		if(hoursWorked < 40){
			return hoursWorked * hourlyWages;
		}
		else{
			return 40 * hourlyWages + (hoursWorked - 40) * hourlyWages * 1.5; 
		}

	}

}