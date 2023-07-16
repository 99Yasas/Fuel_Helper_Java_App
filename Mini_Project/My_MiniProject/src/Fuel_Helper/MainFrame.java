package Fuel_Helper;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("Fuel Helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQR = new JButton("QR Code");
		btnQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
				browser.browse(new URI("https://fuelpass.gov.lk/login"));
			}
			catch(IOException err) {
				
			}
			catch(URISyntaxException err) {
				
			}
			}
		});

		btnQR.setBounds(10, 79, 173, 23);
		contentPane.add(btnQR);

		JButton btnNewButton = new JButton("Check amount");
		btnNewButton.setForeground(UIManager.getColor("CheckBox.foreground"));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check jf2 = new Check();
				jf2.show();
				
				dispose();
			
			}
		});
		btnNewButton.setBounds(10, 45, 173, 23);
		contentPane.add(btnNewButton);
		
		JButton btnStationsNearMe = new JButton("Stations near me");
		btnStationsNearMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Near_Stations jf4 = new Near_Stations();
				jf4.show();
				
				dispose();
			
			}
		});
		btnStationsNearMe.setBounds(10, 113, 173, 23);
		contentPane.add(btnStationsNearMe);
		
		JButton btnOK_1_1 = new JButton("Remaining Distance");
		btnOK_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remain_distance jf3 = new Remain_distance();
				jf3.show();
				
				dispose();
			
			}
		});
		btnOK_1_1.setBounds(10, 147, 173, 23);
		contentPane.add(btnOK_1_1);
		
		JButton btnOK_1_2 = new JButton("Registration");
		btnOK_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
				browser.browse(new URI("https://fuelpass.gov.lk/"));
			}
			catch(IOException err) {
				
			}
			catch(URISyntaxException err) {
				
			}
			}
		});
		btnOK_1_2.setBounds(10, 181, 173, 23);
		contentPane.add(btnOK_1_2);
		
		JLabel Img1 = new JLabel("");
		Img1.setBackground(Color.WHITE);
		Image img = new ImageIcon(this.getClass().getResource("/fuelproblem.jpg")).getImage();
		Img1.setIcon(new ImageIcon(img));
		Img1.setBounds(203, 33, 191, 222);
		contentPane.add(Img1);
		
		JButton btnhelp = new JButton("Help");
		btnhelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				help jf5 = new help();
				jf5.show();
				
				dispose();
			
			}
		});
		btnhelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnhelp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnhelp.setForeground(Color.RED);
		btnhelp.setBounds(10, 241, 85, 23);
		contentPane.add(btnhelp);
	}
}