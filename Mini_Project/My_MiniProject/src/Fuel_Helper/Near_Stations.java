package Fuel_Helper;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Near_Stations extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Near_Stations frame = new Near_Stations();
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
	public Near_Stations() {
		setTitle("Fuel Helper \\ Stations near me");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
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
		btnNewButton.setBounds(20, 221, 100, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Current City");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 22, 100, 23);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(20, 56, 212, 29);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JButton B1 = new JButton("Search");
		B1.setBackground(UIManager.getColor("Button.shadow"));
		B1.setFont(new Font("Tahoma", Font.BOLD, 12));
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.google.com/search?q=fuel+stations+near+"+txt1.getText()+"&oq=fuel&aqs=chrome.0.69i59l2j69i57j0i67i457j0i402l2j0i67j0i20i263i433i512j0i67.2879j0j15&sourceid=chrome&ie=UTF-8"));
			}
			catch(IOException err) {
				
			}
			catch(URISyntaxException err) {
				
			}
			}
		});
		B1.setBounds(20, 109, 112, 23);
		contentPane.add(B1);
		
		JLabel Img2 = new JLabel("");
		Img2.setBounds(212, 11, 212, 239);
		Image img = new ImageIcon(this.getClass().getResource("/fuellocation.jpg")).getImage();
		Img2.setIcon(new ImageIcon(img));
		contentPane.add(Img2);
	}
}