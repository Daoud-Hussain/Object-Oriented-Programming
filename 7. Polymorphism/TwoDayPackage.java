public class TwoDayPackage extends Package{
	private int flatFee;


	//Full-Argumented Constructor
	public TwoDayPackage(String n, String add, double wpo, double cpo, int ff){
		super(n, add, wpo, cpo);
		flatFee = ff;
	}


	//Over-riding method in child class 
	public double calculateCost(){
		return (costPerOunce * weightPerOunce) + flatFee ;

	}	
}