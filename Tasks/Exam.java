public class Exam{
	private Question[] q = new Question[10];
	private Student s;
	private double score;

	//Setters
	public void setS(String nam, String regn, int ag, String psw){
		s.setregNo(nam, regn);
		s.setpswd(ag, psw);
	}

	public void setQ(String ido, String qs, String ans){
		q[0].setId(ido);
		q[1].setAnswer(ans);
		q[2].setquesStatement(qs);
	}


	//Getters
	public String getS(){
		return q[0].getid() + "" + q[2].getquesStatement() + " " + q[1].getAnswer(); 
	}


	public String toString(){
		String text = getS();
		return text;
	}

	public void takeExam(){
		
	}
}