public class Question{

	//Data Members
	private String id;
	private String quesStatement;
	private String answer;


	//Argument-Constructor
	public Question(String n, String a, String ans){
		if(n!="" && a != "" && ans != ""){
			id = n;
			quesStatement = a;
			answer = ans;
		}
	}

	//Setter
	public void setId(String n){
		if(n!=""){
			id = n;
		}
	}



	public void setAnswer(String n){
		if(n!=""){
			answer = n;
		}
	}

	public void setquesStatement(String a){
		if(a != ""){
			quesStatement = a;
		}
	}


	//Getters
	public String getid(){
		return id;
	}


	public String getAnswer(){
		return answer;
	}

	public String getquesStatement(){
		return quesStatement;
	}


	public String toString(){
		String text = id + " " + quesStatement + " " + answer;
		return text;
	}


}