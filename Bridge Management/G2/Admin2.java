import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Admin2 extends JFrame implements ActionListener,MouseListener
{	
	JLabel a2Text,a2ImgLabel2;
	JButton a2ExitBtn, a2BackBtn,employee;
	JPanel a2Panel;
	ImageIcon a2Icon;
	ImageIcon c2Icon, a2image2;
    Font myFont,myFont12;
	public Admin2()
	{
		this.setTitle("Emplyee Management");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		a2Panel = new JPanel();
		a2Panel.setLayout(null);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		a2Icon = new ImageIcon("208R.gif");
		setIconImage(a2Icon.getImage());


		a2Text = new JLabel("   You Have Successfully Loged In   ");
		a2Text.setBounds(293, 140, 232, 30);
		a2Text.setBackground(new Color(198, 65, 83));
		a2Text.setOpaque(true);
		a2Text.setForeground(Color.WHITE);
		a2Text.setFont(myFont12);
		a2Panel.add(a2Text);

		a2ExitBtn= new JButton("Exit");
		a2ExitBtn.setBounds(300, 330, 80, 30);
		a2ExitBtn.setBackground(new Color(198, 65, 83));
		a2ExitBtn.setOpaque(true);
		a2ExitBtn.setForeground(Color.BLACK);
		a2ExitBtn.addActionListener(this);
		a2ExitBtn.addMouseListener(this);
		a2ExitBtn.setFont(myFont);
		a2Panel.add(a2ExitBtn);

		a2BackBtn = new JButton("Back");
		a2BackBtn.setBounds(450, 330, 80, 30);
		a2BackBtn.setBackground(new Color(198, 65, 83));
		a2BackBtn.setOpaque(true);
		a2BackBtn.setForeground(Color.BLACK);
		a2BackBtn.addActionListener(this);
		a2BackBtn.addMouseListener(this);
		a2BackBtn.setFont(myFont);
		a2Panel.add(a2BackBtn);;

		employee = new JButton("Emplyee Management");
		employee.setBounds(335, 215,140, 30);
		employee.setBackground(new Color(198, 65, 83));
		employee.setOpaque(true);
		employee.setForeground(Color.BLACK);
		employee.setFont(myFont);
		employee.addActionListener(this);
		employee.addMouseListener(this);
		a2Panel.add(employee);
		

		a2image2 = new ImageIcon("d.gif");
		a2ImgLabel2 = new JLabel(a2image2);
		//a2ImgLabel2= new JLabel(c4image5);
		a2ImgLabel2.setBounds(0, 0, 800, 600);
		a2Panel.add(a2ImgLabel2);



		this.add(a2Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == employee)
		{
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == a2ExitBtn)
		{
			a2ExitBtn.setBackground(new Color(198, 65, 83));
			a2ExitBtn.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == a2BackBtn)
		{
			a2BackBtn.setBackground(new Color(198, 65, 83));
			a2BackBtn.setForeground(new Color(198, 65, 83));
		}
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == employee)
		{
			employee.setBackground(new Color(198, 65, 83));
			employee.setForeground(Color.BLACK);
		}
		else if(me.getSource() == a2ExitBtn)
		{
			a2ExitBtn.setBackground(new Color(198, 65, 83));
			a2ExitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == a2BackBtn)
		{
			a2BackBtn.setBackground(new Color(198, 65, 83));
			a2BackBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}

	public void actionPerformed(ActionEvent e5)
	{
		if(e5.getSource()==a2BackBtn)
		{
			Admin a1 = new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}
		else if(e5.getSource()==a2ExitBtn)
		{
			System.exit(0);
		}
		else if(e5.getSource()==employee)
		{
			Employee3 c1 = new Employee3();
			c1.setVisible(true);
			this.setVisible(false);
		}
	}
}