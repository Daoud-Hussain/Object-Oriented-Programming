import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JOptionPane;

public class writeAnEmployee extends JFrame{
    writeAnEmployee(){

		String name = JOptionPane.showInputDialog("What is your name? ");
		String salary = JOptionPane.showInputDialog("What is your salary? ");
		double doubledSalary=Double.parseDouble(salary);
		String headName = JOptionPane.showInputDialog("What is your head name? ");
		String designation = JOptionPane.showInputDialog("What is your designation? ");
		
	
		Job jobObj = new Job(designation, doubledSalary);
		Employee employee1 = new Employee(name, headName, jobObj);
		FileOperation myFile = new FileOperation();
		myFile.writeAFile(employee1);
		JOptionPane.showMessageDialog(null, "Congratulations! Employee is added successfully", "Update", JOptionPane.INFORMATION_MESSAGE );

		

    }
}