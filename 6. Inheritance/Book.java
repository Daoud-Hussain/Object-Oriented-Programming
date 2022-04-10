public class Book extends Publication{
	private int pageCount;


	//Setter Method
	public void setPageCount(int pc){
		if(pc != 0){
			pageCount = pc;
		}
	}

	//Getter Method
	public int getPageCount(){
		return pageCount;
	}


	public void display(){
		System.out.println("Price: " + getPrice());
		System.out.println("Title: " + getTitle());
		System.out.println("Page Counts: " + pageCount);
	}
}