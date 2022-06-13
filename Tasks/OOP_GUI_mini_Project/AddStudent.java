import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AddStudent extends JFrame{
    AddStudent(){

		String name = JOptionPane.showInputDialog("What is your name? ");
		String gpa = JOptionPane.showInputDialog("What is your gpa? ");
		String phone = JOptionPane.showInputDialog("What is your phone? ");
		String gender = JOptionPane.showInputDialog("What is your gender? ");
		String semester = JOptionPane.showInputDialog("What is your semester? ");
		String section = JOptionPane.showInputDialog("What is your section? ");
		String departmentName = JOptionPane.showInputDialog("What is your department name? ");
		String departmentLocation = JOptionPane.showInputDialog("What is your department Location? ");


		Department myDept = new Department(departmentName, departmentLocation);
		Student student1 = new Student(name, phone, gender, gpa, semester, section, myDept);
		FileOperation myFile = new FileOperation();
		myFile.writeAFile(student1);

		// AddStudent(String name, String phone, String gender, String gpa, String semester, String section, String myDept);
		JOptionPane.showMessageDialog(null, "Congratulations! Student is added successfully", "Update", JOptionPane.INFORMATION_MESSAGE );

    }
}