public class Employee{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;

	Employee(){
		Date birthDate = new Date();
		Date hireDate = new Date();
	}

	Employee(String f, String l, Date b, Date h){
		firstName = f;
		lastName = l;
		birthDate = b;
		hireDate = h;

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

	}

	public boolean checkExperienced(int currentYear){
		if(currentYear - hireDate.getYear() >=  5 ){
			return true;
		}
		else{
			return false;

		}
	}
    
}