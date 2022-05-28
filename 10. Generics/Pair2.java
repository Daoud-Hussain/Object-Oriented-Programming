public class Pair2<T1, T2> {
	private T1 first;
	private T2 second;

	//Default Argument Constructor
	public Pair2(){
		first = null;
		second = null;
	}

	//Argument Constructor
	public Pair2(T1 firstItem, T2 secondItem){
		first = firstItem;
		second = secondItem;
	}

	//Setters
	public void setFirst(T1 firstItem){
		first = firstItem;
	}

	public void setSecond(T2 secondItem){
		second = secondItem;
	}

	//Getters
	public T1 getFirst(){
		return first;
	}

	public T2 getSecond(){
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
			Pair2<T1, T2> list =(Pair2<T1, T2>)obj;
			if(list.getFirst().equals(this.first) && list.getSecond().equals(this.second)){
				return true;
			}
			return false;
		}
	}
	

}