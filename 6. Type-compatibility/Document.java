public class Document{
	String text;

	public String toString(){
		return text;
	}

	public Document(String t){
		text = t;
	}

	public void setText(String t){
		if(t!=""){
			text = t;
		}
	}
}