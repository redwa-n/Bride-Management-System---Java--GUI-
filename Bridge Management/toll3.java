//bike
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll3 extends JFrame implements ActionListener
{	
	JFrame f4;
	JButton b1,b2,b3;
    JLabel l1,l2;
    ImageIcon img;
		public toll3()
		{
			

            img=new ImageIcon("bike11.gif");
            l2 = new JLabel(img);
            l2.setBounds(0,0,800,600);

            f4=new JFrame();
            f4.setVisible(true);
            f4.setSize(800,600);
            f4.setLayout(null);
            f4.setDefaultCloseOperation(EXIT_ON_CLOSE);  

            l1=new JLabel(" Please which is your vehicle type");
            l1.setBounds(270,90,300,50); 


            b1=new JButton("toll for bike");
            b1.setBounds(300,150,150,20);
            b1.setBackground(new Color(102, 255,255));
            b1.setOpaque(true);
            b1.setForeground(Color.BLACK);

            b2=new JButton("back");
            b2.setBounds(300,200,150,20);
            b2.setBackground(new Color(102, 255,255));
            b2.setOpaque(true);
            b2.setForeground(Color.BLACK);

            b3=new JButton("exit");
            b3.setBounds(300,250,150,20);
            b3.setBackground(new Color(102, 255,255));
            b3.setOpaque(true);
            b3.setForeground(Color.BLACK);

            f4.add(b1);
            f4.add(b2);
            f4.add(b3);
            f4.add(l1);
            f4.add(l2);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
        }
            public void actionPerformed(ActionEvent h)
            {

                String msg="";  
                float amount1=100;
                if(h.getSource()==b1)
                {
                    toll4 i1=new toll4();
                    msg+="Motor Bike toll 1000\n";
                    JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1); 
                    
                }
                if(h.getSource()==b2)
                {
                vehicale t8=new vehicale();
                 
                }
                if(h.getSource()==b3)
                {
                    System. exit(0); 
                }
                
                //JOptionPane.showMessageDialog(this,msg);//main  
                //float amount=amount3+amount1+amount2;
                
            }
        }
