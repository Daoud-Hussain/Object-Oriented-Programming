//1. Runner Rectangle Class
/* 
public class Runner{
	public static void main(String[] args) {
		Rectangle a1 = new Rectangle(); //Setting default values
		Rectangle a2 = new Rectangle(122,222); //2 Argument Values
		a2.calculateArea();
		a2.checkSquare();
		a2.display();
		a2.compareArea(a1);
		a2.checkSquare();
		a2.compareArea(a1);


	}
}

*/

//2. Runner Account Class
/* 
public class Runner{
	public static void main(String[] args) {
		Account a1 = new Account(); 
		Account a2 = new Account(2000);
		Account a3 = new Account(122, "37201-3209291-7", 2002);
		a3.withDraw(700);
		a3.deposit(100);
		a3.display();
		a3.checkValidCnic();


	}
}

*/

//3. Runner Point Class
/* 
public class Runner{
	public static void main(String[] args) {
		Point a1 = new Point(); //Setting default values
		Point a2 = new Point(-1,3); //2 Argument Values
		a2.move(3,4);
		a2.checkOrigin();
		a2.display();
		a2.AddTwoPoints(a1);
		a2.AddThreePoints(a1,a2);

	}
}

*/

//4. Runner Student Class
/* 
public class Runner{
	public static void main(String[] args) {
		int[] arr= {10,23,34,44,53};
		Student s1 = new Student();

		Student s2 = new Student("Daoud", arr);
		s2.average();
		s1.compareAverage(s2);



		
	}
}


*/

//5. Runner Book Class
/* 
public class Runner{
	public static void main(String[] args) {
		String[] arr= {"Introduction","Sequence","Selection","Repetititon","Functions"};
		Book a1 = new Book(); //Setting default values

		Book a2 = new Book("Rizwan Rashid", arr); //2 Argument Values
		a2.compareAuthors(a1);
		a2.compareChapters(a1);
	}
}


*/

//6. Runner University Class
public class Runner{
	public static void main(String[] args) {
		String[] arr= {"CE","CS" ,"Cyber Security","AI","DS"};
		University a1 = new University(); //Setting default values


		University a3 = new University("COMSATS", "Islamabad", " Fazal Mehmood", arr); //Full Argument Constructor
		a3.checkIfLocatedInCapital();
		a3.addADepartment("SE");
		a3.getDepartments();

	}
}



