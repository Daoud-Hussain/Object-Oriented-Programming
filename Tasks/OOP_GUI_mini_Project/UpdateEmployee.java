import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class UpdateEmployee{

	UpdateEmployee(){
			String name = JOptionPane.showInputDialog("Enter the name you want to update:");
			String designation = JOptionPane.showInputDialog("Enter the designation you want to update:");
			String salary = JOptionPane.showInputDialog("What is your new salary you want to update? ");
			double doubledSalary=Double.parseDouble(salary);

			FileOperation f= new FileOperation();
			f.updateJob(name, designation, doubledSalary);

			JOptionPane.showMessageDialog(null, "Congatulations!! Job for "+ name+  " is Successfully!!", "Update", JOptionPane.INFORMATION_MESSAGE );
		}
		
}