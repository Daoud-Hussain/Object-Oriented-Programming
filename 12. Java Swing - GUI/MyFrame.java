import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame(){
		this.setSize(420, 420);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Housing Society Management System");
		this.getContentPane().setBackground(new Color(123, 50, 250));

		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage());
    }
}