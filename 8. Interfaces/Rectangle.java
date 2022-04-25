public class Rectangle implements Shape{
	double length;
	double height;


	public Rectangle(double b, double h){
		length = b;
		height = h;
	}

	public double getArea(){
		return length*height;
	}
}