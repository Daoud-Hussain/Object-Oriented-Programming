
public class Student{
	int[] Result = new int[5];
	String name;

	public Student(){
		//Default Constructor
	}

	//One-Arg Constructor
	public Student(String n){
		if(n!=""){
			name = n;
		}
	} 
	//Two Arg constructor
	public Student(String n, int[] s){
		if(n!=""){
			name = n;
		}
		if(s.length>=Result.length){
			for (int i=0; i<Result.length-1 ;i++ ) {
				Result[i] = s[i];
			}
		}
		else{
			for (int i=0; i<s.length-1 ;i++ ) {
				Result[i] = s[i];
			}
		}
	}

	public double average(){
		int sum = 0;
		for(int i=0; i<Result.length-1;i++){
			sum+=Result[i];
		}
		return sum/Result.length;
	}

	public Student(Student s){
		this.name = s.name;
		for(int i=0; i<Result.length; i++){
			this.Result[i] = s.Result[i];
		}
	}

	public boolean equals(Student s){
		if(this.name == s.name){
			for(int i=0; i<Result.length; i++){
				if(this.Result[i]==s.Result[i]){
					return true;
				}
			}
		}
		return false;
	}

	public boolean compareAverage(Student s){
		if(this.average() == s.average()){
			System.out.print("Haaan");
			return true;
		}
		return false;
	}

}
