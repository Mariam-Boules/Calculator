import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculatorgui extends Cal {

	

	private JFrame frame;
	private JTextField txtDisplay;

	Cal doIt = new Cal();
	int i=0;
	int fore,back;
	int counter1 = 0;
	int counter2 = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorgui window = new calculatorgui();
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
	public calculatorgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize()  {
		try {
		frame = new JFrame();
		frame.setBounds(100, 100, 398, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setForeground(new Color(25, 25, 112));
		txtDisplay.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtDisplay.setBounds(12, 13, 356, 60);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setForeground(new Color(25, 25, 112));
		btn7.setBackground(new Color(100, 149, 237));
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn7.setBounds(22, 86, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(25, 25, 112));
		btn8.setBackground(new Color(100, 149, 237));
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn8.setBounds(113, 86, 50, 50);
		frame.getContentPane().add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(88, 86, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setForeground(new Color(25, 25, 112));
		btn9.setBackground(new Color(100, 149, 237));
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn9.setBounds(156, 86, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnp = new JButton("+");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				x [i]= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				op[i] = "+";
				} catch(Exception e5)
				{
					txtDisplay.setText("Error");
				}
			}
		});
		
		btnp.setForeground(new Color(25, 25, 112));
		btnp.setBackground(new Color(100, 149, 237));
		btnp.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnp.setBounds(313, 86, 54, 50);
		frame.getContentPane().add(btnp);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setForeground(new Color(25, 25, 112));
		btn4.setBackground(new Color(100, 149, 237));
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn4.setBounds(22, 149, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setForeground(new Color(25, 25, 112));
		btn5.setBackground(new Color(100, 149, 237));
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn5.setBounds(88, 149, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setForeground(new Color(25, 25, 112));
		btn6.setBackground(new Color(100, 149, 237));
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn6.setBounds(156, 149, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnm = new JButton("-");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				x[i]= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				op[i] = "-";
				}
			  catch(Exception e4)
			{
				txtDisplay.setText("Error");
			}
			}
		});
		
		btnm.setForeground(new Color(25, 25, 112));
		btnm.setBackground(new Color(100, 149, 237));
		btnm.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnm.setBounds(240, 86, 54, 50);
		frame.getContentPane().add(btnm);
		
		JButton btnt = new JButton("x");
		btnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				x[i]= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				op[i] = "*";
				}
				 catch(Exception e4)
				{
					txtDisplay.setText("Error");
				}
			}
		});
		
		btnt.setForeground(new Color(25, 25, 112));
		btnt.setBackground(new Color(100, 149, 237));
		btnt.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnt.setBounds(313, 150, 55, 49);
		frame.getContentPane().add(btnt);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setForeground(new Color(25, 25, 112));
		btn1.setBackground(new Color(100, 149, 237));
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn1.setBounds(22, 212, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setForeground(new Color(25, 25, 112));
		btn2.setBackground(new Color(100, 149, 237));
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn2.setBounds(88, 212, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3= new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setForeground(new Color(25, 25, 112));
		btn3.setBackground(new Color(100, 149, 237));
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn3.setBounds(156, 212, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setForeground(new Color(25, 25, 112));
		btn0.setBackground(new Color(100, 149, 237));
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btn0.setBounds(88, 281, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btndot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btndot.setForeground(new Color(25, 25, 112));
		btndot.setBackground(new Color(100, 149, 237));
		btndot.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btndot.setBounds(156, 281, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnd = new JButton("/");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				x[i]= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				op[i] = "/";
				} catch(Exception e4)
				{
					txtDisplay.setText("Error");
				}
			}
		});
		
		btnd.setForeground(new Color(25, 25, 112));
		btnd.setBackground(new Color(100, 149, 237));
		btnd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnd.setBounds(240, 149, 54, 50);
		frame.getContentPane().add(btnd);
		
		JButton btnpm = new JButton("+/-");
		btnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops *(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnpm.setForeground(new Color(25, 25, 112));
		btnpm.setBackground(new Color(100, 149, 237));
		btnpm.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnpm.setBounds(240, 212, 128, 48);
		frame.getContentPane().add(btnpm);
		
		
		JButton btnback = new JButton("<<");
		btnback.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
				int j=i-1;
				 
					if(op[j].equals("/") && y[j]==0) {
					 txtDisplay.setText(Double.toString(x[j])+" "+op[j]+" "+Double.toString(y[j])+" = "+error());
				}
					else {
				txtDisplay.setText(Double.toString(x[j])+" "+op[j]+" "+Double.toString(y[j])+" = "+Double.toString(res[j]));
				
					}
				i--;
				
				}catch(Exception e2) {
					txtDisplay.setText("First operation");
				}
				
			}
		});
		
		btnback.setForeground(new Color(25, 25, 112));
		btnback.setBackground(new Color(100, 149, 237));
		btnback.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnback.setBounds(68, 356, 106, 50);
		frame.getContentPane().add(btnback);
		
		JButton btnfor = new JButton(">>");
		btnfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
               try {
				int j=i;
				if(op[i]==null) {
					txtDisplay.setText("Last operation");
				}
				else 
					if(op[j].equals("/") && y[j]==0) {
					 txtDisplay.setText(Double.toString(x[j])+" "+op[j]+" "+Double.toString(y[j])+" = "+error());
				}
					else {
				txtDisplay.setText(Double.toString(x[j])+" "+op[j]+" "+Double.toString(y[j])+" = "+Double.toString(res[j]));
					}
				i++;
				
				}
               catch(Exception e3) {
					txtDisplay.setText("Last operation");
				}
			
			}
		});
		
		btnfor.setForeground(new Color(25, 25, 112));
		btnfor.setBackground(new Color(100, 149, 237));
		btnfor.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnfor.setBounds(220, 356, 106, 50);
		frame.getContentPane().add(btnfor);
		
		JButton btneq = new JButton("=");	
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					/* y[i]= Double.parseDouble(txtDisplay.getText());
				if(op[i].equals("+")) {
					res[i] = doIt.add(x[i], y[i]);
					txtDisplay.setText(String.valueOf(res[i]));
				}
					if(op[i].equals("-")) {
						res[i] = doIt.sub(x[i], y[i]);
						txtDisplay.setText(String.valueOf(res[i]));
					}
						if(op[i].equals("*")) {
							res[i] = doIt.mult(x[i], y[i]);
							txtDisplay.setText(String.valueOf(res[i]));
						}
							if(op[i].equals("/")) {
								if(y[i]==0) txtDisplay.setText(doIt.error());
								else{ 
									res[i] = doIt.div(x[i], y[i]);
								txtDisplay.setText(String.valueOf(res[i]));
								}
								}
								i++;
								if (i>4) {
									x[0]=x[1]; x[1]=x[2]; x[2]=x[3]; x[3]=x[4];
									y[0]=y[1]; y[1]=y[2]; y[2]=y[3]; y[3]=y[4];
									op[0]=op[1]; op[1]=op[2]; op[2]=op[3]; op[3]=op[4];
									res[0]=res[1]; res[1]=res[2]; res[2]=res[3]; res[3]=res[4];
									i--;
								}
							}*/
					if(op[i]==null) {
						x[i]= Double.parseDouble(txtDisplay.getText());
						
					}
					else{ y[i]= Double.parseDouble(txtDisplay.getText());
					
					if(op[i].equals("/") && y[i]==0) {
						 txtDisplay.setText(error());
					}
						else{ 
						txtDisplay.setText(String.valueOf(doIt.getresult(x[i],op[i],y[i])));
						res[i]=doIt.getresult(x[i],op[i],y[i]);
						}
						i++;
						if (i>4) {
							x[0]=x[1]; x[1]=x[2]; x[2]=x[3]; x[3]=x[4];
							y[0]=y[1]; y[1]=y[2]; y[2]=y[3]; y[3]=y[4];
							op[0]=op[1]; op[1]=op[2]; op[2]=op[3]; op[3]=op[4];
							res[0]=res[1]; res[1]=res[2]; res[2]=res[3]; res[3]=res[4];
							i--;}}}
			 catch (Exception e3) {
				txtDisplay.setText("Error");
				}}}
			
			
		);
		btneq.setForeground(new Color(25, 25, 112));
		btneq.setBackground(new Color(100, 149, 237));
		btneq.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btneq.setBounds(240, 281, 128, 50);
		frame.getContentPane().add(btneq);
		
		JButton btnc = new JButton("c");	
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnc.setForeground(new Color(25, 25, 112));
		btnc.setBackground(new Color(100, 149, 237));
		btnc.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnc.setBounds(22, 281, 50, 50);
		frame.getContentPane().add(btnc);
		
		
	
	}  catch(Exception e2)
	{
		txtDisplay.setText("Error");
	}
	
}}
