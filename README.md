# Swing-calculator
-------------------------------------------------------------------

Two versions (classes) of a basic calculator with SWING library

	1. First one was done with the help of a tutorial
	2. The second version (Better Calcultor) was improved by me


-------------------------------------------------------------------

PLEASE NOTE: If you want to add new features (operations) you have to follow the following pattern: 
	
	calcResult();      	SHOWS THE RESULT OF THE PREVIOUS OPERATION ON THE TEXT FIELD (IF THERE WAS ONE)
	
	try {            
		result = Double.parseDouble(textField.getText());  }
		catch (NumberFormatException e1) { System.out.println("");  
		}					
					
	operation = "-";        NAME OF THE OPERATION (BUTTON)
	lastButton = true;      THIS IS A FLAG. IF THE NEXT BUTTON PUSSHED WILL BE A NUMBER, THE TEXT FIELD WILL BE FIRST CLEARED
	
-------------------------------------------------------------------

If you find any errors, please let me know!
