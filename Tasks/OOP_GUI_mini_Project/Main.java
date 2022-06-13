import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Main{
	
	public static void main(String[] args) {

			JFrame frame = new JFrame();
			FileOperation myFile = new FileOperation();
			frame.setSize(500,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new GridLayout(4,1));
			frame.setTitle("Assignment 4");

			// frame.getContentPane().setBackground(new Color(123, 50, 250));
			JButton button1 = new JButton("Write an Employee");
			button1.setFocusable(false);
			button1.addActionListener(e -> new writeAnEmployee());
			JButton button2 = new JButton("Search all Employees with salary > 50K");
			button2.addActionListener(e -> new SearchEmployee());
			button2.setFocusable(false);
			JButton button3 = new JButton("Update job for Employee");
			button3.addActionListener(e -> new UpdateEmployee());
			button3.setFocusable(false);
			JButton button4 = new JButton("View Record");
			button4.addActionListener(e -> myFile.readAFile());
			button4.setFocusable(false);
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.add(button4);


			frame.setVisible(true);

	}


	
}