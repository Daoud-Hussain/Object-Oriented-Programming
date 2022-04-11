public class Email extends Document{
	String sender, recepient, title;

	public Email(String te,String s, String r, String t){
		super(te);
		sender = s;
		recepient = r;
		title = t;
	}

	public String toString(){
		text = "TITLE: " + title + " SENDER: " + sender + " RECEPIENT: " + recepient +" BODY: " + text;
		return text;
	}
}