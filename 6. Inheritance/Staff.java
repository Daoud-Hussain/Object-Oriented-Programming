public class Staff extends Employee{
	private String title;

	Date hiredDate = new Date(31,3,2022);
	public Staff(String a, String n, String p, String e,double s, int o, Date hd, String t){
		super(a, n, p, e, s, o, hd);
		title = t;

	}


	public void display(){
		System.out.println("Person Name: " + getName());
		System.out.println("Person Address: " + getAddress());
		System.out.println("Person Phone-No: " + getPhoneNumber());
		System.out.println("Person Email: " + getEmail());
		System.out.println("Employee Office: " + getOffice());
		System.out.println("Employee Salary: " + getSalary());
		System.out.println("Employee Date: " + hiredDate.getDay()+ "-" + hiredDate.getMonth()+ "-" + hiredDate.getYear());
		System.out.println("Staff Title: " + title);
	}
}