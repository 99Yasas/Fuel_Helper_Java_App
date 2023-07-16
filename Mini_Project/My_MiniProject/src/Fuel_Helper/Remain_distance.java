package Fuel_Helper;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;

public class Remain_distance extends JFrame {

	private JPanel contentPane;
	private JLabel lb1_image;
	private JTextField N31;
	private JTextField N32;
	private JTextField text31;

	/**
	 * Launch the application.
	 */
	
	double ans1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remain_distance frame = new Remain_distance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void arithmetic_operation() {
		try {
			ans1=Double.parseDouble(N31.getText())*Double.parseDouble(N32.getText());
			text31.setText("You Can Travel Around "+Double.toString(ans1)+" Km");
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			text31.setText("Invalid Input");
		}
		
		
		}



	/**
	 * Create the frame.
	 */
	public Remain_distance() {
		setTitle("Fuel Helper \\ Remaining Distance");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame jf1 = new MainFrame();
				jf1.show();
				
				dispose();
			
			}
		});
		btnNewButton.setBounds(10, 231, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Remain Fuel Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 28, 138, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance Per Liter");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 59, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		N31 = new JTextField();
		N31.setBounds(176, 25, 98, 20);
		contentPane.add(N31);
		N31.setColumns(10);
		
		N32 = new JTextField();
		N32.setBounds(176, 56, 98, 20);
		contentPane.add(N32);
		N32.setColumns(10);
		
		text31 = new JTextField();
		text31.setBackground(Color.WHITE);
		text31.setForeground(new Color(0, 51, 153));
		text31.setFont(new Font("Verdana", Font.BOLD, 12));
		text31.setEditable(false);
		text31.setBounds(20, 110, 254, 96);
		contentPane.add(text31);
		text31.setColumns(10);

		btnNewButton_1.setBounds(296, 110, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text31.setText("");
				N31.setText("");
				N32.setText("");
			}
			
		});
		btnNewButton_2.setBounds(296, 161, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}
}