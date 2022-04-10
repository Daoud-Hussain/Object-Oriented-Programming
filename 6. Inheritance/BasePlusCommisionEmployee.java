public class BasePlusCommisionEmployee extends CommisionEmployee{
	double salary;

	//Child Class Object
	public BasePlusCommisionEmployee(String fn, String ln, String ssl, double gs, double cr ,double sal){
		super(fn,ln,ssl,gs,cr);
		salary = sal;
	}

	//Reseting Value of Salary in child class
	void setSalary(double sal){
		if(sal != 0){
			salary = sal;
		}
	}

	//Geting Value of Salary from child class
	double getSalary(){
		return salary;
	}	


	//Method to display Child class data
	public void display(){
		super.display();
		System.out.println("Salary: " + salary);
		System.out.println("Earning: " + calculateEarning());
	}

	//Method to calculate Child class earning that is parent earning + child salary
	public double calculateEarning(){
		return super.calculateEarning()+salary;
	}
}