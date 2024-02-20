import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Employee2 extends JFrame implements ActionListener,MouseListener
{	
	JLabel c2Text,c2Login,c2ImgLabel2,c2LogOut,c2ImgLabel1;
	JPasswordField c2PassPF;
	JButton c2ExitBtn, c2BackBtn, c2NxtBtn,acc,toll,employee;
	JPanel c2Panel;
	ImageIcon c2Icon,c2image;
	JCheckBox c1, c2, c3, c4;
	JComboBox c2Combo;
	Font myFont,myFont12;
	public Employee2()
	{
		this.setTitle("Choose Your Sector");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		c2Panel = new JPanel();
		c2Panel.setLayout(null);

		c2Icon = new ImageIcon("208R.gif");
		setIconImage(c2Icon.getImage());

		
		c2Text = new JLabel("  You Have Successfully Loged In  ");
		c2Text.setBounds(293, 140, 232, 30);
		c2Text.setBackground(new Color(198, 65, 83));
		c2Text.setOpaque(true);
		c2Text.setForeground(Color.WHITE);
		c2Text.setFont(myFont12);
		c2Panel.add(c2Text);
		
		/*c2Login = new JLabel("Choose Your Option");
		c2Login.setBounds(330, 240, 180, 20);
		c2Login.setBackground(new Color(162, 160, 161));
		c2Login.setOpaque(true);
		c2Login.setFont(myFont);
		c2Panel.add(c2Login);

		String items[] = {"Toll Management", "Employee Management", "Account Management"};
		c2Combo = new JComboBox(items);
		c2Combo.setBounds(300, 280, 180, 20);
		c2Combo.setForeground(new Color(198, 65, 83));
		c2Combo.setFont(myFont);
		c2Panel.add(c2Combo);*/

		toll = new JButton("Toll Management");
		toll.setBounds(335, 230,140, 30);
		toll.setBackground(new Color(198, 65, 83));
		toll.setOpaque(true);
		toll.setForeground(Color.BLACK);
		toll.setFont(myFont);
		toll.addActionListener(this);
		toll.addMouseListener(this);
		c2Panel.add(toll);

		/*employee = new JButton("Emplyee Management");
		employee.setBounds(335, 260,140, 20);
		employee.setBackground(new Color(198, 65, 83));
		employee.setOpaque(true);
		employee.setForeground(Color.BLACK);
		employee.setFont(myFont);
		employee.addActionListener(this);
		employee.addMouseListener(this);
		c2Panel.add(employee);*/

		acc = new JButton("Account Management");
		acc.setBounds(335, 260,140, 30);
		acc.setBackground(new Color(198, 65, 83));
		acc.setOpaque(true);
		acc.setForeground(Color.BLACK);
		acc.setFont(myFont);
		acc.addActionListener(this);
		acc.addMouseListener(this);
		c2Panel.add(acc);
		
	

		c2ExitBtn = new JButton("Exit");
		c2ExitBtn.setBounds(450, 330, 80, 30);
		c2ExitBtn.setBackground(new Color(198, 65, 83));
		c2ExitBtn.setOpaque(true);
		c2ExitBtn.setForeground(Color.BLACK);
		c2ExitBtn.addActionListener(this);
		c2ExitBtn.addMouseListener(this);
		c2Panel.add(c2ExitBtn);

		c2BackBtn = new JButton("Back");
		c2BackBtn.setBounds(260, 330, 80, 30);
		c2BackBtn.setBackground(new Color(198, 65, 83));
		c2BackBtn.setOpaque(true);
		c2BackBtn.setForeground(Color.BLACK);
		c2BackBtn.addActionListener(this);
		c2BackBtn.addMouseListener(this);
		c2Panel.add(c2BackBtn);

		/*c2NxtBtn = new JButton("Next");
		c2NxtBtn.setBounds(200, 330, 80, 30);
		c2NxtBtn.setBackground(new Color(198, 65, 83));
		c2NxtBtn.setOpaque(true);
		c2NxtBtn.setForeground(Color.BLACK);
		c2NxtBtn.addActionListener(this);
		c2NxtBtn.addMouseListener(this);
		c2Panel.add(c2NxtBtn);*/

		/*c2LogOut = new JButton("Log Out");
		c2LogOut.setBounds(1180, 50, 80, 20);
		c2LogOut.setForeground(Color.WHITE);
		c2LogOut.setBackground(new Color(169,0,0));
		c2LogOut.addActionListener(this);
		c2Panel.add(c2LogOut);*/

		/*c2image2 = new ImageIcon("d.gif");
		c2ImgLabel2 = new JLabel(c2image2);
		c2ImgLabel2.setBounds(0, 0, 800, 600);
		c2Panel.add(c2ImgLabel2);*/

		c2image = new ImageIcon("images.jpg");
		c2ImgLabel1 = new JLabel(c2image);
		c2ImgLabel1.setBounds(0, 0, 1270, 710);
		c2Panel.add(c2ImgLabel1);
		

		this.add(c2Panel);

	}
	private void setTime() {
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setBackground(new Color(198, 65, 83));
			c2ExitBtn.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(new Color(198, 65, 83));
			c2BackBtn.setForeground(new Color(198, 65, 83));
		}
		/*else if(me.getSource() == employee)
		{
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(new Color(198, 65, 83));
		}*/
		else if(me.getSource() ==toll)
		{
			toll.setBackground(new Color(198, 65, 83));
			toll.setForeground(new Color(198, 65, 83));
		}

		else if(me.getSource() == acc)
		{
			acc.setBackground(new Color(198, 65, 83));
			acc.setForeground(new Color(198, 65, 83));
		}
		
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setBackground(new Color(198, 65, 83));
			c2ExitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(new Color(198, 65, 83));
			c2BackBtn.setForeground(Color.BLACK);
		}
		/*else if(me.getSource() == employee)
		{
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(Color.BLACK);
		}*/

		else if(me.getSource() == acc)
		{
			acc.setBackground(new Color(198, 65, 83));
			acc.setForeground(Color.BLACK);
		}

		else if(me.getSource() == toll)
		{
			toll.setBackground(new Color(198, 65, 83));
			toll.setForeground(Color.BLACK);
		}

		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent e2)
	{
		 if(e2.getSource()==toll)
		{
			vehicale v1 = new vehicale();
			v1.setVisible(true);
			this.setVisible(false);
		}

		/*else if(e2.getSource()==employee)
		{
			Employee3 c1 = new Employee3();
			c1.setVisible(true);
			this.setVisible(false);
		}*/

		else if(e2.getSource()==acc)
		{
			Account1 a1 = new Account1();
			a1.setVisible(true);
			this.setVisible(false);
		}
		

		else if(e2.getSource()==c2BackBtn)
		{
			Employee c2 = new Employee();
			c2.setVisible(true);
			this.setVisible(false);
		}

		/*else if(e2.getSource()==c2NxtBtn)
		{
			Account1 v2 = new Account1();
			v2.setVisible(true);
			this.setVisible(false);
		}*/
		
		
		

		else if(e2.getSource()==c2ExitBtn)
		{
			System.exit(0);
		}

	}
}