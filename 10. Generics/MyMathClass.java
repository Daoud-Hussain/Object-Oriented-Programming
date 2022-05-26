import java.util.ArrayList;

public class MyMathClass <T extends Number>{

	public MyMathClass(){
		//Default Constructor
	}

	public double calculateMean(ArrayList<T> array){
		double sum = 0;
		for(int i=0; i < array.size(); i++){
			sum += array.get(i).doubleValue();
		}
		return sum/array.size();
	}
}