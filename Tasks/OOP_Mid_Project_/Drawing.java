public class Drawing {
	GeometricObject[] go = new GeometricObject[5];

	//Method to add a Drawing 
	public void add(GeometricObject givenGeometricObj){
		for(int i = 0; i < go.length; i++){
			if(go[i] == null){
				go[i] = givenGeometricObj;
			}
		}
	}

	public double calculateArea(){
		double area = 0;
		for(int i = 0; i < go.length; i++){
			area += go[i].calculateArea();
		}
		return area;
	}

	public int countFilled(){
		int count = 0;
		for(int i = 0; i < go.length; i++){
			if(go[i].getIsFilled()){				
				count++;
			}
		}
		return count;

	}


}