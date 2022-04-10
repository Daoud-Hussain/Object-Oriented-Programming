public class Computer{
	private int wordSize, memorySize;
	private int storageSize, speed;



	public Computer(){
		//Default Constructor
	}

	//Full-Argument Constructor	
	public Computer(int ws, int ms, int ss, int s){

		if(ws!=0 && ms!=0 && ss!=0 && s!=0 ){
			wordSize = ws;
			memorySize = ms;
			storageSize = ss;
			speed = s;
		}

	}

	//Method to display Parent class data
	public void display(){
		System.out.println("Word Size: " + wordSize + "wpm");
		System.out.println("Memory: " + memorySize + "GB");
		System.out.println("Storage: " + storageSize + "GB");
		System.out.println("Speed: " + speed + "mbps");
	}

}