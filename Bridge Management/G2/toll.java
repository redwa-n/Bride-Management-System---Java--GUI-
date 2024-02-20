//bus
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll extends JFrame implements ActionListener
{	
	JFrame f1;
	JButton b1,b2,b3,b4;
	JLabel l1,l2;
	ImageIcon img;
		public toll()
		{
			
			img=new ImageIcon("buss.gif");
        	l2 = new JLabel(img);
        	l2.setBounds(0,0,800,600);


            f1=new JFrame();
            f1.setVisible(true);
            f1.setSize(800,600);
            f1.setLayout(null);
            f1.setDefaultCloseOperation(EXIT_ON_CLOSE);  

            l1=new JLabel(" Please which is your vehicle type");
            l1.setBounds(270,90,300,50); 



            b1=new JButton("toll for ac bus");
            b1.setBounds(300,150,150,20);  
            b1.setBackground(new Color(198, 65, 83));
            b1.setOpaque(true);
            b1.setForeground(Color.WHITE);

            b2=new JButton("toll for non ac bus");
            b2.setBounds(300,200,150,20);

            b2.setBackground(new Color(198, 65, 83));
            b2.setOpaque(true);
            b2.setForeground(Color.WHITE);

            b3=new JButton("back");
            b3.setBounds(240,270,100,20);
			b3.setBackground(new Color(198, 65, 83));
            b3.setOpaque(true);
            b3.setForeground(Color.WHITE);

            b4=new JButton("exit");
            b4.setBounds(390,270,100,20);
			b4.setBackground(new Color(198, 65, 83));
            b4.setOpaque(true);
            b4.setForeground(Color.WHITE);

            f1.add(b1);
            f1.add(b2);
            f1.add(b3);  
            f1.add(b4);
            f1.add(l1);
            f1.add(l2);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
        }
            public void actionPerformed(ActionEvent d)
			{
				String msg="";  
      		    float amount1=1500;
      		    float amount2=2000;  

				if(d.getSource()==b1)
				{
					
					toll4 g=new toll4();
					msg+="AC Bus toll is 1500\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1);
				}
				if(d.getSource()==b2)
				{
					toll4 g1=new toll4();
					msg+="AC Bus toll is 2000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount2);
				}
				if(d.getSource()==b3)
				{
				vehicale t5555=new vehicale();
				}

				if(d.getSource()==b4)
                {
                    System. exit(0); 
                }

			
			}
		}
//} 