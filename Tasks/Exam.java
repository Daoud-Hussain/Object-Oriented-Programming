public class Exam{
	private Question[] q = new Question[10];
	private Student s;
	private double score;

	
	public void setS(String nam, String regn, int ag, String psw){
		s.setregNo(nam, regn);
		s.setpswd(ag, psw);
	}

	public void setQ(String ido, String qs, String ans){
		q[0].setId(ido);
		q[0].setAnswer(ans);
		q[0].setquesStatement(qs);
	}

	public String getS(){
		return getRe
	}
	
}