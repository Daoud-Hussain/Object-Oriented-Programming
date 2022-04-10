public class Employee extends Person2{
	private double salary;
	private int office;
	private Date hireDate;

	Date hd = new Date();
	

	public Employee(String a, String n, String p, String e,double s, int o, Date hd){
		super(a, n, p, e);
		salary = s;
		office = o;
		hireDate = hd;

	}


	public Date getHireDate()
    {
        return hireDate;
    }
    
    public double getSalary()
    {
        return salary;
    }

    public int getOffice()
    {
        return office;
    }
}