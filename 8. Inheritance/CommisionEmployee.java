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
	public CommisionEmployee(String fn, String ln, String ssl, double gs, double cr){
		firstName = fn;
		lastName = ln;
		ssl = ssl;
		grossSales = gs;
		commisionRate = cr;
	}

	public void display(){
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("SSL: " + ssl);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Commision Rate: " + commisionRate);
	}

	



}