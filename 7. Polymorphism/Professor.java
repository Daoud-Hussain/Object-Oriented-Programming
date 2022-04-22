public class Professor extends Person{
	int numberOfPublications;



	//Setter
	public void setNumberOfPublications(String nam, int n){
		super.setName(nam);
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