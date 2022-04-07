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



	public boolean compareAuthors(Book b){
		if(this.author == b.author){
			return true;
		}
		return false;
	}


	public boolean compareChapters(Book b){
		for(int i=0; i<chapterNames.length; i++){
			if(this.chapterNames[i] == b.chapterNames[i]){
				return true;
			}
		}
		
		return false;
	}
	
	
	
}