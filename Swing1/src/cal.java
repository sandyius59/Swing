import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JLabel result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 461, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(247, 52, 86, 20);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Calculater");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(186, 11, 107, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1st Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(147, 52, 90, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		num2 = new JTextField();
		num2.setBounds(247, 83, 86, 20);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("2nd Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(147, 80, 90, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Option");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(203, 114, 90, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Additon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
				n=Integer.parseInt(num1.getText());
				m=Integer.parseInt(num2.getText());
				c=n+m;
				result2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(29, 145, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
				n=Integer.parseInt(num1.getText());
				m=Integer.parseInt(num2.getText());
				c=n-m;
				result2.setText(Integer.toString(c));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(133, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
				n=Integer.parseInt(num1.getText());
				m=Integer.parseInt(num2.getText());
				c=n*m;
				result2.setText(Integer.toString(c));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(232, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
				n=Integer.parseInt(num1.getText());
				m=Integer.parseInt(num2.getText());
				c=n/m;
				result2.setText(Integer.toString(c));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setBounds(331, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("Result");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(203, 179, 71, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		 result2 = new JLabel("");
		 result2.setFont(new Font("Tahoma", Font.BOLD, 18));
		result2.setBounds(213, 222, 71, 39);
		frame.getContentPane().add(result2);
	}
}
