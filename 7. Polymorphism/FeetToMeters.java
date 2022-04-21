public class FeetToMeters extends Convert{
	

	//One-Argument-Constructor
	public FeetToMeters(double v1){
		super(v1);
	}


	//Over-riding method in child class 
	public double compute(){
		double res = val1 * 0.3048 ;
		super.setVal2(res);
		return  val2; 

	}	
}