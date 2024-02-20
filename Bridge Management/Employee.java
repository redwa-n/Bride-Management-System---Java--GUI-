import java.lang.*;
import java.nio.channels.InterruptedByTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Employee extends JFrame implements MouseListener, ActionListener
{	
	JLabel login1,userLabel1,passLabel1,imgLabel1,c1ImgLabel1,newbox,c1Option,timeLabel,management,management1,management2,management3;
	JTextField userTF1;
	JPasswordField passPF1;
	JButton exitBtn1,admin1,loginBtn1,contact;
	JPanel panel1;
	ImageIcon icon1, image1, c1image1;
	Font myFont,myFont12;
	JComboBox c1Combo;
    Calendar calander;
    SimpleDateFormat timeFormate;
    String time;



	public Employee()
	{
		this.setTitle("Bridge Management System");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.white);

		icon1 = new ImageIcon("208R.gif");
		setIconImage(icon1.getImage());
		management = new JLabel("                                                                                 Employee Log In Panel");
		management.setBounds(0, 0,800, 30);
		management.setFont(myFont);
		management.setBackground(new Color(198, 65, 83));
		management.setOpaque(true);
		management.setForeground(Color.WHITE);
		management.setFont(myFont12);
		panel1.add(management);

		management1 = new JLabel("");
		management1.setBounds(0, 0,20, 600);
		management1.setBackground(new Color(198, 65, 83));
		management1.setOpaque(true);
		panel1.add(management1);

		management2 = new JLabel("");
		management2.setBounds(780, 0,20, 600);
		management2.setBackground(new Color(198, 65, 83));
		management2.setOpaque(true);
		panel1.add(management2);

		management3 = new JLabel("");
		management3.setBounds(0, 553,800, 20);
		management3.setBackground(new Color(198, 65, 83));
		management3.setOpaque(true);
		panel1.add(management3);


        timeFormate = new SimpleDateFormat("  hh:mm:ss a");
        timeLabel=new JLabel();
        timeLabel.setBounds(688,31 , 100, 15);
        time= timeFormate.format(Calendar.getInstance().getTime());
        //timeLabel.setBackground(new Color(198, 65, 83));
        timeLabel.setOpaque(true);
		timeLabel.setForeground(Color.BLACK);
		timeLabel.setFont(myFont12);
        timeLabel.setText(time);
        panel1.add(timeLabel);
        //this.add(timeLabel);
        this.setVisible(true);
        setTime();
        
    
            
          /*setTimee() {
            while(true)
            {
                time= timeFormate.format(Calendar.getInstance().getTime());
                timeLabel.setText(time);
                try {
                Thread.sleep(100);
                } 
                catch (InterruptedByTimeoutException e)
                {
                    e.printStackTrace();
                }
            }        
        }*/














		login1 = new JLabel("  Log In With Username & Password ");
		login1.setBounds(293, 165, 232, 30);
		login1.setBackground(new Color(198, 65, 83));
		login1.setOpaque(true);
		login1.setForeground(Color.WHITE);
		login1.setFont(myFont12);
		panel1.add(login1);

		userLabel1 = new JLabel("Username : ");
		userLabel1.setBounds(300, 238, 65, 18);
		userLabel1.setBackground(new Color(198, 65, 83));
		userLabel1.setOpaque(true);
		userLabel1.setForeground(Color.WHITE);
		userLabel1.setFont(myFont);
		panel1.add(userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(370, 237, 150, 20);
		userTF1.setBackground(new Color(162, 160, 161));
		userTF1.setForeground(Color.BLACK);
		userTF1.setFont(myFont);
		panel1.add(userTF1);

		passLabel1 = new JLabel("Password  : ");
		passLabel1.setBounds(300, 267, 65, 18);
		passLabel1.setBackground(new Color(198, 65, 83));
		passLabel1.setOpaque(true);
		passLabel1.setForeground(Color.WHITE);
		passLabel1.setFont(myFont);
		panel1.add(passLabel1);

		passPF1 = new JPasswordField();
		passPF1.setBounds(370, 267, 150, 20);
		passPF1.setBackground(new Color(162, 160, 161));
		passPF1.setForeground(Color.BLACK);
		passPF1.setFont(myFont);
		passPF1.setEchoChar('$');
		panel1.add(passPF1);

		
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
		panel1.add(c1Combo);
		
		admin1 = new JButton("Managament Log In");
		admin1.setBounds(335, 430,140, 30);
		admin1.setBackground(new Color(198, 65, 83));
		admin1.setOpaque(true);
		admin1.setForeground(Color.BLACK);
		admin1.setFont(myFont);
		admin1.addActionListener(this);
		admin1.addMouseListener(this);
		panel1.add(admin1);

		contact = new JButton("     Contacts    ");
		contact.setBounds(335, 460,140, 30);
		contact.setBackground(new Color(198, 65, 83));
		contact.setOpaque(true);
		contact.setForeground(Color.BLACK);
		contact.setFont(myFont);
		contact.addActionListener(this);
		contact.addMouseListener(this);
		panel1.add(contact);

		loginBtn1 = new JButton("Log In");
		loginBtn1.setBounds(300, 330, 80, 30);
		loginBtn1.setBackground(new Color(198, 65, 83));
		loginBtn1.setOpaque(true);
		loginBtn1.setForeground(Color.BLACK);
		loginBtn1.addActionListener(this);
		loginBtn1.addMouseListener(this);
		loginBtn1.setFont(myFont);
		panel1.add(loginBtn1);

		exitBtn1 = new JButton("Exit");
		exitBtn1.setBounds(450, 330, 80, 30);
		exitBtn1.setBackground(new Color(198, 65, 83));
		exitBtn1.setOpaque(true);
		exitBtn1.setForeground(Color.BLACK);
		exitBtn1.addActionListener(this);
		exitBtn1.addMouseListener(this);
		exitBtn1.setFont(myFont);
		panel1.add(exitBtn1);

		



		c1image1 = new ImageIcon("d.gif");
		c1ImgLabel1 = new JLabel(c1image1);
		c1ImgLabel1.setBounds(0, 0, 800, 600);
		panel1.add(c1ImgLabel1);


		this.add(panel1);

	}
	private void setTimee() {
	}
	private void setTime() {
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(new Color(198, 65, 83));
			loginBtn1.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(new Color(198, 65, 83));
			exitBtn1.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == admin1)
		{
			admin1.setBackground(new Color(198, 65, 83));
			admin1.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == contact)
		{
			contact.setBackground(new Color(198, 65, 83));
			contact.setForeground(new Color(198, 65, 83));
		}
		
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(new Color(198, 65, 83));
			loginBtn1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(new Color(198, 65, 83));
			exitBtn1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == admin1)
		{
			admin1.setBackground(new Color(198, 65, 83));
			admin1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == contact)
		{
			contact.setBackground(new Color(198, 65, 83));
			contact.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	
	public void actionPerformed(ActionEvent e1)
	{

		
		if(e1.getSource()==admin1)
		{
			Admin a1 = new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}

		else if(e1.getSource()==loginBtn1)
		{
			String s1 = userTF1.getText();
			String s2 = passPF1.getText();

			if(s1.equals("Redwan") && s2.equals("1234") || s1.equals("Sakib") && s2.equals("1234") || s1.equals("Sourov") && s2.equals("1234"))
			{
				Employee2 c1 = new Employee2();
				c1.setVisible(true);
				this.setVisible(false);
			}
            else
            {
                JOptionPane.showMessageDialog(null,"Please! Don't Try With Wrong Information Again.");
            }

			
		}
		else if(e1.getSource()==contact)
		{
			Contacts cc1 = new Contacts();
			cc1.setVisible(true);
			this.setVisible(false);
		}
		else if(e1.getSource()==exitBtn1)
		{
			System.exit(0);
		}
	}
}