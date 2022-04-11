public class File extends Document{
	String pathName;


	public File(String t, String p){
		super(t);
		pathName = p;
	}

	public String toString(){
		text = " BODY: " + text + " PATH: " + pathName ;
		return text;
	}

	

}