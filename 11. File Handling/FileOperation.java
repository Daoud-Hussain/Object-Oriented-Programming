import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class FileOperation {

	//Write into a file
	public void write(Student stuObj){
		try{
			File fileObj = new File("myFile.txt");
			if(fileObj.exists()){
				MyObjectOutputStream out = new MyObjectOutputStream(new FileOutputStream(fileObj, true));
				out.writeObject(stuObj);
			}
			else{
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileObj));
				out.writeObject(stuObj);
			}
		}
		catch(IOException e){
			System.out.println("Couldn't write the file.");
		}
	}
}