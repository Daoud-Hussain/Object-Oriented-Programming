import java.util.*;
public class Comedy extends Movie{
	

	public double calculateFees(){
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the number of movie late days: ");
		int days = input.nextInt();

		return days*2.50;
	}
	
}