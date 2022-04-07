public class Account{
	int balance,yearOfOpening;;
	String cnic;

	public Account(){
		//Default Constructor
	}
	public Account(int a){
		if(a>=0){
			balance = a;
		}
		else{
			balance = 0;
		}
	}
	public Account(int a, String b, int c){
		if(a>=0 && c>=0){
			balance = a;
			cnic = b;
			yearOfOpening = c;
		}else{
			balance = 0;
			yearOfOpening = 0;
		}
		
	}
	//ReSetting values  of balance
	public void setValues(int a){
		balance = a;
	}
	
	public int withDraw(int withdrawalValue){
		if(withdrawalValue>=0){
			balance = balance-withdrawalValue;
		}
		return balance;
	}
	public int deposit(int depositedValue){
		if(depositedValue>=0){
			balance = balance+depositedValue;
		}
		return balance;
	}
	
	//Giving Current year as argument
	public int calculateAgeOfAccount(int currentYear){
		int age=0;
		if(currentYear>=yearOfOpening){
			age = currentYear-yearOfOpening;
		}
		System.out.println("Age of Account is: " + age);
		return age;
	}
	public void display(){
		System.out.printf("Value is: \nBalance is: %d \nCnic is: %s \nYear Of Opening is %d: \n", balance, cnic, yearOfOpening);
	}

}

