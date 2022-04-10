public class Runner{
	public static void main(String[] args) {
		String[] arr= {"CE","CS" ,"Cyber Security","AI","DS","SE","Maths","Bio-Informatics","Physics","BBA","English","Economics", "BAF", "Political Science", "IR","Chemistry","Bio-Tech","Pharm","IT"};
		University a1 = new University(); //Setting default values

		University a2 = new University("Hamdard","Islamabad"); //2 Argument constructor
		University a3 = new University("COMSATS", "Islamabad", " Fazal Mehmood", arr); //Full Argument Constructor
		a3.checkIfLocatedInCapital();
		a3.searchDepartment();
		a3.addADepartment("EE");
		a3.display();

	}
}