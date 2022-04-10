public class Faculty extends Employee{
	private int officeHours;
	private int ranks;

	Date hiredDate = new Date(12,04,2022);
	public Faculty(String a, String n, String p, String e,double s, int o, Date hd, int oh, int r){
		super(a, n, p, e, s, o, hd);
		officeHours = oh;
		ranks = r;

	}

	public void display(){
		System.out.println("Person Name: " + getName());
		System.out.println("Person Address: " + getAddress());
		System.out.println("Person Phone-No: " + getPhoneNumber());
		System.out.println("Person Email: " + getEmail());
		System.out.println("Employee Office: " + getOffice());
		System.out.println("Employee Salary: " + getSalary());
		System.out.println("Employee Date: " + hiredDate.getDay()+ "-" + hiredDate.getMonth()+ "-" + hiredDate.getYear());
		System.out.println("Faculty Office Hours: " + officeHours);
		System.out.println("Ranks: " + ranks);
	}
}