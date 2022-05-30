import java.util.*;

public class Person{
	private String name;
	private String phone;
	private String gender;


	public Person(){
		//Default Argument Constructor
	}

	public Person(String name, String phone, String gender){
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	//Setters
	public void setName(String name){
		if(name != "")
			this.name = name;
	}

	public void setPhone(String phone){
		if(phone != "")
			this.phone = phone;
	}

	public void setGender(String gender){
		if(gender != "")
			this.gender = gender;
	}


	//Getters
	public String getName(){
		return this.name;
	}

	public String getGender(){
		return this.gender;
	}

	public String getPhone(){
		return this.phone;
	}
}