public abstract class Person{

	//Data Members
	protected String name;


	//Setter
	public void setName(String n){
		if(n!=""){
			name = n;
		}
	}


	//Getters
	public String getName(){
		return name;
	}

	public abstract boolean isOutstanding();


}