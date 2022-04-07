public class QuadraticEquation{
	int a, b, c;
	public QuadraticEquation(){
		//Default Constructor
	}
	public QuadraticEquation(int first, int second, int third){
		if(first>=0 && second>=0 && third>=0){
			a=first;
			b=second;
			c=third;
		}

		

	}
	//Reseting values of A
	public void setValues(int first){
		if(first>=0){
			a=first;

		}
	}
	public void display(){
		System.out.printf("Value of A: %d \nValue of B: %d \nValue of C: %d \n", a,b,c);
	}
	public int getDiscriminant(){
		int disc = b*b - 4*a*c;
		return disc;
	} 
	public boolean checkIfDescriminantIsGretaerThan100(){
		if(getDiscriminant()>100){
			return true;
		}
		else{
			return false;
		}
	}

}