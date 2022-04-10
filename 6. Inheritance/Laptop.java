public class Laptop extends Computer{
	private int length, width;
	private int height, weight;

	public Laptop(){
		//Default Constructor
	}

	//Full-Argument Constructor	
	public Laptop(int ws, int ms, int ss, int s,int l, int w, int h, int we){
		super(ws, ms, ss, s);
		if(l!=0 && w!=0 && h!=0 && we!=0){
			length = l;
			width = w;
			height = h;
			weight = we;
		}


	}

	//Method to display Child and Parent class data
	public void display(){
		//Overriding base class method
		super.display();
		System.out.println("Length: " + length + "m");
		System.out.println("Width: " + width + "m");
		System.out.println("Height: " + height + "m");
		System.out.println("Weight: " + weight + "kg");
		
	}

}