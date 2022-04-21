public class Professor extends Person{
	int numberOfPublications;



	//One-Argument-Constructor
	public Professor(String n, int np){
		super(n);
		numberOfPublications = np;
	}

	//Setter
	public void setNumberOfPublications(int n){
		if(n!=0){
			numberOfPublications = n;
		}
	}


	//Getters
	public int getNumberOfPublications(){
		return numberOfPublications;
	}

	//Over-riding method in child class 
	public boolean isOutstanding(){
		if(numberOfPublications > 50){
			return true;
		}
		return false;


	}	
}