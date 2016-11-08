import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JTextFieldDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("this is a new Component include JTextField!!");
		JTextField text1 = new JTextField(30);
		JTextField text2 = new JTextField("I like Java!!!",30);
		JLabel label1 = new JLabel("user name:",JLabel.CENTER);
		JLabel label2 = new JLabel("password:",JLabel.CENTER);
		text2.setEditable(false);
		text1.setColumns(30);
		text2.setColumns(10);
		frame.setLayout(new GridLayout(2,2));
		frame.add(label1);
		frame.add(text1);
		frame.add(label2);
		frame.add(text2);
		frame.setSize(300,200);
		frame.setLocation(300,120);
		frame.setVisible(true);
	}
}