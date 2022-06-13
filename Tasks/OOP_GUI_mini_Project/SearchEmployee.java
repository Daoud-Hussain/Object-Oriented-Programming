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

public class SearchEmployee {
	SearchEmployee() {
		try{
			String str = "";
			boolean flag = false;
			int count = 0;
	        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Employee.ser"));
	        try {
	            while(true){
	                Job jobObj = (Job) obj.readObject();
	                Employee empObj = (Employee) obj.readObject();

	                if(jobObj.getSalary() > 50000){
	                    System.out.println("Employee Name :" + empObj.getname());
	                    System.out.println("Employee Headname :" + empObj.getheadName());
	                    System.out.println("Employee designation :" + jobObj.getDesignation());
	                    System.out.println("Employee salary :" + jobObj.getSalary());
	                    flag = true;
	                    count++;
	                }
	            }
	        }catch (ClassNotFoundException e) {
	            System.out.println("Sorry! the targetted class is not Found\n");
	        }catch(EOFException e){
	            obj.close();
	            System.out.println("Reacheed End of file\n");
	        }catch(IOException e){
	            System.out.println("Couldn't perform operation due to some error");
	        }

	        if(flag){
	        	JOptionPane.showMessageDialog(null, count+ " employees are 50K+ salaried", "Update", JOptionPane.INFORMATION_MESSAGE );
	        }
	        else{
	        	JOptionPane.showMessageDialog(null, "No employees is 50K+ salaried", "Update", JOptionPane.INFORMATION_MESSAGE );
	        }

		}
		catch(IOException e){
			System.out.println("Input output Exception");
		}
	}
}