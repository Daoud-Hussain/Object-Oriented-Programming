public class Point{
	int x, y;
	public Point(){
		//Default Constructor
	}
	//One-Arg Constructor
	public Point(int a){
			x = a;
		}
	//2 argument Constructor
	public Point(int a, int b){
		x = a;
		y = b;
	}
	public void display(){
		System.out.printf("Value of A: %d and Value of B: %d", x, y);
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

	//Copy Constructor
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}

	//Equals Constructor
	public boolean equals(Point p){
		if(this.x == p.x && this.y == p.y){
			return true;
		}
		return false;

	}
	public Point AddTwoPoints(Point pa){
		int newX = this.x + pa.x;
		int newY = this.y + pa.y;
		Point newObj = new Point(newY, newY);
		return newObj;
	}

	public Point AddThreePoints(Point pa, Point qa){
		int finalX = qa.x + this.x + pa.x;
		int finalY = qa.y + this.y + pa.y;
		Point Obj = new Point(finalX,finalY);
		return Obj;
	}


}
