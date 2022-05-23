import java.util.*;
import java.util.ArrayList;


public class Runner{
	public static void main(String[] args) {
		ArrayList<News> list = new ArrayList<News>(3);
		list.add(new News("123", "Ali's content", "Ali"));
		list.add(new News("256", "Ahmed's content", "Ahmed"));
		list.add(new News("786", "Ali2's content", "Ali"));



		for(int i = 0; i < 3; i++){
			if(list.get(i).getEditor() == "Ali"){
				System.out.println(list.get(i).toString()); 
			}
		}
	}
}

