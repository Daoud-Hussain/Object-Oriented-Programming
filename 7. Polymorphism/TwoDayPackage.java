public class TwoDayPackage extends Package{
	private int flatFee;


	//Full-Argumented Constructor
	public TwoDayPackage(String n, String add, int wpo, int cpo, int ff){
		super(n, add, wpo, cpo);
		flatFee = ff;
	}
}