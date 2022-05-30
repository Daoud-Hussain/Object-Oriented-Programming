import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Runner{
	public static void main(String[] args) {
		Department stuDept = new Department("CS", "Academic Block III");
		Student student1 = new Student("Daoud", "0348-3016704", "Male", "3.04", "3rd", "3B", myDept);
	}
}