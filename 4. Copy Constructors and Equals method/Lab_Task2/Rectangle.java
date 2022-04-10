public class Rectangle{
	int length,width;

	public Rectangle(){
		//Default Constructor
	}
	//2 Argument Constructor
	public Rectangle(int a,int b){
		if(a>=0 && b>=0){
			length = a;
			width = b;
		}
	}
	//ReSetting values  of length
	public void setValues(int newValue){
		if(newValue>=0){
			length = newValue;
		}
	}

	public int calculateArea(){
		int area = length*width;
		return area;
	}

	public boolean checkSquare(){
		if(length==width){
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		System.out.printf("Value of Length: %d \nValue of Width: %d ", length,width);
	}
	
	
}

