public class VerifiedSimple extends Simple{

	public int add(){
		if(num1 > 0 && num2 >0){
			return num1+num2;
		}
		else{
			System.out.println("Error! Addition function will be evaluated iff both values will be greater than 0");
			return -1;
		}
	}


	public int sub(){
		if(num1 > 0 && num2 >0){
			return num1-num2;
		}
		else{
			System.out.println("Error! Subtract function will be evaluated iff both values will be greater than 0");
			return -1;
		}
	}

	public int mul(){
		if(num1 > 0 && num2 >0){
			return num1+num2;
		}
		else{
			System.out.println("Error! Multiply function will be evaluated iff both values will be greater than 0");
			return -1;
		}
	}

	public int div(){
		if(num1 > 0 && num2 >0){
			return num1/num2;
		}
		else{
			System.out.println("Error! Division function will be evaluated iff both values will be greater than 0");
			return -1;
		}
	}
}