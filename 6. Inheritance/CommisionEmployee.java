public class CommisionEmployee{
	String firstName;
	String lastName;
	String ssl;
	double grossSales;
	double commisionRate;


	public CommisionEmployee(){
		//Default Argument Constructor
	}


	//Full-Argument Constructor
	public CommisionEmployee(String fn, String ln, String sslArg, double gs, double cr){
		firstName = fn;
		lastName = ln;
		ssl = sslArg;
		grossSales = gs;
		commisionRate = cr;
	}

	//Method to display Parent class data
	public void display(){
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("SSL: " + ssl);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Commision Rate: " + commisionRate);
	}


	//Method to calculate Parent class earning
	public double calculateEarning(){
		double earning = grossSales*commisionRate;
		return earning;
	}
	



}