public class Invoice implements Payable{
	private String partNumber;
	private String partDescription;
	private int quanity;
	private double pricePerItem;




	public Invoice(String pNumber, String pDes, int quan, double ppi){
		partDescription = pDes;
		partNumber =  pNumber;
		quanity = quan;
		pricePerItem = ppi;
	}
	
	public double getPaymentAmount(){
		return quanity * pricePerItem;
	}
}