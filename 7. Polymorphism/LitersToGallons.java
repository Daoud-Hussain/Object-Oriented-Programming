public class LitersToGallons extends Convert{
	

	//One-Argument-Constructor
	public LitersToGallons(double v1){
		super(v1);
	}


	//Over-riding method in child class 
	public double compute(){
		double res = val1 * 0.264172 ;
		super.setVal2(res);
		return  val2; 

	}	
}