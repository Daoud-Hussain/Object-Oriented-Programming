public class Account{
	private int balance;
	public Account(){
	}
	
	public Account(int b){
		//Argument Constructor
		if(b>0){
			balance = b;
		}
		
	}
	public void setBalance(int b){
		//Default Argument Constructor
		if(b>0){
			balance = b;
		}
	}

	public int getBalance(){
		return balance;
	}

	//Moving point x
	public int depositBalance(int b){
		if(b>0){
			balance = balance+b;
		}
		return balance;
	}

	public int withdrawBalance(int b){
		if(b>0){
			balance = balance-b;
		}
		return balance;
	}
}