public class circle{

	int radius, circumference;
	double PI = 3.1416;

	public void setValue(int r,int c){
		radius = r;
		System.out.println("Radius value is: " + radius);
		circumference = c;
		System.out.println("Circumference value is: " + circumference);
	}

	public double displayArea() {
		return radius*radius*3.1415;
	}
	public double displayCir () {
		
		return 2*3.14*radius;
	}
}