public class Circle extends GeometricObject {
	protected int radius;
	//Full-Argument Constructor
	public Circle(boolean givenIsFilled, String givenColor, double givenThickness, int givenRadius){
		
		super(givenIsFilled, givenColor, givenThickness);
		if(givenRadius > 0){
			radius = givenRadius;
		}

	}

	public double calculateArea(){
		return 3.1416*3.1416*radius;
	}

}