import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Main{
	
	public static void main(String[] args) {
			// new AddStudent(); 

			JFrame frame = new JFrame();
			frame.setSize(500,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new GridLayout(5,1));
			frame.setTitle("Student Management System");
			ImageIcon image = new ImageIcon("student1.png");
			frame.setIconImage(image.getImage());

			// frame.getContentPane().setBackground(new Color(123, 50, 250));
			JButton button1 = new JButton("Add a Student");
			button1.setFocusable(false);
			button1.addActionListener(e -> new AddStudent());
			JButton button2 = new JButton("Search a Student by name");
			button2.addActionListener(e -> new SearchByName());
			button2.setFocusable(false);
			JButton button3 = new JButton("Search a Student by Department");
			button3.addActionListener(e -> new SearchByDepartment());
			button3.setFocusable(false);
			JButton button4 = new JButton("Update the GPA of Student by Name");
			button4.addActionListener(e -> new UpdateByName());
			button4.setFocusable(false);
			JButton button5 = new JButton("Delete a Student by Name");
			button5.addActionListener(e -> new DeleteByName());
			button5.setFocusable(false);
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.add(button4);
			frame.add(button5);


			// // String name = JOptionPane.showInputDialog("What is your name? ");

			frame.setVisible(true);

	}


	
}