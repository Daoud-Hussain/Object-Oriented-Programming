public class Manager{

	//Data Members
	private Employee[] eArray;
	private int noOfProjects;
	private int projectPay;
	

	//Argument-Constructor
	public Manager(Employee[] e_arr, int np, int pp){
		for(int i = 0; i < e_arr.length; i++){
			eArray[i] = e_arr[i];
		}
		noOfProjects = np;
		projectPay = pp;
	}


	public double earnings(){
		return projectPay * noOfProjects;
	}


}