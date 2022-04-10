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
	
	public void display(){
		System.out.printf("Value is: \nBalance is: %d \nCnic is: %s \nYear Of Opening is %d: \n", balance, cnic, yearOfOpening);
	}

	//copy Constructor
	public Account(Account a){
		this.balance = a.balance;
		this.yearOfOpening = a.yearOfOpening;
		this.cnic = a.cnic;
	}

	//Equals Method
	public boolean equals(Account a){
		if(this.balance == a.balance && this.yearOfOpening == a.yearOfOpening && this.cnic == a.cnic){
			return true;
		}
		return false;

	}

	public boolean checkValidCnic(){
		if(cnic.length() == 15){
			return true;
		}
		return false;
	}
}

