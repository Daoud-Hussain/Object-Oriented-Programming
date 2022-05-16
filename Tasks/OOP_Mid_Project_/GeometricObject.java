public abstract class GeometricObject {
	protected boolean isFilled;
	protected String color;
	protected double thickness;

	//Full-Argument Constructor
	public GeometricObject(boolean givenIsFilled, String givenColor, double givenThickness){
		if((givenIsFilled == true || givenIsFilled == false)){
			isFilled = givenIsFilled;
		}
		if(givenColor != ""){
			color = givenColor;
		}

		if(givenThickness > 0){
			thickness = givenThickness;
		}
	}

	public boolean getIsFilled(){
		return isFilled;
	}
	public abstract double calculateArea();

}