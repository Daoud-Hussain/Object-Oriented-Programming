import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Runner {
	public static void main(String[] args) {
		FileOperation myFile = new FileOperation();
		Department stuDept = new Department("CS", "Academic Block III");
		Student student1 = new Student("Daoud", "0348-3016704", "Male", "3.04", "3rd", "3B", stuDept);
		Student student2 = new Student("Hussain", "0345-5828223", "Male", "3.48", "3rd", "3B", stuDept);
		Student student3 = new Student("Ali", "0348-5567756", "Male", "3.17", "3rd", "3B", stuDept);

		// myFile.writeAFile(student1);
		// myFile.writeAFile(student2);
		// myFile.writeAFile(student3);
		// System.out.println(myFile.SearchAStudentByName("Daoud"));
		// System.out.println(myFile.updateGpaByName( "Daoud", "3.55"));
		// System.out.println(myFile.updateGpaByName( "Hussain", "3.70"));
		// myFile.removeByName( "Ali");

		//After all the operations
		myFile.readAFile();
		
	}
}