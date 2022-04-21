//1. Runner for Employee and its Sub classes
/*
public class Runner{
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new CommisionEmployee("Daoud", "Hussain", "345924", 1270, 1500);
		emp[1] = new WeeklyEmployee("Daoud", "Hussain", "345924", 8000);
		emp[2] = new HourlyEmployee("Daoud", "Hussain", "345924", 9, 40);
		emp[3] = new BasePlusCommisionEmployee("Daoud", "Hussain", "345924", 1270, 1500, 25000);

		for(int i=0; i < emp.length; i++){
			System.out.println(emp[i].toString());
			emp[i].earnings();
		}

	}
}
*/


//2. Runner for package and subclasses

public class Runner{
	public static void main(String[] args) {
		Package[] p = new Package[2];
		p[0] = new OverNightPackage("Daoud", "Park-Road Islamabad", 20.4, 9.0, 20000);
		p[1] = new TwoDayPackage("Hussain", "Hostel-City Islamabad", 20.4, 9.0, 1500);


		for(int i = 0; i < p.length; i++){
			System.out.println(p[i].calculateCost());
		}

	}
}



//3. Runner for movie and subclasses
/*
public class Runner{
	public static void main(String[] args) {
		Movie[] mv = new Movie[2];
		mv[0] = new Comedy();
		mv[1] = new Drama();

		for(int i=0; i < mv.length; i++){
			System.out.println(mv[i].calculateFees());

		}
		System.out.print(mv[0].equals(mv[1]));

	}
}
*/