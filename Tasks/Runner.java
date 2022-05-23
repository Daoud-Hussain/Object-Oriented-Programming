//1. Runner for Exam class

public class Runner{
	public static void main(String[] args) {
		int score;
		Question[] ques = new Question[10];
		Student stu = new Student("Daoud", 19, "SP21-BCS-102", "012345");
		ques[0] = new Question("01", "20+10=?", "30");
		ques[1] = new Question("02", "20-10=?", "10");
		ques[2] = new Question("03", "20*10=?", "200");
		ques[3] = new Question("04", "20/10=?", "2");
		ques[4] = new Question("05", "5*4=?", "20");
		ques[5] = new Question("06", "5+4=?", "9");
		ques[6] = new Question("07", "5*5=?", "25");
		ques[7] = new Question("08", "10+3=?", "13");
		ques[8] = new Question("09", "20%2=?", "0");
		ques[9] = new Question("10", "10*10=?", "100");


		Exam annualExam = new Exam(ques, stu, 0);
		
		annualExam.takeExam();
		annualExam.displayStatus();


		
	}


}


//2. Runner for Employee class
/*
public class Runner{
	public static void main(String[] args) {
		Employee e1 = new Employee("Admin", 30, 9);
		Employee e2 = new Employee("Clerk", 35, 8);
		Employee e3 = new Employee("Operator", 30, 8);

		Employee[] myEmployee = new Employee[3];
		myEmployee[0] = e1; 
		myEmployee[1] = e2; 
		myEmployee[2] = e3; 


		Manager man = new Manager(myEmployee, 9, 15000);

		for(int i = 0; i < myEmployee.length; i++){
			System.out.println(man.earnings()+ " ");
			System.out.println(man.toString()+ " ");
		}

	}
}
*/