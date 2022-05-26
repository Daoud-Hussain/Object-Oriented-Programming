// import java.util.*;

// public class Stack <T>{
// 	private Arraylist<T> array;


// 	//Argumented Constructor
// 	public Stack(Arraylist <T> arr){
// 		array = arr;
// 	}



// }
import java.util.*;

public class Stack<T>{
	private ArrayList<T> array;

	public Stack(){
		//Default Argument Constructor
	}


	//Argument Constructor
	public Stack(ArrayList<T> arr){
		array = arr;
	}


	public int getSize(){
		return array.size();
	}



	public T topElement(){
		return array.get(getSize()-1);
	}



	public void push(T x){
		array.add(x);
	}



	public T pop(){
		T x;
		x = array.get(getSize()-1);
		array.remove(getSize()-1);
		return x;
	}



	public boolean isEmpty(){
		return array.isEmpty();
	}

	public String toString(){
		return "Stack: "+ array.toString();
	}
}