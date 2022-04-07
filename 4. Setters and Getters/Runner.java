public class Runner{
	public static void main(String[] args) {
		
		Marks a1 = new Marks(70,80,90); 
		Marks a2 = new Marks(90,85,89); 
		
		if(a1.getM1() > a2.getM2()){
			System.out.println("Marks of First student are greater");
		}
		else if(a1.getM1() < a2.getM2()){
			System.out.println("Marks of Second student are greater");
		}
		else{
			System.out.println("Both Student marks are equal");
		}
		
		if(a1.calculatePercentage() > a2.calculatePercentage()){
			System.out.println("Percentage of First student are greater");
		}
		else if(a1.calculatePercentage() < a2.calculatePercentage()){
			System.out.println("Percentage of Second student are greater");
		}
		else{
			System.out.println("Both Student Percentage are equal");
		}
	}
}