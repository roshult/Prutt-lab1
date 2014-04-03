

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class labOne {
	
	public static void main ( String[] args){
		MyButton b1 = new MyButton(Color.white, Color.cyan, "On", "Off");
		MyButton b2 = new MyButton(Color.white, Color.cyan, "On", "Off");
		
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Tommy Roshult",SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(300, 100)); 
		frame.getContentPane().add(label, BorderLayout.CENTER); 
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().setBackground(Color.red);

		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		System.out.println("hej");

	}
}