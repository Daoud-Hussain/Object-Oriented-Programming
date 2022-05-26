public class Pair<T> {
	private T first;
	private T second;

	//Default Argument Constructor
	public Pair(){
		first = null;
		second = null;
	}

	//Argument Constructor
	public Pair(T firstItem, T secondItem){
		first = firstItem;
		second = secondItem;
	}

	//Setters
	public void setFirst(T firstItem){
		first = firstItem;
	}

	public void setSecond(T secondItem){
		second = secondItem;
	}

	//Getters
	public T getFirst(){
		return first;
	}

	public T getSecond(){
		return second;
	}

	public String toString(){
			return("First: " + first.toString()+ " Second: "+ second.toString());
	}

	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		else if(this.getClass() != obj.getClass()){
			return false;
		}
		else{
			//Typecasting the given object
			Pair<T> list =(Pair<T>)obj;
			if(list.getFirst().equals(this.first) && list.getSecond().equals(this.second)){
				return true;
			}
		}
	}

}