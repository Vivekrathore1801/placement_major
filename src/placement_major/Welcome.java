package placement_major;

//package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;

class Welcome implements ActionListener {
	
	JFrame frame;
	JButton b;
	
	
	Welcome(){ 
	
		frame = new JFrame("Placement portal");
		frame.setBackground(Color.RED);
		frame.setLayout(null); // absolute layout used
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("krishna-institute.png"));
		Image i2 = i1.getImage().getScaledInstance(1050, 650, Image.SCALE_DEFAULT); // resize our image size.
		ImageIcon i3 = new ImageIcon(i2);  // convert image into imageicon
		
		JLabel l1 =  new JLabel(i3); // set imageicon on label
		l1.setBounds(30,140,1165,430);
		frame.add(l1); // finally, add label on welcome frame.
		
		JButton b = new JButton("Click Here To Continue");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setBounds(525,530,180,40);
		b.addActionListener(this);  // perform action on button click.
		
		
		JLabel id = new JLabel();
		id.setBounds(0,0,1165,650); // keep length as image length.
		id.setLayout(null);
		
		
		JLabel lid = new JLabel("KIET PLACEMENT RECORD PORTAL"); // blinking label
		lid.setBounds(80,30,1140,100);
		lid.setForeground(Color.blue);
		lid.setFont(new Font("Serif",Font.PLAIN,63));
		id.add(lid);
		
		id.add(b);
		frame.add(id);
		
		frame.getContentPane().setBackground(Color.WHITE); // set frame background color
		
		frame.setVisible(true);
		frame.setSize(1200,650);
		frame.setLocation(50,50); // setting on window location 
		
		// For blinking text on frame
		while(true) {
			lid.setVisible(false);
			try {
				Thread.sleep(900);
			}catch(Exception ex1){}
			
				lid.setVisible(true);
				try {
					Thread.sleep(900);
				}catch(Exception ex2) {}
				
		}
		
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
			frame.setVisible(false);
			 new Login();  // open login page on button click
		
	}
	
	public static void main(String [] args) {
		 new Welcome();
	}
	
}
