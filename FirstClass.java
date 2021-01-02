import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.JLabel;

public class FirstClass extends JFrame {
	private JTextField textField;
	private JTextField txtCheckYourselfAgainst;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstClass frame = new FirstClass();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setForeground(Color.CYAN);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrCheckYourselfAgainst = new JTextArea();
		txtrCheckYourselfAgainst.setForeground(Color.BLACK);
		txtrCheckYourselfAgainst.setFont(new Font("Mongolian Baiti", Font.PLAIN, 25));
		txtrCheckYourselfAgainst.setBackground(SystemColor.control);
		txtrCheckYourselfAgainst.setText("Check yourself against corona virus by answering and telling questions");
		txtrCheckYourselfAgainst.setBounds(36, 371, 737, 30);
		panel.add(txtrCheckYourselfAgainst);
		
		JTextArea txtrCoronaCheck = new JTextArea();
		txtrCoronaCheck.setBackground(SystemColor.control);
		txtrCoronaCheck.setFont(new Font("Yu Gothic UI", Font.BOLD, 35));
		txtrCoronaCheck.setTabSize(100);
		txtrCoronaCheck.setForeground(Color.RED);
		txtrCoronaCheck.setText("Corona Check");
		txtrCoronaCheck.setBounds(290, 16, 262, 50);
		panel.add(txtrCoronaCheck);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(674, 423, 115, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 82, 807, 273);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\EbrahimR\\Documents\\classes task\\image.PNG"));
		panel.add(lblNewLabel);
btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SecondPage frame2 = new SecondPage();
				FirstClass.this.dispose();
				frame2.setVisible(true);
				
			}
		});
		
		
	
		
		
	}
}
