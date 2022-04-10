public class Marks{
	private int m1,m2,m3;
	public Marks(){
	}
	
	public Marks(int a,int b,int c){
		//Argument Constructor
		if(a>0 && b>0 && c>0){
			m1 = a;
			m2 = b;
			m3 = c;
		}
		
	}
	public void setM1(int b){
		if(b>0){
			m1 = b;
		}
	}

	public void setM2(int b){
		if(b>0){
			m2 = b;
		}
	}

	public void setM3(int b){
		if(b>0){
			m1 = b;
		}
	}

	public int getM1(){
		return m1;
	}

	public int getM2(){
		return m2;
	}

	public int getM3(){
		return m3;
	}

	//Moving point x
	public int calculateTotalMarks(){
		return m1+m2+m3;
	}

	public int calculatePercentage(){
			return (calculateTotalMarks()*100)/300;
	}
	public void display(){
		System.out.println("Marks 1: "+ m1 + " Marks 2: "+ m2 + " Marks 3: "+ m3);
	}
}