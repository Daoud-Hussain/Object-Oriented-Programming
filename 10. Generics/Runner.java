import java.util.*;

// public class Runner{
// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		Pair<String> list = new Pair<String>("Daoud", "Hussain");
// 		Pair<Integer> list2 = new Pair<Integer>(10, 20);

// 		System.out.println(list.toString());
// 		System.out.println(list2.toString());


// 	}
// }

public class Runner{
	public static void main(String[] args) {
		ArrayList <Double> a1 = new ArrayList<Double>();
		a1.add(5.0);
    	a1.add(7.0);
		a1.add(9.0);
		MyMathClass <Double> m1 = new MyMathClass<>();
		System.out.println(m1.calculateMean(a1));
	}
}
