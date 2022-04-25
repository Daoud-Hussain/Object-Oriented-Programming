//1. Runner for Shape interface
/*
public class Runner{
	public static void main(String[] args) {
		Shape[] shp = new Shape[2];
		shp[0] = new Circle(5);
		shp[1] = new Rectangle(3, 5);

		for(int i = 0; i < shp.length; i++){
			System.out.println(shp[i].getArea());
		}
	}
}
*/

//2. Runner for Payable interface

public class Runner{
	public static void main(String[] args) {
		Payable[] pb = new Payable[2];
		pb[0] = new Invoice("10", "Good", 3, 900);
		pb[1] = new SalariedEmployee("Daoud", "Hussain", "122", 15540);

		for(int i = 0; i < pb.length; i++){
			System.out.println(pb[i].getPaymentAmount());
		}
	}
}