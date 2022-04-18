public class BasePlusCommisionEmployee extends CommisionEmployee {
	private int baseSalary;


	//Argument-Constructor
	public  BasePlusCommisionEmployee(String fn, String ln, String secSecNum, int gs, int cr, int bs){
		super(fn, ln, secSecNum, gs, cr);
		baseSalary = bs;
		
	}

	//Overriding Abstract class method earnings()
	public double earnings(){
		return (commisionRate * grossSales) + baseSalary;

	}



	//Method to display values
	public String toString(){
		String text = "First Name: " + firstName + " Last Name: " + lastName + " Social Security Number: " + ssn + " Gross Sales: " + grossSales + " Commision Rate" + commisionRate + " Base Salary" + baseSalary;
		return text;
	}
}