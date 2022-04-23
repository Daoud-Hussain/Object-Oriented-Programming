import java.util.*;
public class Exam{
	private Question[] q = new Question[10];
	private Student s;
	private double score;
	Scanner input = new Scanner(System.in);


	public Exam(Question ques[], Student stu, double scr){
		this.q = ques;
		this.s = stu;
		this.score = scr; 
	}

	//Setters
	public void setS(Student stu){
		this.s = stu;
	}

	public void setQ(String ido, String qs, String ans){
		q[0].setId(ido);
		q[0].setAnswer(ans);
		q[0].setquesStatement(qs);
	}


	//Getters
	public Student getS(){
		return this.s; 
	}


	public void takeExam(){
		String ans;

		for(int i = 0; i < q.length; i++){
			System.out.print(i+1 + ". " + q[i].getquesStatement() + " ");
			ans = input.next();

			if(ans.equals(q[i].getAnswer())){
				score += 10;
			}

		}

	}


	public void displayStatus(){
		if(score >= 50){
			System.out.println("Congratulations " + s.getName() +  " You're pass!!");
		}
		else{
			System.out.println("Try Again " + s.getName() +  " You're Fail!!");
		}
	}

}