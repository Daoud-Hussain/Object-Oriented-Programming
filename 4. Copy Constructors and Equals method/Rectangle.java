public class Rectangle{
	private int length, width;
	public Rectangle(){
		//Default Argument constructor
	}

	public Rectangle(int l){
		if(l>0){
			length = l;
		}
	}

	public Rectangle(int l, int w){
		if(l>0 && w>0){
			length = l;
			width = w;
		}
	}

	public void setLength(int l){
		if(l>0){
			length = l;
		}
	}
	
	public void setWidth(int w){
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

	public void display(){
		System.out.print("Length: " + length + " Width: " + width);
	}

	//COPY constructor
	public Rectangle(Rectangle obj){
		this.length = obj.length;
		this.width = obj.width;
	}

	//Equals Method
	public Boolean equals(Rectangle obj){
		if(obj.length == this.length && obj.width == this.width){
			return true;
		}
		return false;
	}

	public int calculateArea(){
		return length*width;
	}

	public Boolean checkSquare(){
		if(length == width){
			return true;
		}
		return false;
	}

	public Rectangle compareArea(Rectangle obj){
		if(this.calculateArea() > obj.calculateArea()){
			return this;
		}
		else{
			return obj;

		}
	}
}