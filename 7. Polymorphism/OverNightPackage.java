public class OverNightPackage extends Package{
	private int additionalFee;


	//Full-Argumented Constructor
	public OverNightPackage(String n, String add, double wpo, double cpo, int ff){
		super(n, add, wpo, cpo);
		additionalFee = ff;
	}


	//Over-riding method in child class 
	public double calculateCost(){
		return (costPerOunce * weightPerOunce) + additionalFee ;

	}	
}