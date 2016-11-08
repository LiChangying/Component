import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JPsswordFieldDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("This is a Password field!!!");
		JPasswordField jpf1 = new JPasswordField();
		JPasswordField jpf2 = new JPasswordField();
		jpf2.setEchoChar('#');
		JLabel label1 = new JLabel("default echo:");
		JLabel label2 = new JLabel("set newecho:");
		frame.setLayout(new GridLayout(2,2));
		frame.add(label1);
		frame.add(jpf1);
		frame.add(label2);
		frame.add(jpf2);
		frame.setSize(300,100);
		frame.setLocation(300,200);
		frame.setVisible(true);
	}
}