
public class News{
	String newsId;
	String newsEditor;
	String newsContent;


	public News(){
		//Default Argument constructor
	}

	public News(String id, String content, String editor){
		// Argumented constructor
		newsId = id;
		newsContent = content;
		newsEditor = editor;
	}

	//Setters
	public void setId(String id){
		newsId = id;
	}

	public void setContent(String content){
		newsContent = content;
	}

	public void setEditor(String editor){
		newsEditor = editor;
	}


	//Getters
	public String getId(){
		return newsId;
	}

	public String getContent(){
		return newsContent;
	}

	public String getEditor(){
		return newsEditor;
	}


	public String toString(){
		String text = "ID: " + newsId + " Content: " + newsContent + " Editor: " + newsEditor + " ";
		return text;
	}
}