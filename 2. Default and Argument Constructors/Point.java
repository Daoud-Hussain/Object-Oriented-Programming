public class Point{
	int x, y;
	public Point(){
		//Default Constructor
	}

	//2 argument Constructor
	public Point(int a, int b){
		x = a;
		y = b;

	}
	public void display(){
		System.out.printf("Value of A: %d and Value of B: %d", x, y);
	}

	public void setValues(int a){
		x = a;
	}
	//a and b are the points that how far you move in x and y coordinates
	public void move(int a, int b){
		x = a+x;
		y = b+y;
	}

	public boolean checkOrigin(){
		if(x==0 && y==0){
			return true;
		}
		else{
			return false;
		}
	}

}