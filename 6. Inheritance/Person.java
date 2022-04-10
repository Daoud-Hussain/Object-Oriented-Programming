public class Person{
	int age;
	String name;


	public Person(){
	//Default Constructor
	}

	//Full-Argument Constructor
	public Person(int a, String n){
		if(a > 0 && n!=""){
			name = n;
			age = a;
		}
	}


	public int getAge(){
		return age;
	}

	public String getName(){
		return name;
	}
}

