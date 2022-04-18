public class CommisionEmployee extends Employee {
	protected int grossSales;
	protected int commisionRate;


	//Argument-Constructor
	public CommisionEmployee(String fn, String ln, String secSecNum, int gs, int cr){
		super(fn, ln, secSecNum);
		grossSales = gs;
		commisionRate = cr;
		
	}

	//Overriding Abstract class method earnings()
	public double earnings(){
		return commisionRate * grossSales;

	}



	//Method to display values
	public String toString(){
		String text = "First Name: " + firstName + " Last Name: " + lastName + " Social Security Number: " + ssn + " Gross Sales: " + grossSales + " Commision Rate" + commisionRate;
		return text;
	}
}