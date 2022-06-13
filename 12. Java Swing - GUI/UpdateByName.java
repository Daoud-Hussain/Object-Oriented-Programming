import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class UpdateByName{

	UpdateByName(){
			String name = JOptionPane.showInputDialog("Enter the name you want to update:");
			String gpa = JOptionPane.showInputDialog("Enter the GPA you want to update:");

			FileOperation f= new FileOperation();
			f.updateGpaByName(name, gpa);

			JOptionPane.showMessageDialog(null, "Updated GPA Successfully!!", "Update", JOptionPane.INFORMATION_MESSAGE );
		}
	
}