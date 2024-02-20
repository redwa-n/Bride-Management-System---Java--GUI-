//tuck
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*; 
public class toll2 extends JFrame implements ActionListener
{
JFrame f3;
JButton b1,b2,b3,b4,b5;
JLabel l1,l2;
ImageIcon img;
//vehicale v2;
	public toll2()
		{
			img=new ImageIcon("for-dribbble.gif");
        	l2 = new JLabel(img);
        	l2.setBounds(0,0,800,600);

            f3=new JFrame();
            f3.setVisible(true);
            f3.setSize(800,600);
            f3.setLayout(null);
            f3.setDefaultCloseOperation(EXIT_ON_CLOSE);  

            l1=new JLabel(" Please which is your vehicle type");
            l1.setBounds(270,90,300,50); 

            b1=new JButton("toll for 5 ton small truck");
            b1.setBounds(300,150,150,20); 
            b1.setBackground(new Color(198, 65, 83));
            b1.setOpaque(true);
            b1.setForeground(Color.WHITE);


            b2=new JButton("toll for  a large truck with 3 axles");
            b2.setBounds(300,200,150,20);			
            b2.setBackground(new Color(198, 65, 83));
            b2.setOpaque(true);
            b2.setForeground(Color.WHITE);

            b3=new JButton("toll for a large truck with above 4 axles");
            b3.setBounds(300,250,150,20);
            b3.setBackground(new Color(198, 65, 83));
            b3.setOpaque(true);
            b3.setForeground(Color.WHITE);

            b4=new JButton("back");
            b4.setBounds(240,300,100,20);
            b4.setBackground(new Color(198, 65, 83));
            b4.setOpaque(true);
            b4.setForeground(Color.WHITE);

            b5=new JButton("exit");
            b5.setBounds(390,300,100,20);
            b5.setBackground(new Color(198, 65, 83));
            b5.setOpaque(true);
            b5.setForeground(Color.WHITE);

            f3.add(b1);
            f3.add(b2);
            f3.add(b3);
            f3.add(b4);
            f3.add(b5);
            f3.add(l1);
            f3.add(l2);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
        }
            public void actionPerformed(ActionEvent g)
			{
				String msg="";  
      		    float amount1=2000;
      		    float amount2=4000;  
      		    float amount3=6000;
      		
				if(g.getSource()==b1)
				{
					toll4 u=new toll4();
					msg+="small truck toll 3000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount1);
				}

				if(g.getSource()==b2)
				{
					toll4 u1=new toll4();				
					msg+="a large truck toll 4000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount2);
				}

				if(g.getSource()==b3)
				{
					toll4 u3=new toll4();				
					msg+="a large truck with above 4 axles toll 6000\n";
					JOptionPane.showMessageDialog(this,msg+"\nTotal: "+amount3);
				}

				if(g.getSource()==b4)
				{
				vehicale t11=new vehicale();
				}

				if(g.getSource()==b5)
                {
                    System. exit(0); 
                }

				
			}
		}


