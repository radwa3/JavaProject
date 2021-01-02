import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ThirdPage extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	static int M ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    ThirdPage frame3 = new ThirdPage(1);
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	*/}

	/**
	 * Create the frame.
	 */
	
	public ThirdPage(int scoure,int job) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPreventiveMeasures = new JLabel("Preventive Measures");
		lblPreventiveMeasures.setForeground(SystemColor.textHighlight);
		lblPreventiveMeasures.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPreventiveMeasures.setBounds(15, 16, 223, 36);
		panel.add(lblPreventiveMeasures);
		
		JTextPane txtpnHaveYouHad = new JTextPane();
		txtpnHaveYouHad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnHaveYouHad.setBackground(SystemColor.control);
		txtpnHaveYouHad.setText("Have you had contact with an infected person ?");
		txtpnHaveYouHad.setBounds(42, 83, 357, 26);
		panel.add(txtpnHaveYouHad);
		
		JTextPane txtpnDoYouAlways = new JTextPane();
		txtpnDoYouAlways.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnDoYouAlways.setBackground(SystemColor.control);
		txtpnDoYouAlways.setText("Do you always wear a mask ?");
		txtpnDoYouAlways.setBounds(42, 149, 301, 26);
		panel.add(txtpnDoYouAlways);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1.setBackground(SystemColor.control);
		textPane_1_1.setText("Do you wash your hands frequently ?");
		textPane_1_1.setBounds(42, 213, 333, 26);
		panel.add(textPane_1_1);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1_1.setBackground(SystemColor.control);
		textPane_1_1_1.setText("Do you follow the social spacing ?");
		textPane_1_1_1.setBounds(42, 278, 323, 26);
		panel.add(textPane_1_1_1);
		
		JTextPane textPane_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1_1_1.setBackground(SystemColor.control);
		textPane_1_1_1_1.setText("Are uou in closed places frequently ?");
		textPane_1_1_1_1.setBounds(42, 351, 339, 26);
		panel.add(textPane_1_1_1_1);
		
		JTextPane textPane_1_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1_1_1_1_1.setBackground(SystemColor.control);
		textPane_1_1_1_1_1.setText("Do you use anything personally collectively ?");
		textPane_1_1_1_1_1.setBounds(42, 419, 357, 26);
		panel.add(textPane_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(421, 80, 65, 29);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(532, 83, 65, 29);
		panel.add(rdbtnNo);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1.setBounds(421, 146, 65, 29);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setBounds(532, 149, 65, 29);
		panel.add(rdbtnNo_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1_1.setBounds(421, 210, 65, 29);
		panel.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNo_1_1 = new JRadioButton("No");
		rdbtnNo_1_1.setBounds(532, 210, 65, 29);
		panel.add(rdbtnNo_1_1);
		
		JRadioButton rdbtnNo_1_2 = new JRadioButton("No");
		rdbtnNo_1_2.setBounds(532, 275, 65, 29);
		panel.add(rdbtnNo_1_2);
		
		JRadioButton rdbtnNo_1_3 = new JRadioButton("No");
		rdbtnNo_1_3.setBounds(532, 348, 65, 29);
		panel.add(rdbtnNo_1_3);
		
		JRadioButton rdbtnNo_1_4 = new JRadioButton("No");
		rdbtnNo_1_4.setBounds(532, 416, 65, 29);
		panel.add(rdbtnNo_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1_1_1.setBounds(421, 278, 65, 29);
		panel.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1_1_2.setBounds(421, 348, 65, 29);
		panel.add(rdbtnNewRadioButton_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_3 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1_1_3.setBounds(421, 419, 65, 29);
		panel.add(rdbtnNewRadioButton_1_1_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(494, 454, 115, 29);
		panel.add(btnNext);
		
		
		
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnNewRadioButton.isSelected()){
					M=M+1;
				}
				if(rdbtnNo_1.isSelected()){
					M=M+1;
				}
				if(rdbtnNo_1_1.isSelected()){
					M=M+1;
				}
				if(rdbtnNo_1_2.isSelected()){
					M=M+1;
				}
				if(rdbtnNewRadioButton_1_1_2.isSelected()){
					M=M+1;
				}
				if(rdbtnNewRadioButton_1_1_3.isSelected()){
					M=M+1;
				}
				
				FourthPage frame4 = new FourthPage(scoure,job,M);
				//frame3.setVisible(false);
				ThirdPage.this.dispose();
				frame4.setVisible(true);
				
			}
		});
	}
}
