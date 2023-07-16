package Fuel_Helper;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					help frame = new help();
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
	public help() {
		setTitle("Fuel Helper \\ Help");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame jf1 = new MainFrame();
				jf1.show();
				
				dispose();
			
			}
		});
		btnNewButton.setBounds(324, 238, 100, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("This is a application which helps you to face your fuel related problems.");
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Features and functionalities");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 36, 346, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("> Check  ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 61, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("> QR code");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 96, 107, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("> Stations near me");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 125, 135, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("> Remaining Distance ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 150, 135, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("-  You can check whether remaining fuel amount of");
		lblNewLabel_6.setBounds(144, 61, 296, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("-  For get your QR code from site");
		lblNewLabel_7.setBounds(144, 96, 280, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("-  You can find near fuel stations. ");
		lblNewLabel_8.setBounds(144, 125, 280, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("-  For check distance which can travel with your ");
		lblNewLabel_9.setBounds(144, 150, 280, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("the nearest station is enough or not");
		lblNewLabel_10.setBounds(154, 75, 270, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("current fuel amount");
		lblNewLabel_11.setBounds(154, 164, 270, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("> Registration");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(10, 185, 100, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("-  If you didn't register for QR system. You can use ");
		lblNewLabel_13.setBounds(144, 185, 296, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("this for Registration procees.");
		lblNewLabel_14.setBounds(154, 199, 270, 14);
		contentPane.add(lblNewLabel_14);
	}
}