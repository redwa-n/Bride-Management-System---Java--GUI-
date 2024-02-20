import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll4 extends JFrame implements ActionListener
{
JFrame f5;
JButton b1,b2;
JLabel l1,l3,l4;
Font ft;
ImageIcon img;
	public toll4()
    {   
            ft= new Font("Cambria", Font.PLAIN, 12);

            img=new ImageIcon("pic.jpg");
            l4 = new JLabel(img);
            l4.setBounds(0,0,800,600);        
        
            f5=new JFrame();
            f5.setVisible(true);
            f5.setSize(800,600);
            f5.setLayout(null);
            f5.setDefaultCloseOperation(EXIT_ON_CLOSE);

            l1=new JLabel("Thank you for visit");
            l1.setBounds(310,150,150,25);
            l1.setBackground(new Color(102, 255,255));
            l1.setOpaque(true);
            l1.setForeground(Color.BLACK);
            l1.setFont(ft);

            l3=new JLabel("Have a Safe Journey");
            l3.setBounds(310,200,150,25);
            l3.setBackground(new Color(102, 255,255));
            l3.setOpaque(true);
            l3.setForeground(Color.BLACK);
            l3.setFont(ft);

            b2=new JButton("Go to vehicle List");
            b2.setBounds(300,250,150,25);
            b2.setBackground(new Color(102, 255,255));
            b2.setOpaque(true);
            b2.setForeground(Color.BLACK);
            b2.setFont(ft);

            b1=new JButton("exit");
            b1.setBounds(300,300,150,25);
            b1.setBackground(new Color(102, 255,255));
            b1.setOpaque(true);
            b1.setForeground(Color.BLACK);
            b1.setFont(ft);
            
            f5.add(l1);
            f5.add(b1);
            f5.add(b2);
            f5.add(l3); 
            f5.add(l4);  
            b1.addActionListener(this);
            b2.addActionListener(this);
        }
        public void actionPerformed( ActionEvent j)
        {
            if(j.getSource()==b1)
            {
                System.exit(0);
            }
            if(j.getSource()==b2)
            {
                vehicale t588=new vehicale();
            }

        }
    
}