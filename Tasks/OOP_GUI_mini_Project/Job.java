import java.io.Serializable;

public class Job implements Serializable{
    private String designation;
    private  double salary;

    public Job(){
    //Default Argument Constructor
    }


    //Full-Argument Constructor
    public Job( String designation, double salary){
        if(salary > 0){
            this.salary = salary;
        }
        
        if(designation != ""){
            this.designation = designation;
        }
    }

    //Setters
    public void setdesignation(String designation){
        if(designation != ""){
            this.designation = designation;
        }
    }
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }

    //Getters
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
}