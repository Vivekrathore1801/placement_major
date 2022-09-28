package placement_major;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Csit_dept implements ActionListener {
	
	JFrame frame;
	JButton b;
	JLabel l1, l2;
	
	
	Csit_dept(){ 
	
		frame = new JFrame("CSIT");
		frame.setBackground(Color.RED);
		frame.setLayout(null); // absolute layout used
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
frame.getContentPane().setBackground(Color.WHITE); // set frame background color
		
		frame.setVisible(true);
		frame.setSize(1200,650);
		frame.setLocation(50,30);
		
		l1 = new JLabel("CSIT DEPARTMENT");
		l1.setBounds(22,10,1200,620);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif",Font.PLAIN,63));
		frame.add(l1);
		
}
	@Override
	public void actionPerformed(ActionEvent ae) {
			frame.setVisible(false);
			 new Csit_dept();  // open login page on button click
		
	}
	
	public static void main(String [] args) {
		 new Csit_dept();
	}
}
	
