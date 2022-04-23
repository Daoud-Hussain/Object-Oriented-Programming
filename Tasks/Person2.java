public abstract class Person2{

	//Data Members
	private String firstName;
	private Date hireDate;
	private boolean hasCompanyCar;


	Date hd = new Date(21,04,2022);

	//Argument-Constructor
	public Person2(String fn, Date hd, boolean hcr){
		if(fn!=""){
			firstName = fn;
			hireDate = hd;
			hasCompanyCar = hcr;
		}
	}

	public abstract double earnings();


}