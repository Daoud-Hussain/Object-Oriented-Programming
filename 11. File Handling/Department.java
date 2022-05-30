import java.util.*;

public class Department{
	private String name;
	private String location;


	public Department(){
		//Default Argument Constructor
	}

	public Department(String name, String location){
		this.name = name;
		this.location = location;
	}

	//Setters
	public void setName(String name){
		if(name != "")
			this.name = name;
	}

	public void setlocation(String location){
		if(location != "")
			this.location = location;
	}


	//Getters
	public String getName(){
		return this.name;
	}

	public String getLocation(){
		return this.location;
	}
}