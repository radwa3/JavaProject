import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class FourthPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourthPage frame4 = new FourthPage(1);
					frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the frame.
	 */
	
	public FourthPage(int result,int job, int M) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrResult = new JTextArea();
		txtrResult.setForeground(Color.RED);
		txtrResult.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrResult.setBackground(SystemColor.control);
		txtrResult.setText("Result");
		txtrResult.setBounds(15, 16, 98, 31);
		panel.add(txtrResult);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(205, 55, 251, 43);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea_1.setBackground(SystemColor.control);
		textArea_1.setBounds(15, 225, 866, 66);
		panel.add(textArea_1);
		
		
		
		JTextArea txtrRecommendations = new JTextArea();
		txtrRecommendations.setForeground(Color.RED);
		txtrRecommendations.setBackground(SystemColor.control);
		txtrRecommendations.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrRecommendations.setText("Recommendations:");
		txtrRecommendations.setBounds(15, 153, 205, 31);
		
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea_1_1.setBackground(SystemColor.control);
		textArea_1_1.setBounds(15, 395, 532, 43);
		panel.add(textArea_1_1);
		
		JTextArea txtrTreatments = new JTextArea();
		txtrTreatments.setForeground(Color.RED);
		txtrTreatments.setBackground(SystemColor.control);
		txtrTreatments.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrTreatments.setText("Treatments:");
		txtrTreatments.setBounds(15, 307, 701, 43);
		
		
		 
		  if(result>4 && job==9){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
		  
			else if(result>3 && job==9){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>2 && job==9){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>1 && job==9){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>0 && job==9){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result==0 && job==9 && M<3){
				textArea.setText("Low infection");	
				textArea_1.setText("Just drink hot drinks and stay home alone for a time ");
				txtrTreatments.hide();
			}
			else if(result==0 && job==9 && M>3){
				textArea.setText("Medium infection");	
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
		  
		  if(result>4 && job==5){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>3 && job==5){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>2 && job==5 &&M>3){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>2 && job==5 && M<3){
				textArea.setText("Medium infection");	
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
			else if(result>1 && job==5 && M>3){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
		  
			else if(result>1 && job==5 &&M<3){
				textArea.setText("Medium infection");	
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
			else if(result>0 && job==5 &&M>3){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>0 && job==5 &&M<3){
				textArea.setText("Medium infection");
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
			else if(result==0 && job==5 &&M>3){
				textArea.setText("Low infection");	
				textArea_1.setText("Just drink hot drinks and stay home alone for a time ");
				txtrTreatments.hide();
			}
		  
			else if(result==0 && job==5 &&M<3){
				textArea.setText("Your are fine");
				textArea_1.hide();
				txtrRecommendations.hide();
			}
		  
		  
		  
		  if(result>4 && job==3){
				textArea.setText("High infection");
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>3 && job==3){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
			else if(result>2 && job==3 && M>3){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
		  
			else if(result>2 && job==3 && M<3){
				textArea.setText("Medium infection");
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
			else if(result>1 && job==3 && M>3){
				textArea.setText("High infection");	
				textArea_1.setText("Follow preventive measures and go to nearest hospital");
				textArea_1_1.setText("Write here Corona drugs from internet");
			}
		  
			else if(result>1 && job==3 && M<3){
				textArea.setText("Medium infection");
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
		  
			else if(result>0 && job==3 && M>3){
				textArea.setText("Medium infection");
				textArea_1.setText("Drink hot drinks eat lemon and orange and stay home \n alone and ask doctors every day");	
				textArea_1_1.setText("Write here cold drugs from internet");
			}
			else if(result>0 && job==3 && M<3){
				textArea.setText("Low infection");	
				textArea_1.setText("Just drink hot drinks and stay home alone for a time ");
				txtrTreatments.hide();
			}
		  
			else if(result==0 && job==3 && M>3){
				textArea.setText("Low infection");	
				textArea_1.setText("Just drink hot drinks and stay home alone for a time ");
				txtrTreatments.hide();
			}
		  
			else if(result==0 && job==3 && M<3 ){
				textArea.setText("Your are fine");	
				textArea_1.hide();
				txtrRecommendations.hide();
			}
		panel.add(textArea);
		panel.add(txtrRecommendations);
		panel.add(txtrTreatments);
		
		
	}

}
