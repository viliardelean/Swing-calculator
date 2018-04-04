package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

//improved calculator made with swing library. 

public class BetterCalculator {

	private JFrame frame;
	private JTextField textField;
	
	boolean clickOperator=false; // keeps track of the last button pushed. if it's TRUE means it was an opeartional, so it clears the text field. (for exemple after =)
	double newNumber = 0;
	double result = 0;
	String operation = "+" ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BetterCalculator window = new BetterCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BetterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 305, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 270, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(15);
		
		//---------Row 1  Bottons-----------
		
// Backspace Button
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if (textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backSpace= strB.toString();
				textField.setText(backSpace);
				
				clickOperator = false;					
				}
			}
		});
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBounds(10, 58, 60, 60);
		frame.getContentPane().add(btnBack);
		
		
// Clear Button
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				operation = "+" ;  // reinitialise operation and result
				result=0;
				clickOperator = false;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(80, 58, 60, 60);
		frame.getContentPane().add(btnClear);
		
		
//Percentage button		
		JButton btnPourcent = new JButton("%");
		btnPourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempVariable = 0;   
				
				try {
					tempVariable = Double.parseDouble(textField.getText());
					} catch (NumberFormatException e1) {
						System.out.println("");
					}
				tempVariable = result*tempVariable/100;
				textField.setText(String.valueOf(tempVariable));
			}
		});
		btnPourcent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPourcent.setBounds(150, 58, 60, 60);
		frame.getContentPane().add(btnPourcent);
		

//Plus Button		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcResult();
				try {
				result = Double.parseDouble(textField.getText());
				} catch (NumberFormatException e1) {
					System.out.println("");
				}
				operation = "+";
				clickOperator = true;
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(220, 58, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		
		//--------------ROW 2 BUTTONS--------------
		
// Button 7	
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {   //after an operation, clear the textField before you type a number
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 129, 60, 60);
		frame.getContentPane().add(btn7);

//Button 8		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {   //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(80, 129, 60, 60);
		frame.getContentPane().add(btn8);

// Button 9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {   //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(150, 129, 60, 60);
		frame.getContentPane().add(btn9);

// Button -
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcResult();
				try {
					result = Double.parseDouble(textField.getText());
					} catch (NumberFormatException e1) {
						System.out.println("");
					}
				operation = "-";
				clickOperator = true;

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(220, 129, 60, 60);
		frame.getContentPane().add(btnSub);
		
		// -------------ROW 3 buttons-----------
//Button 4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (clickOperator) {   //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 200, 60, 60);
		frame.getContentPane().add(btn4);
		
// Button 5	
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {   //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(80, 200, 60, 60);
		frame.getContentPane().add(btn5);
		
// Button 6		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {  //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(150, 200, 60, 60);
		frame.getContentPane().add(btn6);

//Button Multiply *
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcResult();
				try {
					result = Double.parseDouble(textField.getText());
					} catch (NumberFormatException e1) {
						System.out.println("");
					}
				operation = "*";
				clickOperator = true;

			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(220, 200, 60, 60);
		frame.getContentPane().add(btnMult);

		// -------------ROW 4 BUTTONS
// Button 1		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {  //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 274, 60, 60);
		frame.getContentPane().add(btn1);

// Button 2		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) {  //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(80, 274, 60, 60);
		frame.getContentPane().add(btn2);

// Button 3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (clickOperator) { //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(150, 274, 60, 60);
		frame.getContentPane().add(btn3);
		
//Button Divide /
		JButton btnDivis = new JButton("/");
		btnDivis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcResult();  // acts like an "=" sign
				try {
					result = Double.parseDouble(textField.getText());
					} catch (NumberFormatException e1) {
						System.out.println("");
					}
				operation = "/";
				clickOperator = true;

			}
		});
		btnDivis.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivis.setBounds(220, 274, 60, 60);
		frame.getContentPane().add(btnDivis);
		
		//------------ROW 5 BUTTONS-----------
// Button 0		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (clickOperator) {   //after an operation, clear the textField so you don't add numbers to a result for exemple
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
				clickOperator =false;
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 345, 60, 60);
		frame.getContentPane().add(btn0);
		

// Button point	. 
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//verrifie if a dot already exists in the string
				String oldString = textField.getText();
				if (clickOperator || textField.getText().equals(null) || textField.getText().equals("")) {
					textField.setText(oldString);
				} 
				else if (oldString.contains(".")) {
					textField.setText(oldString);
				} else {   // if not, type a dot
				
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
				clickOperator =false;  // lets you put numbers after the dot. 
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(80, 345, 60, 60);
		frame.getContentPane().add(btnDot);
		
//Button plus or minus (changes the sign)
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { 
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
				
				} catch (NumberFormatException el) {
					textField.setText("");
				}
				clickOperator = true;
				
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(150, 345, 60, 60);
		frame.getContentPane().add(btnPM);

//Button Equals
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcResult();
			
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(220, 345, 60, 60);
		frame.getContentPane().add(btnEqual);	
	}
	
// Method for calculation of the result
	public void calcResult() {
		
		try {
			newNumber = Double.parseDouble(textField.getText());
			} catch (NumberFormatException ei) {
				textField.setText("");
			}
		
		if (clickOperator) {
			textField.setText(String.valueOf(newNumber));
		}
		
	
		else switch (operation) {
			
			case "+":  result = result + newNumber;
			textField.setText(String.valueOf(result));	
			break;
	
			
			case "-" :  result = result - newNumber;
			textField.setText(String.valueOf(result));	
			break;
	
			
			case "*" :  result = result * newNumber;
			textField.setText(String.valueOf(result));	
			break;
			
			
			case "/" :  if ( newNumber == 0) {
				textField.setText("E");  //Error for division by 0
				// reinitialize operation and result. 
				operation = "+";
				result=0;
						
				}else {
					result = result / newNumber;
					textField.setText(String.valueOf(result));	}
			break;
		} 
			
			result=0;				//reinitialize result
			clickOperator = true;    //this button is an operation,
	}
}
