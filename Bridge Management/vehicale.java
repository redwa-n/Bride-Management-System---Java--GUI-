import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class vehicale extends JFrame implements ActionListener{  
    JLabel l,l1;  
    JButton cb1,cb2,cb3,cb4,cb5,b; 
    JFrame f,f1; 
    JPanel panel;
    Font ft;
    Color m;
    ImageIcon img;

  /*  toll t;
    toll1 t2;
    toll1 t1;
    toll3 t3;*/

    public vehicale(){

        m=new Color(204,255,255);
        
        img=new ImageIcon("208Rr.gif");
        l1 = new JLabel(img);
        l1.setBounds(0,0,800,600);


        f=new JFrame();
        f.setVisible(true); 
        f.setSize(800,600); 
        f.setLayout(null);  
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        //panel.setSize(310,50);
        panel.setBounds(245,50,290,50);
        panel.setLayout(null);
        panel.setBackground(m);
        ft= new Font("Cambria", Font.PLAIN, 28);


        l=new JLabel("toll managment System");
        l.setBounds(250,50,300,50); 
        l.setFont(ft); 

        cb1=new JButton("bus toll details");  
        cb1.setBounds(300,150,150,20); 
        cb1.setBackground(new Color(102, 255,255));
        cb1.setOpaque(true);
        cb1.setForeground(Color.BLACK);


        cb2=new JButton("car toll details");  
        cb2.setBounds(300,200,150,20);  
        cb2.setBackground(new Color(102, 255,255));
        cb2.setOpaque(true);
        cb2.setForeground(Color.BLACK);

        cb3=new JButton("truck toll details");  
        cb3.setBounds(300,250,150,20);  
        cb3.setBackground(new Color(102, 255,255));
        cb3.setOpaque(true);
        cb3.setForeground(Color.BLACK);

        cb4=new JButton("bike toll details");  
        cb4.setBounds(300,300,150,20); 
        cb4.setBackground(new Color(102, 255,255));
        cb4.setOpaque(true);
        cb4.setForeground(Color.BLACK);

        cb5=new JButton("Go Back");  
        cb5.setBounds(300,350,150,20);
        cb5.setBackground(new Color(102, 255,255));
        cb5.setOpaque(true);
        cb5.setForeground(Color.BLACK);

        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        
        f.add(panel);
        f.add(l1);
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
        cb4.addActionListener(this);
        cb5.addActionListener(this);
    }  
    public void actionPerformed(ActionEvent he){  
        float amount=0;  
        String msg="";  
        if(he.getSource()==cb1)
        {  
            toll yy=new toll(); 
          //  yy.setVisible(true);
            //this.setVisible(false);
        }  
        if(he.getSource()==cb2)
        {  
            toll1 yyy=new toll1();
           //yyy.setVisible(true);
           // this.setVisible(false);
        }  
        if(he.getSource()==cb3)
        {
            toll2 yyyy=new toll2(); 
           //yyyy.setVisible(true);
          //  this.setVisible(false);
        }  
         if(he.getSource()==cb4)
        {
            toll3 yyyp=new toll3(); 
            //yyyp.setVisible(true);
            //this.setVisible(false); 
        }
         if(he.getSource()==cb5)
        {
            Employee ee=new Employee(); 
            //yyyp.setVisible(true);
            //this.setVisible(false); 
        }
   
    }  
   
}  