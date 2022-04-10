public class Vehicle{
	String manufacturerName;
	int numberOfCylinders;
	Person owner;

	public Vehicle(){
		Person p1 = new Person();
	}


	public Vehicle( String mn, int nc, Person p1){
		if(mn != "" && nc !=0){
			manufacturerName = mn;
			numberOfCylinders = nc;
			owner = p1;
		}
	}
}