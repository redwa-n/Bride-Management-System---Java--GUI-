import javax.swing.*;
import Classes.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;



public class LoginPage extends JFrame implements ActionListener
{
    ImageIcon icon;
    JLabel username, password, loginMsg, accountType, frameImage,background;
    JPanel CenterPanel; //JPanel RightPanel;
    JButton loginButton, resetButton;
    JRadioButton rButton1, rButton2;
    ButtonGroup bg;
    JTextField usernameField;
    JPasswordField userPasswordField;
    Font font;
    
  
    
    public LoginPage()
    {
        font = new Font("System", Font.BOLD, 23);



       this.setTitle("Hospital Management System");
        this.setSize(980, 600);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



       
        




        CenterPanel = new JPanel();
        CenterPanel.setBounds(0,0, 980, 600);
        
        //RightPanel =new JPanel();
       // RightPanel.setBounds(450,150,500,250);
        //RightPanel.setBackground(Color.decode("#CCE2CB"));
        //this.getContentPane().setBackground(Color.decode("#23b2a7"));
        
      
        




       // leftPanel.setBackground(Color.decode("#17776f"));
        
        usernameField = new JTextField();
       usernameField.setBounds(635, 194, 284, 30);
       usernameField.setFont(font);
        this.add(usernameField);
        
          userPasswordField = new JPasswordField();
        userPasswordField.setBounds(636, 263, 284, 30);
        userPasswordField.setFont(font);
        this.add(userPasswordField);
        
        loginButton = new JButton("Log In");
        loginButton.setBounds(645, 320, 80, 30);
        loginButton.setBackground(Color.decode("#CCD4BF"));
        loginButton.setFont(new Font("System", Font.BOLD, 15));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        this.add(loginButton);
        resetButton = new JButton("Reset");
        resetButton.setBounds(820,320, 80, 30);




        resetButton.setBackground(Color.decode("#CCD4BF"));




        resetButton.setFont(new Font("System", Font.BOLD, 15));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        this.add(resetButton);
        
        username = new JLabel("Username:");
        username.setBounds(502, 190, 247, 32);
        username.setForeground(Color.BLACK);
        username.setFont(font);
        this.add(username);



       password = new JLabel("Password:");
        password.setBounds(502, 260, 247, 32);
        password.setForeground(Color.BLACK);
        password.setFont(font);
        this.add(password);



        loginMsg = new JLabel();
        loginMsg.setBounds(635, 400, 450, 32);
        loginMsg.setForeground(Color.BLACK);
        loginMsg.setFont(new Font("System", Font.BOLD, 20));
        this.add(loginMsg);






        
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Login.jpg")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 980, 600);
     
         icon = new ImageIcon("Login.jpg");
       
        //this.add(RightPanel);
        this.add(frameImage);
    
        



      




    }



   public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == resetButton)
        {
            usernameField.setText(null);
            userPasswordField.setText(null);
            loginMsg.setText(null);
        }




        /* ################## Admin Login ################## */






       if(e.getSource() == loginButton)
        {
            String adminUsername = usernameField.getText();
            String adminPassword = String.valueOf(userPasswordField.getPassword());
            
            try
            {
                if(adminPassword.length() >= 8)
                {
                    if(adminUsername.equals("MIKI") && adminPassword.equals("AIUB 420"))
                    {
           
                        this.setVisible(false);
                    }
                    else
                    {
                        loginMsg.setText("Incorrect username or password");
                    }
                }
                else
                {
                    throw new PasswordException();
                }
            }
            catch(PasswordException pe)
            {
                showMessageDialog(null, pe.getMessage());
            }
        }
    }
}