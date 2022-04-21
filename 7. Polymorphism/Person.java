public abstract class Person{

	//Data Members
	protected String name;


	//One-Argument-Constructor
	public Person(String n){
		if(n != ""){
			name = n;
		}
	}


	public abstract boolean isOutstanding();


}