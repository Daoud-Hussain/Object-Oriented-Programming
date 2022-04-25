//1. Runner for Shape interface
public class Runner{
	public static void main(String[] args) {
		Shape[] shp = new Shape[2];
		shp[0] = new Circle(5);
		shp[1] = new Rectangle(3, 5);
	}
}