public class Student{
	private String name;
	private int[] result_Array = new int[5];
	public Student(){
	}
	
	public Student(String n , int[] temp_Array){
		//Argument Constructor
		if(n!=""){
			name = n;
		}
		if(temp_Array.length > result_Array.length){
			for(int i=0; i<result_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
		else if(temp_Array.length < result_Array.length){
			for(int i=0; i<temp_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
		else{
			for(int i=0; i<result_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
	}
	public void setName(String n){
		//Default Argument Constructor
		if(n!=""){
			name = n;
		}
	}
	public void setMarks(int[] temp_Array){
		if(temp_Array.length > result_Array.length){
			for(int i=0; i<result_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
		else if(temp_Array.length < result_Array.length){
			for(int i=0; i<temp_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
		else{
			for(int i=0; i<result_Array.length; i++){
				result_Array[i] = temp_Array[i];
			}
		}
	}

	public String getName(){
		return name;
	}

	public int[] getMarks(){
		return result_Array;
	}

	//Moving point x
	public int calculateAverage(){
		int sum=0; 
		for(int i=0; i<result_Array.length; i++){
				sum = sum+result_Array[i];
		}
		return sum/result_Array.length;
	}

	public void display(){
		System.out.println("NAME: "+ name);
		for(int i=0; i<result_Array.length; i++){
			System.out.print(result_Array[i] + " ");
		}
	}
}