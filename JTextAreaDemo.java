import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JTextAreaDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("This is a JTextArea component!!!");
		JTextArea jta = new JTextArea(3,20);
		jta.setLineWrap(true);
		JScrollPane scr1 = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JLabel albel = new JLabel("more line text echo:");
		frame.setLayout(new GridLayout(2,1));
		frame.add(albel);
		frame.add(scr1);
		frame.setSize(300,150);
		frame.setLocation(300,120);
		frame.setVisible(true);
	}
}