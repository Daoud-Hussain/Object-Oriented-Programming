public class Employee2{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	private Job jobDetail;

	Employee2(){
		Date birthDate = new Date();
		Date hireDate = new Date();
		Job jobDetail = new Job();
	}

	Employee2(String f, String l, Date b, Date h, Job j){
		firstName = f;
		lastName = l;
		birthDate = b;
		hireDate = h;
		jobDetail = j;

	}

	public void setFirstName(String fn){
		if(fn != ""){
			firstName = fn;
		}
	}

	public void setLastName(String ln){
		if(ln != ""){
			lastName = ln;
		}
	}

	public void setBirthDate(Date bd){
		birthDate = bd;
	}

	public void setHireDate(Date hd){
		hireDate = hd;
	}

	public void setJobDetail(Job hd){
		jobDetail = hd;
	}

	public Job getJobDetail()
    {
        return jobDetail;
    }

	public Date getHireDate()
    {
        return hireDate;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }


	public void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(birthDate.getDay() + " "+ birthDate.getMonth() + " " +  birthDate.getYear() + " ");
		System.out.println(hireDate.getDay() + " "+ hireDate.getMonth() + " " +  hireDate.getYear() + " ");
		System.out.println(jobDetail.getId() + " "+ jobDetail.getSalary() + " " +  jobDetail.getDesignation() + " ");

	}

	public boolean checkExperienced(int currentYear){
		if(currentYear - hireDate.getYear() >=  5 ){
			return true;
		}
		else{
			return false;

		}
	}

	public boolean checkSalary(){
		if(jobDetail.getSalary() > 50000){
			return true;
		}
		return false;
	}
    
}