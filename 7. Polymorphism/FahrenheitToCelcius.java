public class FahrenheitToCelcius extends Convert{
	
	//One-Argument-Constructor
	public FahrenheitToCelcius(double v1){
		super(v1);
	}

	//Over-riding method in child class 
	public double compute(){
		double res = (val1 - 32)/1.8000;
		super.setVal2(res);
		return  val2; 

	}	
}