public abstract class Package{

	//Data Members
	protected String name;
	protected String address;
	protected double weightPerOunce;
	protected double costPerOunce;


	//Full-Argument Constructor
	public Package(String n, String add, double wpo, double cpo){
		if(n != "" && add != "" && wpo != 0 && cpo != 0){
			name = n;
			address = add;
			weightPerOunce = wpo;
			costPerOunce = cpo;
		}
	}

	public abstract double calculateCost();


}