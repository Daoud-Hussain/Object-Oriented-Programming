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

public class SearchByDepartment {
	SearchByDepartment() throws IOException{
		String deptName = JOptionPane.showInputDialog("Enter the name you want to search? ");
		String str = "";
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Student.ser"));
        try {
            while(true){
                Department dept = (Department) obj.readObject();
                if(dept.getName().equals(deptName)){
                    JOptionPane.showMessageDialog(null, "Yes! Student is present!!", "Update", JOptionPane.INFORMATION_MESSAGE );
                }
                else{
                    JOptionPane.showMessageDialog(null, "Yes! Student is not present!!", "Update", JOptionPane.INFORMATION_MESSAGE );
                }
            }
        }catch (ClassNotFoundException e) {
            System.out.println("Sorry! the targetted class is not Found\n");
        }catch(EOFException e){
            obj.close();
            System.out.println("Sorry! the targetted file has ended\n");
        }catch(IOException e){
            System.out.println("Couldn't perform operation due to some error");
        }

	}

}