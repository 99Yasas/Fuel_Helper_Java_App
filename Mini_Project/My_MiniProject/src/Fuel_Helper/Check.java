package Fuel_Helper;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.ImageIcon;



public class Check extends JFrame {

	private JPanel contentPane;
	private JTextField N1;
	private JTextField N2;
	private JTextField N3;
	private JTextField txtdisp1;

	/**
	 * Launch the application.
	 */
	
	double num,ans,rem;
	int calculation;
	private JTextField N4;
	private JTextField txtdisp2;	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check frame = new Check();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void arithmetic_operation() {
		try {
			ans=Double.parseDouble(N1.getText())*4+Double.parseDouble(N2.getText())*5+Double.parseDouble(N1.getText())*20;
			rem=Double.parseDouble(N4.getText())-ans;
			txtdisp1.setText("Amount For Queues  =  "+Double.toString(ans)+" Liters");
			txtdisp2.setText("Amount For You  =  "+Double.toString(rem)+" Liters");
			
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			txtdisp1.setText("Invalid Input");
		}
		
		
		}

	/**
	 * Create the frame.
	 */
	public Check() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		setTitle("Fuel Helper \\ Check amount");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
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
		btnNewButton.setBounds(335, 239, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		btnNewButton_1.setBounds(10, 239, 89, 23);
		contentPane.add(btnNewButton_1);
		
		N1 = new JTextField();
		N1.setBounds(226, 42, 86, 20);
		contentPane.add(N1);
		N1.setColumns(10);
		
		N2 = new JTextField();
		N2.setBounds(226, 73, 86, 20);
		contentPane.add(N2);
		N2.setColumns(10);
		
		N3 = new JTextField();
		N3.setBounds(226, 104, 86, 20);
		contentPane.add(N3);
		N3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Number of Bikes");
		lblNewLabel.setBounds(10, 45, 162, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of Threewheels");
		lblNewLabel_1.setBounds(10, 76, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Other vehicles");
		lblNewLabel_2.setBounds(10, 107, 162, 14);
		contentPane.add(lblNewLabel_2);
		
		txtdisp1 = new JTextField();
		txtdisp1.setEditable(false);
		txtdisp1.setBackground(Color.WHITE);
		txtdisp1.setBounds(10, 146, 302, 31);
		contentPane.add(txtdisp1);
		txtdisp1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Remaining Amount In The Station");
		lblNewLabel_3.setBounds(10, 14, 206, 14);
		contentPane.add(lblNewLabel_3);
		
		N4 = new JTextField();
		N4.setBounds(226, 11, 86, 20);
		contentPane.add(N4);
		N4.setColumns(10);
		
		txtdisp2 = new JTextField();
		txtdisp2.setEditable(false);
		txtdisp2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		txtdisp2.setBackground(Color.WHITE);
		txtdisp2.setForeground(Color.RED);
		txtdisp2.setBounds(10, 188, 302, 31);
		contentPane.add(txtdisp2);
		txtdisp2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisp1.setText("");
				txtdisp2.setText("");
				N1.setText("");
				N2.setText("");
				N3.setText("");
				N4.setText("");
			}
		});
		btnNewButton_2.setBounds(223, 239, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
