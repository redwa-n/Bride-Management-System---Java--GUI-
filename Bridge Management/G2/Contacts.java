import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Contacts extends JFrame implements ActionListener,MouseListener
{	
	JLabel c3Text,text2,login2,userLabel2,userLabel4,userLabel3,passLabel2,a2ImgLabel1,management1,management2,management3,management;
		
    JTextField userTF2,userTF3,userTF4;
	JPasswordField passPF2;
	JButton exitBtn2, backBtn2, loginBtn2;
	JPanel panel2;
	JComboBox c1Combo;
	ImageIcon icon2;
    ImageIcon a1image1;
	Font myFont,myFont12;
    JRadioButton c3r1, c3r2;
    JComboBox c3Combo;

	public Contacts()
	{
		this.setTitle("Contact");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		panel2 = new JPanel();
		panel2.setLayout(null);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		//icon2 = new ImageIcon("208R.gif");
		//setIconImage(icon2.getImage());

		

		management = new JLabel("                                                                                      Contact Section");
		management.setBounds(0, 0,800, 30);
		management.setFont(myFont);
		management.setBackground(new Color(198, 65, 83));
		management.setOpaque(true);
		management.setForeground(Color.WHITE);
		management.setFont(myFont12);
		panel2.add(management);

		management1 = new JLabel("");
		management1.setBounds(0, 0,20, 600);
		management1.setBackground(new Color(198, 65, 83));
		management1.setOpaque(true);
		panel2.add(management1);

		management2 = new JLabel("");
		management2.setBounds(780, 0,20, 600);
		management2.setBackground(new Color(198, 65, 83));
		management2.setOpaque(true);
		panel2.add(management2);

		management3 = new JLabel("");
		management3.setBounds(0, 553,800, 20);
		management3.setBackground(new Color(198, 65, 83));
		management3.setOpaque(true);
		panel2.add(management3);

        c3Text = new JLabel(" Send To :");
		c3Text.setBounds(250, 165, 60, 20);
		c3Text.setBackground(new Color(162, 160, 161));
	    c3Text.setOpaque(true);
		c3Text.setFont(myFont);
		panel2.add(c3Text);

		c3r1 = new JRadioButton("IT Sector");
		c3r1.setBounds(310, 165, 110, 20);
		c3r1.setBackground(new Color(198, 65, 83));
		c3r1.setOpaque(true);
		c3r1.setFont(myFont);
		panel2.add(c3r1);
		
		c3r2 = new JRadioButton("Management");
		c3r2.setBounds(420, 165, 100, 20);
		c3r2.setBackground(new Color(198, 65, 83));
		c3r2.setOpaque(true);
		c3r2.setFont(myFont);
		panel2.add(c3r2);

		/*login2= new JLabel(" Infor ");
		login2.setBounds(293, 165, 232, 30);
		login2.setBackground(new Color(198, 65, 83));
		login2.setOpaque(true);
		login2.setForeground(Color.WHITE);
		login2.setFont(myFont12);
		panel2.add(login2);*/

		userLabel2 = new JLabel("    Email : ");
		userLabel2.setBounds(300, 238, 65, 18);
		userLabel2.setBackground(new Color(198, 65, 83));
		userLabel2.setOpaque(true);
		userLabel2.setForeground(Color.WHITE);
		userLabel2.setFont(myFont);
		panel2.add(userLabel2);

		userTF2 = new JTextField();
		userTF2.setBounds(370, 237, 150, 20);
		userTF2.setBackground(new Color(162, 160, 161));
		userTF2.setForeground(Color.BLACK);
		userTF2.setFont(myFont);
		panel2.add(userTF2);

        userLabel3 = new JLabel("    Phone : ");
		userLabel3.setBounds(300, 267, 65, 18);
		userLabel3.setBackground(new Color(198, 65, 83));
		userLabel3.setOpaque(true);
		userLabel3.setForeground(Color.WHITE);
		userLabel3.setFont(myFont);
		panel2.add(userLabel3);

		userTF3 = new JTextField();
		userTF3.setBounds(370, 267, 150, 20);
		userTF3.setBackground(new Color(162, 160, 161));
		userTF3.setForeground(Color.BLACK);
		userTF3.setFont(myFont);
		panel2.add(userTF3);

        userLabel4 = new JLabel("  Massage : ");
		userLabel4.setBounds(300, 287, 65, 18);
		userLabel4.setBackground(new Color(198, 65, 83));
		userLabel4.setOpaque(true);
		userLabel4.setForeground(Color.WHITE);
		userLabel4.setFont(myFont);
		panel2.add(userLabel4);

		userTF4 = new JTextField();
		userTF4.setBounds(370, 287, 150, 200);
		userTF4.setBackground(new Color(162, 160, 161));
		userTF4.setForeground(Color.BLACK);
		userTF4.setFont(myFont);
		panel2.add(userTF4);

		

		loginBtn2 = new JButton("Submit");
		loginBtn2.setBounds(455, 500, 80, 30);
		loginBtn2.setBackground(new Color(198, 65, 83));
		loginBtn2.setOpaque(true);
		loginBtn2.setForeground(Color.BLACK);
		loginBtn2.addActionListener(this);
		loginBtn2.addMouseListener(this);
		loginBtn2.setFont(myFont);
		panel2.add(loginBtn2);

		exitBtn2= new JButton("Exit");
		exitBtn2.setBounds(255, 500, 80, 30);
		exitBtn2.setBackground(new Color(198, 65, 83));
		exitBtn2.setOpaque(true);
		exitBtn2.setForeground(Color.BLACK);
		exitBtn2.addActionListener(this);
		exitBtn2.addMouseListener(this);
		exitBtn2.setFont(myFont);
		panel2.add(exitBtn2);

		backBtn2 = new JButton("Back");
		backBtn2.setBounds(355, 500, 80, 30);
		backBtn2.setBackground(new Color(198, 65, 83));
		backBtn2.setOpaque(true);
		backBtn2.setForeground(Color.BLACK);
		backBtn2.addActionListener(this);
		backBtn2.addMouseListener(this);
		backBtn2.setFont(myFont);
		panel2.add(backBtn2);

		this.add(panel2);

		a1image1 = new ImageIcon("d.gif");
		a2ImgLabel1 = new JLabel(a1image1);
		a2ImgLabel1.setBounds(0, 0, 800, 600);
		panel2.add(a2ImgLabel1);


	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn2)
		{
			loginBtn2.setBackground(new Color(198, 65, 83));
			loginBtn2.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == exitBtn2)
		{
			exitBtn2.setBackground(new Color(198, 65, 83));
			exitBtn2.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == backBtn2)
		{
			backBtn2.setBackground(new Color(198, 65, 83));
			backBtn2.setForeground(new Color(198, 65, 83));
		}
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn2)
		{
			loginBtn2.setBackground(new Color(198, 65, 83));
			loginBtn2.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn2)
		{
			exitBtn2.setBackground(new Color(198, 65, 83));
			exitBtn2.setForeground(Color.BLACK);
		}
		else if(me.getSource() == backBtn2)
		{
			backBtn2.setBackground(new Color(198, 65, 83));
			backBtn2.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent e4)
	{
		
		if(e4.getSource()==backBtn2)
		{
			Employee c1 = new Employee();
			c1.setVisible(true);
			this.setVisible(false);
		}

		else if(e4.getSource()==loginBtn2)
		{
			JOptionPane.showMessageDialog(null,"Succesfully Sent !!");
		}
	
		else if(e4.getSource()==exitBtn2)
		{
			System.exit(0);
		}
	}
}