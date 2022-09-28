package placement_major;
import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;
class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
public class Signup_page  implements ActionListener {


		JFrame frame;
	    JLabel box,title,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
	    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	    JButton b1,b2;

	    
	    Signup_page(){
	        frame = new JFrame("Signup_page");
	        frame.setBackground(Color.white);
	        frame.setLayout(null);

	        box = new JLabel();
	        box.setBounds(0,0,900,700);
	        box.setLayout(null);
	        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("add.jpg"));
	        box.setIcon(img);

	        title = new JLabel("Signup");
	        title.setBounds(320,30,500,50);
	        title.setFont(new Font("serif",Font.ITALIC,25));
	        title.setForeground(Color.black);
	        box.add(title);
	        frame.add(box);

	 
	        label1 = new JLabel("Name");
	        label1.setBounds(50,150,100,30);
	        label1.setFont(new Font("serif",Font.BOLD,20));
	        box.add(label1);

	        t1=new JTextField();
	        t1.setFont(new Font("serif",Font.BOLD,15));
	        t1.setBounds(175,150,150,30);
	        t1.setBorder(new RoundedBorder(5));
	        t1.setForeground(Color.BLUE);
	        box.add(t1);

	        label2 = new JLabel("Password");
	        label2.setBounds(400,150,200,30);
	        label2.setFont(new Font("serif",Font.BOLD,20));
	        box.add(label2);

	        t2=new JTextField();
	        t2.setFont(new Font("serif",Font.BOLD,15));
	        t2.setBounds(525,150,150,30);
	        box.add(t2);
	        t2.setBorder(new RoundedBorder(5));
	        t2.setForeground(Color.BLUE);

	        
	        label4 = new JLabel("Department");
	        label4.setBounds(400,200,200,30);
	        label4.setFont(new Font("serif",Font.BOLD,20));
	        box.add(label4);

	        t4=new JTextField();
	        t4.setFont(new Font("serif",Font.BOLD,15));
	        t4.setBounds(525,200,150,30);
	        box.add(t4);
	        t4.setBorder(new RoundedBorder(5));
	        t4.setForeground(Color.BLUE);
	        
	        
	        label7 = new JLabel("Email Id");
	        label7.setBounds(50,200,100,30);
	        label7.setFont(new Font("serif",Font.BOLD,20));
	        box.add(label7);

	        t7=new JTextField();
	        t7.setFont(new Font("serif",Font.BOLD,15));
	        t7.setBounds(175,200,150,30);
	        t7.setBorder(new RoundedBorder(5));
	        t7.setForeground(Color.BLUE);
	        box.add(t7);


	        label12 = new JLabel();
	        label12.setBounds(200,450,250,200);
	        box.add(label12);

	        label13 = new JLabel("");
	        label13.setBounds(600,450,250,200);
	        box.add(label13);

	        b1 = new JButton("Submit");
	        b1.setBackground(Color.BLACK);
	        b1.setForeground(Color.WHITE);
	        b1.setBounds(250,300,150,40);
	        b1.setBorder(new RoundedBorder(5));
	        box.add(b1);

	        b2=new JButton("Cancel");   
	        b2.setBackground(Color.BLACK);
	        b2.setForeground(Color.WHITE);
	        b2.setBounds(450,300,150,40);
	        b2.setBorder(new RoundedBorder(5));
	        box.add(b2);
	        
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        
	        frame.setVisible(true);
	        frame.setSize(800,500);
	        frame.setLocation(200,20);
	    }


		
	    
	    @Override
		public void actionPerformed(ActionEvent ae) {
		
			String name  = t1.getText();
	        String pass = t2.getText();
	     
	        String dep  = t4.getText();
	      
	        String email  = t7.getText();
	      
	        if(ae.getSource() == b1){
	            try{
	            	DBconnection cc = new DBconnection();
	                String q = "insert into signup values('"+name+"','"+email+"','"+dep+"','"+pass+"')";
	                cc.st.executeUpdate(q);
	                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
	                frame.setVisible(false); // close current frame.
	                new Login(); // open Login page
	            }catch(Exception ee){
	                System.out.println("The error is:"+ee);
	            }
	        }else if(ae.getSource() == b2){
	            frame.setVisible(false);
	            new Welcome();
	            
	        }
			
		}
		
		

		public static void main(String[] args) {
			new Signup_page();
		}
		 
		
	}

