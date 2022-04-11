public class Runner{
	public static void main(String[] args) {
		File f = new File("HEllo My name is Daoud Hussain. I am a student of BCS 3B. I am working on a Java class text","gmail.com/inbox");
		Email e = new Email("HEllo My name is Daoud Hussain. I am a student of BCS 3B. I am working on a Java class text","Ali", "Najam", "Fee Clarification");
		Document doc = new Document("HEllo My name is Daoud Hussain. I am a student of BCS 3B. I am working on a Java class text");
		System.out.println(e.toString());
		searchKeyWord(doc, "Daoud");

	}
	public static boolean searchKeyWord(Document d, String key){
		if(d.text.contains(key)){
			return true;
		}
		return false;
	}
}