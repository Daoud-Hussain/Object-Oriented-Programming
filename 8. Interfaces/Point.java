public class Point implements Cloneable{
	//Data members
	private int x;
	private int y;



	//Full-Argument constructor
	public Point(int xVal, int yVal){
		x = xVal;
		y = yVal;
	}
	
	//Overriding Interface method
	public Object clone(){
		Point p = new Point(this.x, this.y);
		return p;
	}


	public void move(int xVal, int yVal){
		x += xVal;
		y += yVal;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	
}