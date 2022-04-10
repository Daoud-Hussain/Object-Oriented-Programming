public class Book{
	private String bookName;
	private String publisher;
	private Person author;

	Book(){
		//Default Argument constructor
	}
	Person p1 = new Person();

	//Full Argument constructor

	Book(String bn, String p, Person p1){
		bookName = bn;
		publisher = p;
		author = p1;
	}

	public void setBookName(String bn){
		if(bn != ""){
			bookName = bn;
		}
	}

	public void setPublisher(String ln){
		if(ln != ""){
			publisher = ln;
		}
	}

	public String getBookName()
    {
        return bookName;
    }

    public String getPubliser()
    {
        return publisher;
    }

    public void setAuthor(Person a){
		author = a;
	}

	public void getAuthor(Person a){
		author = a;
	}

	public void display(){
		System.out.println(bookName);
		System.out.println(publisher);
		System.out.println(author.getFirstName() + " "+ author.getlastName() + " - " + author.getHomeAddress().getHome()  + " " + author.getHomeAddress().getStreet() + " " + author.getHomeAddress().getCity());
		
	}
	boolean checkStreet(){
		if(author.getHomeAddress().getStreet() < 10){
			//System.out.print("YESSS!!!!!!!!!!");
			return true;
		}
		else{
			//System.out.print("NOOOOOOOOO!!!!!!!!!!");
			return false;

		}
	}

}