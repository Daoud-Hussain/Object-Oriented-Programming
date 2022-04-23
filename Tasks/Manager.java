public class Manager{

	//Data Members
	private Employee[] eArray;
	private int noOfProjects;
	private int projectPay;
	

	//Argument-Constructor
	public Manager(Employee[] e_arr, int np, int pp){
		this.eArray = e_arr;
		noOfProjects = np;
		projectPay = pp;
	}


	public double earnings(){
		return projectPay * noOfProjects;
	}


}