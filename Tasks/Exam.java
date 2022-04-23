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
	public void setS(String nam, String regn, int ag, String psw){
		s.setregNo(nam, regn);
		s.setpswd(ag, psw);
	}

	public void setQ(String ido, String qs, String ans){
		q[6].setId(ido);
		q[6].setAnswer(ans);
		q[6].setquesStatement(qs);
	}


	//Getters
	public String getS(){
		return q[0].getid() + "" + q[2].getquesStatement() + " " + q[1].getAnswer(); 
	}


	public String toString(){
		String text = getS();
		return text;
	}


	public void getExam(){
		System.out.print("QUESTIONS");
		System.out.println("10+2=?");
		q[0] = input.nextLine()
		System.out.println("10+2=?");
		System.out.print("10+2=?");
		
	}

}