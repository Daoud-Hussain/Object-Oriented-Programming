public abstract class Convert{

	//Data Members
	protected double val1;
	protected double val2;


	//One-Argument-Constructor
	public Convert(double v1){
		if(v1 != 0){
			val1 = v1;
		}
	}

	public void setVal2(double v){
		val2 = v;
	}


	public abstract double compute();


}