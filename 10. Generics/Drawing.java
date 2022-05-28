import java.util.*;
public class Drawing<T>{

	private ArrayList <T> box;

	public Drawing(){
		//Default Argument constructor
	}

	public Drawing(ArrayList <T> given){
		box = given;
	}


	//Method to add an item in the arraylist box
	public void add(T items){
		box.add(items);
	}

	public boolean isEmpty(){
		if(box.get(0) == null){
			return true;
		}
		return false;
	}

	public T drawItem(){
		if(isEmpty()){
			return null;
		}
		else{
			//Picking a random item from the box
			int i = (int)(Math.random()*box.size());
			return box.get(i);
		}
	}

}