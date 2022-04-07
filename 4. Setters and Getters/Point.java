public class Point{
	private int x,y;
	public Point(){
		//Default Argument Constructor
	}
	public Point(int x, int y){
		//Default Argument Constructor
		if(x>0 && y>0){
			x = x;
			y = y;
		}
	}
	public void setX(int h){
		//Default Argument Constructor
		if(h>0){
			x = h;
		}
	}

	public void setY(int v){
		//Default Argument Constructor
		if(v>0){
			y = v;
		}
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	//Moving point x
	public int movePointX(int abc){
		if(abc>0){
			x = x+abc;
		}
		return x;
	}

	public void display(){
		System.out.print("X: "+ x + " Y: " + y);
	}
}