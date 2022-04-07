public class Book{
	String author = "";
	String chapterNames[] = new String[5];
	public Book(){
		//Default Constructor
	}

	//2 argument Constructor
	public Book(String a, String[] b ){
		author = a;
		for (int i=0; i<=4 ;i++ ) {
			chapterNames[i] = b[i];
		}

	}
	public void display(){
		System.out.printf("Name of Authos is: %s", author);
		System.out.println(" And Chapter names are: ");
		for (int i=0; i<=4 ;i++ ) {
			System.out.println(chapterNames[i]);
		}
	}
	//Reseting name of Author
	public void setValue(String a){
		author = a;

	}
	public boolean checkIfAuthorNameStartsWithA(){
		if(author.startsWith("A"))
			return true;
		else{
			return false;
		}
	}
	public boolean searchChapter(String abc){
		boolean flag = false;
		for (int i=0; i<=4 ;i++ ) {
			//CompareTo method compares two strings and return 0 if they are equal
			if(chapterNames[i].compareTo(abc) == 0){
				flag = true;
				break;
			}
			else{
				flag = false;
			}
		}
		if(flag){
			return true;
		}
		else{
			return false;
		}
	}
	

}