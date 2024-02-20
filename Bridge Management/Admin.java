import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Admin extends JFrame implements ActionListener,MouseListener
{	
	JLabel text2,login2,userLabel2,passLabel2,a2ImgLabel1,management1,management2,management3,management;
	JTextField userTF2;
	JPasswordField passPF2;
	JButton exitBtn2, backBtn2, loginBtn2;
	JPanel panel2;
	JComboBox c1Combo;
	ImageIcon icon2;
    ImageIcon a1image1;
	Font myFont,myFont12;
	public Admin()
	{
		this.setTitle("Management Log In Section");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		panel2 = new JPanel();
		panel2.setLayout(null);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		icon2 = new ImageIcon("208R.gif");
		setIconImage(icon2.getImage());

		

		management = new JLabel("                                                                        Admin (Management) Login Panel");
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

		login2= new JLabel("  Log In With Username & Password ");
		login2.setBounds(293, 165, 232, 30);
		login2.setBackground(new Color(198, 65, 83));
		login2.setOpaque(true);
		login2.setForeground(Color.WHITE);
		login2.setFont(myFont12);
		panel2.add(login2);

		userLabel2 = new JLabel("Username : ");
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

		passLabel2 = new JLabel("Password  : ");
		passLabel2.setBounds(300, 267, 65, 18);
		passLabel2.setBackground(new Color(198, 65, 83));
		passLabel2.setOpaque(true);
		passLabel2.setForeground(Color.WHITE);
		passLabel2.setFont(myFont);
		panel2.add(passLabel2);

		passPF2 = new JPasswordField();
		passPF2.setBounds(370, 267, 150, 20);
		passPF2.setBackground(new Color(162, 160, 161));
		passPF2.setForeground(Color.BLACK);
		passPF2.setFont(myFont);
		passPF2.setEchoChar('$');
		panel2.add(passPF2);

		
		/*c1Option = new JLabel("See Password");
		c1Option.setBounds(335, 300, 250, 30);
		c1Option.setFont(myFont);
        panel1.add(c1Option);*/

		String[] items = {" Password Hint","         1234"};
		c1Combo = new JComboBox(items);
		c1Combo.setBounds(335, 290, 140, 20);
		c1Combo.setForeground(new Color(198, 65, 83));
		//c1Combo.setBackground(new Color(198, 65, 83));
		c1Combo.setFont(myFont);
		panel2.add(c1Combo);

		loginBtn2 = new JButton("Log In");
		loginBtn2.setBounds(455, 330, 80, 30);
		loginBtn2.setBackground(new Color(198, 65, 83));
		loginBtn2.setOpaque(true);
		loginBtn2.setForeground(Color.BLACK);
		loginBtn2.addActionListener(this);
		loginBtn2.addMouseListener(this);
		loginBtn2.setFont(myFont);
		panel2.add(loginBtn2);

		exitBtn2= new JButton("Exit");
		exitBtn2.setBounds(255, 330, 80, 30);
		exitBtn2.setBackground(new Color(198, 65, 83));
		exitBtn2.setOpaque(true);
		exitBtn2.setForeground(Color.BLACK);
		exitBtn2.addActionListener(this);
		exitBtn2.addMouseListener(this);
		exitBtn2.setFont(myFont);
		panel2.add(exitBtn2);

		backBtn2 = new JButton("Back");
		backBtn2.setBounds(355, 330, 80, 30);
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
			String s1 = userTF2.getText();
			String s2 = passPF2.getText();

			if(s1.equals("Redwan") && s2.equals("1234") || s1.equals("Sakib") && s2.equals("1234") || s1.equals("Sourov") && s2.equals("1234"))
			{
				Admin2 a1 = new Admin2();
				a1.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please! Don't Try With Wrong Information Again.");
			}
			
		}
	
		else if(e4.getSource()==exitBtn2)
		{
			System.exit(0);
		}
	}
}