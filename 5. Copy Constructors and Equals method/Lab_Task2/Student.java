public class Student{
	double gpa;
	String[] Subjects = new String[5];
	String name,email;

	public Student(){
		//Default Constructor
	}
	public Student(double g, String n, String e, String[] s){
		if(g>=0.0 && e!="" && n!=""){
			gpa = g;
			email = e;
			name = n;
		}
		else{
			gpa=0.0;
		}
		if(s.length>=Subjects.length){
			for (int i=0; i<Subjects.length-1 ;i++ ) {
			Subjects[i] = s[i];
			}
		}
		else{
			for (int i=0; i<s.length-1 ;i++ ) {
			Subjects[i] = s[i];
			}
		}
	}
	
	//ReSetting values  of Name
	public void setValues(String n){
		if(n!=""){
			name = n;
		}
	}
	
	public boolean searchSubject(String subjectName){
		boolean flag = false;
		for(int i=0; i<Subjects.length-1; i++){
			if(subjectName==Subjects[i]){
				flag = true;
			}
			else{
				flag = false;
			}
		}
		if(flag){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkProbStatus(){
		if(gpa<2.0)
			return true;
		else{
			return false;
		}
	}

	public boolean validateEmail(){
		String validEmail = "@gmail.com";
		if(email.contains(validEmail)){
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		System.out.printf("Records are: \nName: %s\nGPA: %5.2f\nEmail: %s \nSubjects: ", name, gpa, email);
		for(int i=0; i<Subjects.length-1;i++){
			if(Subjects[i]!=null){
				System.out.print(Subjects[i] + " ");
			}
			
		}
	}

}

