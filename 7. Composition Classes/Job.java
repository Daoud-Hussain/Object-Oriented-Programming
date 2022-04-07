public class Job{
	private int salary;
	private String designation;
	private int id;



	Job(){

	}
	Job(int h, String s, int c){
			salary = h;
			designation = s;
			id = c;
	}

	public int getSalary(){
		return salary;
	}

	public int getId(){
		return id;
	}


	public String getDesignation(){
		return designation;
	}

}