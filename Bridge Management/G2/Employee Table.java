import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


class EmployeeTable extends JFrame implements ActionListener{
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane sc;
	private Container c;
	private JLabel titleLabel,fnLabel,lnLabel,salaryLabel,idLabel;
	private JTextField fntf,lntf,sltf,itf;
	private JButton addButton, updateButton,deleteBUtton,clearButton;
    private String [] columns = {"First Name", "Last Name", "ID", "Salary"};
    private String [] rows = new String[4];

	EmployeeTable() {
		initComponents();
	} 
	public void initComponents(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(780,690);
		this.setLocatinRelatedTo(null);
		this.setTitle("Member Table");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		Font font = new Font ("Arial",Font.BOLD,16);

		titleLabel = new JLabel("Member Management");
		titleLabel.setBounds(140,10,250,50);
		titleLabel.setFont(font);
		c.add(titleLabel);

		fnLabel=new JLabel("First Name    ");
		fnLabel.setBounds(10,80,140,30);
		fnLabel.setFont(font);
		c.add(fnLabel);

		fntf=new JTextField ();
		fntf.setBounds(110,80,200,30);
        fntf.setFont(font);
        c.add(fntf);

        addButton = new JButton ("ADD");
        addButton.setBounds(400,80,100,30);
        addButton.setFont(font);
        c.add(addButton);

        lnLabel=new JLabel("Last Name    ");
		lnLabel.setBounds(10,130,150,30);
		lnLabel.setFont(font);
		c.add(lnLabel);

		lntf=new JTextField ();
		lntf.setBounds(110,130,200,30);
        lntf.setFont(font);
        c.add(lntf);

        updateButton = new JButton ("UPDATE");
        updateButton.setBounds(400,130,100,30);
        updateButton.setFont(font);
        c.add(updateButton);

        salaryLabel=new JLabel("Salary    ");
		salaryLabel.setBounds(10,180,150,30);
		salaryLabel.setFont(font);
		c.add(salaryLabel);

		sltf=new JTextField ();
		sltf.setBounds(110,180,200,30);
        sltf.setFont(font);
        c.add(sltf);


        deleteBUtton = new JButton ("DELETE");
        deleteBUtton.setBounds(400,180,100,30);
        deleteBUtton.setFont(font);
        c.add(deleteBUtton);

        idLabel=new JLabel("ID   ");
		idLabel.setBounds(10,230,150,30);
		idLabel.setFont(font);
		c.add(idLabel);


		itf=new JTextField ();
		itf.setBounds(110,230,200,30);
        itf.setFont(font);

        c.add(itf);

        clearButton = new JButton ("CLEAR");
        clearButton.setBounds(400,230,100,30);
        clearButton.setFont(font);
        c.add(clearButton);

        table = new JTable ();

        model= new DefaultTableModel();
        model.setColumnIdentifiers (columns);
        table.setModel(model);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setFont(font);
        table.setRowHeight(30);

        sc = new JScrollPane(table);
        sc.setBounds(10,360,740,265);
        c.add(sc);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteBUtton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter(){
        	private int numberOfRow;

			public void mouseClicked(MouseEvent m){
        		
				String f_name = model.getValueAt(numberOfRow, 0).toString();
        		String l_name = model.getValueAt(numberOfRow, 1).toString();
        		String id = model.getValueAt(numberOfRow, 2).toString();
        		String salary = model.getValueAt(numberOfRow, 3).toString();

        		fntf.setText(f_name);
        		lntf.setText(l_name);
        		itf.setText(id);
        		sltf.setText(salary);




        	}
        });

   
   }       
private void setLocatinRelatedTo(Object object) {
	}
@Override
 public void actionPerformed(ActionEvent a)
    {
    	if(a.getSource()==addButton)
    	{
    		rows[0]=fntf.getText();
    		rows[1]=lntf.getText();
    		rows[2]=itf.getText();
    		rows[3]=sltf.getText();

    		model.addRow(rows);

    	}
    	else if(a.getSource()==clearButton)
    	{
    		fntf.setText("");
    		lntf.setText("");
    		itf.setText("");
    		sltf.setText("");

    	}
    	else if (a.getSource()==deleteBUtton)
    	{
            int numberOfRow= table.getSelectedRow();
            if(numberOfRow>=0)
            {

            	model.removeRow(numberOfRow);

            }
            else 
            {
            	JOptionPane.showMessageDialog(null,"No Row has been selected or no row existed");
            }


    	}
		else if (a.getSource()==updateButton)
		{
			int numberOfRow = table.getSelectedRow();
			 
			    String f_name = fntf.getText();
        		String l_name = lntf.getText();
        		String id = itf.getText();
        		String salary = sltf.getText();

				model.setValueAt(f_name, numberOfRow, 0);
				model.setValueAt(l_name, numberOfRow, 1);
				model.setValueAt(id, numberOfRow, 2);
				model.setValueAt(salary, numberOfRow, 3);

		}
    }


}
