public class Rectangle extends GeometricObject {
	protected int length;
	protected int width;

	//Full-Argument Constructor
	public Rectangle(boolean givenIsFilled, String givenColor, double givenThickness, int givenLength, int givenWidth){
		
		super(givenIsFilled, givenColor, givenThickness);
		if(givenLength > 0){
			length = givenLength;	
		}
		if(givenWidth > 0){
			width = givenWidth;	
		}

	}

	public double calculateArea(){
		return length*width;
	}
}