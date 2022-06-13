import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String headName;
	private Job j;

	Job hd = new Job();
	

	public Employee(String a, String n,Job hd){
		name = a;
		headName = n;
		j = hd;

	}

	public void setSalary(double salary){
		j.setSalary(salary);
	}
	public void setDesignation(String designation){
		j.setdesignation(designation);
	}


	public Job getj()
    {
        return j;
    }
    
    public String getname()
    {
        return name;
    }

    public String getheadName()
    {
        return headName;
    }
}