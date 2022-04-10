public class Rectangle{
	private int length,width;
	public Rectangle(){
		//Default Argument Constructor
	}
	public Rectangle(int l, int w){
		//Default Argument Constructor
		if(l>0 && w>0){
			length = l;
			width = w;
		}
	}
	public void setLength(int l){
		//Default Argument Constructor
		if(l>0){
			length = l;
		}
	}

	public void setWidth(int w){
		//Default Argument Constructor
		if(w>0){
			width = w;
		}
	}

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	public int calculateArea(){
		return length*width;
	}

	public void display(){
		System.out.print("Length: "+ length + " Width" + width);
	}
}