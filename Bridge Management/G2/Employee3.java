import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class Employee3 extends JFrame implements ActionListener, MouseListener
{	
	JLabel dateLabel,c3Text,c31Text, c3Text2,management1,management2,management3,management;
	JButton c3ExitBtn, c3BackBtn,c3NxtBtn;
	JPanel c3Panel;
	ImageIcon c3Icon;
	JComboBox c3Combo,c31Combo;
	ButtonGroup c3Bg1;
	JRadioButton c3r1, c3r2;
	Font myFont,myFont12;
	JTextField dateTF;

	public Employee3()
	{
		this.setTitle("Check Your Position");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);
		
		c3Panel = new JPanel();
		c3Panel.setLayout(null);

		c3Icon = new ImageIcon("208R.gif");
		setIconImage(c3Icon.getImage());

		management = new JLabel("                                                                                    Employee Details-1");
		management.setBounds(0, 0,800, 30);
		management.setFont(myFont);
		management.setBackground(new Color(198, 65, 83));
		management.setOpaque(true);
		management.setForeground(Color.WHITE);
		management.setFont(myFont12);
		c3Panel.add(management);

		management1 = new JLabel("");
		management1.setBounds(0, 0,20, 600);
		management1.setBackground(new Color(198, 65, 83));
		management1.setOpaque(true);
		c3Panel.add(management1);

		management2 = new JLabel("");
		management2.setBounds(780, 0,20, 600);
		management2.setBackground(new Color(198, 65, 83));
		management2.setOpaque(true);
		c3Panel.add(management2);

		management3 = new JLabel("");
		management3.setBounds(0, 553,800, 20);
		management3.setBackground(new Color(198, 65, 83));
		management3.setOpaque(true);
		c3Panel.add(management3);

		c3Text2 = new JLabel("SelectPosition :");
		c3Text2.setBounds(250, 150, 75, 20);
		c3Text2.setBackground(new Color(162, 160, 161));
	    c3Text2.setOpaque(true);
		c3Text2.setFont(myFont);
		c3Panel.add(c3Text2);

		String items2[] = {"Recruit", "Officer", "Manager", "Intern"};
		c3Combo = new JComboBox(items2);
		c3Combo.setBounds(340, 147, 150, 30);
		c3Combo.setForeground(new Color(198, 65, 83));
		c3Combo.setFont(myFont);
		c3Panel.add(c3Combo);

		c3Text = new JLabel("Gender :");
		c3Text.setBounds(250, 200, 70, 20);
		c3Text.setBackground(new Color(162, 160, 161));
	    c3Text.setOpaque(true);
		c3Text.setFont(myFont);
		c3Panel.add(c3Text);

		c3r1 = new JRadioButton("Male");
		c3r1.setBounds(300, 200, 100, 20);
		c3r1.setBackground(new Color(198, 65, 83));
		c3r1.setOpaque(true);
		c3r1.setFont(myFont);
		c3Panel.add(c3r1);
		
		c3r2 = new JRadioButton("Female");
		c3r2.setBounds(410, 200, 100, 20);
		c3r2.setBackground(new Color(198, 65, 83));
		c3r2.setOpaque(true);
		c3r2.setFont(myFont);
		c3Panel.add(c3r2);

		dateLabel = new JLabel("Date of Birth : ");
		dateLabel.setBounds(250, 250, 80, 18);
		dateLabel.setBackground(new Color(198, 65, 83));
		dateLabel.setOpaque(true);
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setFont(myFont);
		c3Panel.add(dateLabel);


		dateTF = new JTextField();
		dateTF.setBounds(335, 250, 150, 20);
		dateTF.setBackground(new Color(162, 160, 161));
		dateTF.setForeground(Color.BLACK);
		dateTF.setFont(myFont);
		c3Panel.add(dateTF);

		c31Text = new JLabel("Blood Group :");
		c31Text.setBounds(250, 300, 75, 20);
		c31Text.setBackground(new Color(162, 160, 161));
	    c31Text.setOpaque(true);
		c31Text.setFont(myFont);
		c3Panel.add(c31Text);

		String items3[] = {"A(pos)", "A(neg)", "AB(pos)", "AB(neg),B(pos)","B(neg)","O(pos)","O(neg)"};
		c31Combo = new JComboBox(items3);
		c31Combo.setBounds(340, 297, 100, 30);
		c31Combo.setForeground(new Color(198, 65, 83));
		c31Combo.setFont(myFont);
		c3Panel.add(c31Combo);

		c3Bg1 = new ButtonGroup();
		c3Bg1.add(c3r1);
		c3Bg1.add(c3r2);

		c3ExitBtn = new JButton("Exit");
		c3ExitBtn.setBounds(500, 330, 80, 30);
		c3ExitBtn.setBackground(new Color(198, 65, 83));
		c3ExitBtn.setOpaque(true);
		c3ExitBtn.setForeground(Color.BLACK);
		c3ExitBtn.addActionListener(this);
		c3ExitBtn.addMouseListener(this);
		c3ExitBtn.setFont(myFont);
		c3Panel.add(c3ExitBtn);

		c3BackBtn = new JButton("Back");
		c3BackBtn.setBounds(350, 330, 80, 30);
		c3BackBtn.setBackground(new Color(198, 65, 83));
		c3BackBtn.setOpaque(true);
		c3BackBtn.setForeground(Color.BLACK);
		c3BackBtn.addActionListener(this);
		c3BackBtn.addMouseListener(this);
		c3BackBtn.setFont(myFont);
		c3Panel.add(c3BackBtn);

		c3NxtBtn = new JButton("Next");
		c3NxtBtn.setBounds(200, 330, 80, 30);
		c3NxtBtn.setBackground(new Color(198, 65, 83));
		c3NxtBtn.setOpaque(true);
		c3NxtBtn.setForeground(Color.BLACK);
		c3NxtBtn.addActionListener(this);
		c3NxtBtn.addMouseListener(this);
		c3NxtBtn.setFont(myFont);
		c3Panel.add(c3NxtBtn);
		

		this.add(c3Panel);

	}
	private void setTime() {
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == c3ExitBtn)
		{
			c3ExitBtn.setBackground(new Color(198, 65, 83));
			c3ExitBtn.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == c3BackBtn)
		{
			c3BackBtn.setBackground(new Color(198, 65, 83));
			c3BackBtn.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == c3NxtBtn)
		{
			c3NxtBtn.setBackground(new Color(198, 65, 83));
			c3NxtBtn.setForeground(new Color(198, 65, 83));
		}
		
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == c3ExitBtn)
		{
			c3ExitBtn.setBackground(new Color(198, 65, 83));
			c3ExitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == c3BackBtn)
		{
			c3BackBtn.setBackground(new Color(198, 65, 83));
			c3BackBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == c3NxtBtn)
		{
			c3NxtBtn.setBackground(new Color(198, 65, 83));
			c3NxtBtn.setForeground(Color.BLACK);
		}

		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent e3)
	{
		if(e3.getSource()==c3BackBtn)
		{
			Admin c4 = new Admin();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e3.getSource()==c3ExitBtn)
		{
			System.exit(0);
		}
		else if(e3.getSource()==c3NxtBtn)
		{
			EmployeeTable c5 = new EmployeeTable();
			c5.setVisible(true);
			this.setVisible(false);
		}
	}
}

