public class Publication{
	private int price;
	private String title;


	//Setter Methods
	public void setPrice(int p){
		if(p != 0){
			price = p;
		}
	}

	public void setTitle(String t){
		if(t != ""){
			title = t;
		}
	}

	//Getter Methods
	public int getPrice(){
		return price;
	}


	public String getTitle(){
		return title;
	}


	public void display(){
		System.out.println("Price: " + price);
		System.out.println("Title: " + title);
	}
}