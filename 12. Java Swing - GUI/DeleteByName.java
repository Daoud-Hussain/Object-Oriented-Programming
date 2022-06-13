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


public class DeleteByName{

	DeleteByName() {
		String name = JOptionPane.showInputDialog("Enter the name you want to update:");

		FileOperation f= new FileOperation();
		f.removeByName(name);

		JOptionPane.showMessageDialog(null, "Record deleted Successfully!!", "Update", JOptionPane.INFORMATION_MESSAGE );

	}
}