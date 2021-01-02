import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class SecondPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	//static SecondPage frame2 = new SecondPage();
	static int count;
	static int job;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the frame.
	 */
	public SecondPage() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setForeground(SystemColor.textHighlight);
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPersonalInformation.setBounds(28, 0, 223, 36);
		contentPane.add(lblPersonalInformation);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtrName.setBackground(SystemColor.control);
		txtrName.setText("Name:");
		txtrName.setBounds(15, 57, 75, 36);
		contentPane.add(txtrName);
		
		JTextArea txtrGender = new JTextArea();
		txtrGender.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtrGender.setBackground(SystemColor.control);
		txtrGender.setText("Gender:");
		txtrGender.setBounds(15, 95, 75, 22);
		contentPane.add(txtrGender);
		
		JTextArea txtrName_1_1 = new JTextArea();
		txtrName_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtrName_1_1.setBackground(SystemColor.control);
		txtrName_1_1.setText("Age:");
		txtrName_1_1.setBounds(15, 135, 75, 36);
		contentPane.add(txtrName_1_1);
		
		JTextArea txtrName_1_1_1 = new JTextArea();
		txtrName_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtrName_1_1_1.setBackground(SystemColor.control);
		txtrName_1_1_1.setText("Job:");
		txtrName_1_1_1.setBounds(15, 180, 75, 22);
		contentPane.add(txtrName_1_1_1);
		
		JTextArea txtrName_1_1_2 = new JTextArea();
		txtrName_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtrName_1_1_2.setBackground(SystemColor.control);
		txtrName_1_1_2.setText("City:");
		txtrName_1_1_2.setBounds(359, 180, 75, 36);
		contentPane.add(txtrName_1_1_2);
		
		textField = new JTextField();
		textField.setBounds(115, 59, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(106, 96, 155, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(262, 96, 155, 29);
		contentPane.add(rdbtnFemale);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 137, 146, 26);
		contentPane.add(textField_1);
		
		JLabel lblDoYouHave = new JLabel("Do you have any of the following diseases ?");
		lblDoYouHave.setForeground(SystemColor.textHighlight);
		lblDoYouHave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDoYouHave.setBounds(28, 275, 407, 36);
		contentPane.add(lblDoYouHave);
		
		JCheckBox checkbox = new JCheckBox("Liver disease");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox.setBounds(458, 324, 146, 27);
		contentPane.add(checkbox);
		
		JCheckBox checkbox_1 = new JCheckBox("Pressure");
		checkbox_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox_1.setBounds(282, 324, 124, 27);
		contentPane.add(checkbox_1);
		
		JCheckBox checkbox_2 = new JCheckBox("immunodeficiency");
		checkbox_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox_2.setBounds(389, 376, 188, 27);
		contentPane.add(checkbox_2);
		
		JCheckBox checkbox_3 = new JCheckBox("Heart disease");
		checkbox_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox_3.setBounds(54, 324, 146, 27);
		contentPane.add(checkbox_3);
		
		JCheckBox checkbox_4 = new JCheckBox("respiratory system diseases");
		checkbox_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox_4.setBounds(98, 376, 267, 27);
		contentPane.add(checkbox_4);
		
		
		
		JButton btnNewButton1 = new JButton("Next");
		btnNewButton1.setBounds(501, 415, 115, 29);
		contentPane.add(btnNewButton1);
		
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		l1.addElement("Doctor");  
	    l1.addElement("Developer");  
	    l1.addElement("Teacher");  
	  
		
	    DefaultListModel<String> l2 = new DefaultListModel<>();  
		l2.addElement("Cairo");  
		l2.addElement("Alex");  
		l2.addElement("Aswan");  
		
	    
	    JList<String> list = new JList<>(l1);  
	    list.setLayoutOrientation(JList.VERTICAL_WRAP);
	   list.setBounds(125,184, 75,75); 
	   contentPane.add(list);
	   
	   JList<String> list_1 = new JList<>(l2);
	   list_1.setLayoutOrientation(JList.VERTICAL_WRAP);
	   list_1.setBounds(458, 184, 75, 75);
	   contentPane.add(list_1);
	   
	   
	  
        btnNewButton1.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(list.getSelectedIndex()==0)
				{
					job=9;
				}
				
				else if(list.getSelectedIndex()== 1)
				{
					job=3;
				}
				else if(list.getSelectedIndex()== 2)
				{
					job=5;
				}
				
				if (checkbox.isSelected()){
	    			count= count+1;
	    		}
	    	   
	    	   if (checkbox_1.isSelected()){
	    			count= count+1;
	    		}
	    	  if (checkbox_2.isSelected()){
	    					count= count+1;
	    				} 
	    	  if (checkbox_3.isSelected()){
	    			count= count+1;
	    		}  
	    	   
	    	  if (checkbox_4.isSelected()){
	    			count= count+1;
	    		} 
				ThirdPage frame3 = new ThirdPage(count,job);
				//frame2.setVisible(false);
				SecondPage.this.dispose();
				frame3.setVisible(true);
				
				
			}
		});
	}
}
