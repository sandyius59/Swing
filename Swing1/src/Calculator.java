import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator 
{

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 219, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		//-----------------row 1 ------------------------
		
		JButton btnBack = new JButton("B");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String back=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					back =strB.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(10, 83, 50, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(63, 83, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMod.setBounds(120, 83, 50, 50);
		frame.getContentPane().add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(179, 80, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		
		//-----------------row 2 ------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 144, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 144, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(123, 144, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="-";
			}
			
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(179,144 , 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		//-----------------row 3 ------------------------
		
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn4.getText();
						textField.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn4.setBounds(10, 205, 50, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn5.getText();
						textField.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn5.setBounds(65, 205, 50, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn6.getText();
						textField.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn6.setBounds(123, 205, 50, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnMul = new JButton("*");
				btnMul.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operations ="*";
					}
				});
				btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnMul.setBounds(179, 205, 50, 50);
				frame.getContentPane().add(btnMul);
				
				//-----------------row 4 ------------------------
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(10, 266, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.setBounds(65, 266, 50, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(123, 266, 50, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operations ="/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDiv.setBounds(179, 266, 50, 50);
				frame.getContentPane().add(btnDiv);
				
//-----------------row 5 ------------------------
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String EnterNumber = textField.getText()+btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(10, 327, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDot.setBounds(65, 327, 50, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						Double ops = Double.parseDouble(String.valueOf(textField.getText()));
						ops = ops*(-1);
						textField.setText(String.valueOf(ops));
						
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnPM.setBounds(123, 327, 50, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						String answer;
						secondnum=Double.parseDouble(textField.getText());
						if(operations == "+")
						{
							result = firstnum+secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
						}
						else if(operations == "-")
						{
							result = firstnum-secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
						}
						else if(operations == "*")
						{
							result = firstnum*secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
						}
						else if(operations == "/")
						{
							result = firstnum/secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
						}
						else if(operations == "%")
						{
							result = firstnum % secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
						}
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnEqual.setBounds(179, 327, 50, 50);
				frame.getContentPane().add(btnEqual);
		
		
	}

}
