//1. Runner Rectangle Class
/*
public class Runner{
	public static void main(String[] args) {
		
		Rectangle a1 = new Rectangle(); //Setting default values
		a1.getLength();

		Rectangle  a2 = new Rectangle (15,25); //2 Argument constructor
		a2.setLength(17);
		a2.setWidth(20);
		a2.getLength();
		a2.getWidth();
		a2.calculateArea();

		if(a1.getLength() > a2.getLength()){
			System.out.print(a1.getLength()); 
		}
		else if(a1.getLength() < a2.getLength()){
			System.out.print(a2.getLength()); 

		}
		else{
			a1.getLength();
		}

	}
}

*/

//2. Runner Point Class
/*
public class Runner{
	public static void main(String[] args) {
		
		Point a1 = new Point(); //Setting default values
		Point  a2 = new Point(15,25); //2 Argument constructor
		a2.setX(17);
		a2.setY(a1.getX());
		a2.getX();
		a2.getY();
		a2.movePointX(12);
		a2.display();

	}
}



*/

//3. Runner Student Class
/*
public class Runner{
	public static void main(String[] args) {
		int[] arr = {40,23,45,23,50};
		
		Student a1 = new Student(); //Setting default values
		a1.calculateAverage();
		Student a2 = new Student("Ahmed",arr); //2 Argument constructor
		a2.calculateAverage();
		a2.setName("Daoud");
		a2.setMarks(arr);


		Student a3 = new Student(a1.getName(), a2.getMarks()); //2 Argument constructor
		a3.display();


	}
}


*/

//4. Runner Account Class
/*
public class Runner{
	public static void main(String[] args) {
		
		Account a1 = new Account(25000); 
		Account a2 = new Account(a1.getBalance()); 
		a2.depositBalance(5000);
		a2.withdrawBalance(10000);
		
	}
}


*/

//5. Runner Marks Class
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
