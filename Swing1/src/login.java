//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField userfield;
	private JTextField passfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(161, 11, 129, 29);
		contentPane.add(lblNewLabel);
		
		JLabel username = new JLabel("User Name");
		username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		username.setBounds(116, 70, 86, 29);
		contentPane.add(username);
		
		userfield = new JTextField();
		userfield.setBounds(222, 76, 86, 20);
		contentPane.add(userfield);
		userfield.setColumns(10);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password.setBounds(116, 110, 86, 20);
		contentPane.add(password);
		
		passfield = new JTextField();
		passfield.setBounds(222, 110, 86, 20);
		contentPane.add(passfield);
		passfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = userfield.getText();
				String p = passfield.getText();
				if(s.equals("sandy001") & (p.equals("12345")))
				{
					home m=new home();
					m.setVisible(true);
				}
				else
				{
					error m=new error();
					m.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(173, 175, 89, 23);
		contentPane.add(btnNewButton);
	}
}
