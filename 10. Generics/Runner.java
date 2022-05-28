
//1. Runner for pair class
/*import java.util.*;

public class Runner{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pair<String> list = new Pair<String>("Daoud", "Hussain");
		Pair<Integer> list2 = new Pair<Integer>(10, 20);

		System.out.println(list.toString());
		System.out.println(list2.toString());
		

	}
}
*/

//2. Runner for pair class
// import java.util.*;
// public class Runner{
// 	public static void main(String[] args) {
// 		Pair<Integer> intPair = new Pair<Int>(10);
// 	}
// }




//3. Runner for mymathclass 

// public class Runner{
// 	public static void main(String[] args) {
// 		//Passing double type
// 		ArrayList <Double> a1 = new ArrayList<Double>();
// 		a1.add(5.0);
//     	a1.add(7.0);
// 		a1.add(9.0);
// 		MyMathClass <Double> m1 = new MyMathClass<>();
// 		System.out.println(m1.calculateMean(a1));

// 		//Passing string type on which it should give an error
// 		/*ArrayList <String> a1 = new ArrayList<String>();
// 		a1.add(5.0);
//     	a1.add(7.0);
// 		a1.add(9.0);
// 		MyMathClass <String> m1 = new MyMathClass<>();
// 		System.out.println(m1.calculateMean(a1));*/
// 	}
// } 

//4. Runner for drawing class
import java.util.*;
public class Runner{
	public static void main(String[] args) {
		ArrayList <String> commitee = new ArrayList<String>();
		commitee.add("Circle");
		commitee.add("Rectangle");
		commitee.add("Parallelogram");
		commitee.add("Triangle");
		commitee.add("Quadrateral");

		System.out.println(commitee.isEmpty());
	}
}

//5. Runner for generic stack class
/*
import java.util.*;
public class Runner {
	public static void main(String[] args){
		ArrayList<Integer> stack1 = new ArrayList<Integer>();

		stack1.add(3);
		stack1.add(5);
		stack1.add(6);
		stack1.add(7);
		stack1.add(9);

		Stack <Integer> gs = new Stack<Integer>(stack1);

		System.out.println(gs.toString());
		gs.pop();
		System.out.println(gs.toString());
		gs.push(1);
		System.out.println(gs.toString());

	}
}
*/
