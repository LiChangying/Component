import javax.swing.*;
import java.awt.*;
import java.io.*;
public class JToggleButtonDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Welcome come to my component");
		JToggleButton but1 = new JToggleButton("anniu1",true);
		JToggleButton but2 = new JToggleButton("anniu2",false);
		JToggleButton but3 = new JToggleButton("anniu3");
		frame.setLayout(new GridLayout(3,1));
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		frame.setSize(200,100);
		frame.setLocation(200,120);
		frame.setVisible(true);
	}
}