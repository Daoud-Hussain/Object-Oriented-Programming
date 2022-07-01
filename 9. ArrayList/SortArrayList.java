import java.util.*;   
public class SortArrayList 
{   
	public static void main(String args[])   
	{   
		// creating object of ArrayList class  
		ArrayList<Integer> list = new ArrayList<Integer>();   
		// adding elements to the ArrayList   
		list.add(20);   
		list.add(50);   
		list.add(10);   
		list.add(80);   
		list.add(30);   
		list.add(12);   
		list.add(56);   
		list.add(79);   
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);   
	}   
}  