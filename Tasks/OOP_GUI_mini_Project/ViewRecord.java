import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.IOException;

 class viewRecord extends JFrame{
    viewRecord(){
    	try{
			JOptionPane.showMessageDialog(null, "Congratulations! Employee is added successfully", "Update", JOptionPane.INFORMATION_MESSAGE );

    	}
    	catch(IOException e){
    		System.out.println("Input output exception");
    	}
		
		

    }
}