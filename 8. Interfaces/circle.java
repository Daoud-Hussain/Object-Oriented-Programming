public class Circle implements Shape{
	double radius;
	final double PI = 3.1415;


	public Circle(double r){
		radius = r;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
}