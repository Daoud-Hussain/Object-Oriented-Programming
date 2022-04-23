public class Person{

	//Data Members
	private String name;
	private int age;


	public Person(){
		//Default Constructor
	}


	//Argument-Constructor
	public Person(String n, int a){
		if(n!="" && a > 0){
			name = n;
			age = a;
		}
	}

	//Setter
	public void setName(String n){
		if(n!=""){
			name = n;
		}
	}


	public void setAge(int a){
		if(a > 0){
			age = a;
		}
	}


	//Getters
	public String getName(){
		return name;
	}


	public int getAge(){
		return age;
	}


	public String toString(){
		String text = name + " " + age;
		return text;
	}


}