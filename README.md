# Swing-calculator
@ versions of a basic calculator
The firs version was created with the help of a tutorial. It has many bugs
The second version (Better Calcultor) was improved by me!

Please note: If you want to add new features (operations) you have to follow this pattern: 
    calcResult();         SHOWS THE RESULT OF THE PREVIOUS OPERATION (IF THERE WAS ONE)
				try {             TRYS TO PARSE WHAT IS SHOWN ON THE TEXT FIELD INTO A DOUBLE
					result = Double.parseDouble(textField.getText());
					} catch (NumberFormatException e1) {
						System.out.println("");
					}
				operation = "-";        NAME OF THE OPERATION (BUTTON)
				lastButton = true;      AN OPERATION BUTTON WAS CLICKED SO IF THE NEXT BUTTON IS A NUMBER, THE TEXT FIELD WILL BE FIRST CLEARED
