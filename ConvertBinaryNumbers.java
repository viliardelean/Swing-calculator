
// CONVERTS A BINARY NUMBER TO A CEIMAL ONE
// THERE IS A SECOND WAY TO DO THIS
import javax.swing.plaf.synth.SynthSpinnerUI;

public class ConvertBinaryNumbers {
	
	//bad code. not really finished. if number begins by zero it fucks up. DOESN'T HANDLE EXCEPTIONS WELL

	public static void main(String[] args) {
		
		int binaryNum= 10011;
		int baseTen=0;
		int i=1;
		
		while(binaryNum !=0) {
			if (binaryNum % 10 ==1) {
				baseTen+=i;
				i=i*2;
				binaryNum= (binaryNum-1)/10;
				
			} else if (binaryNum % 10 == 0) {
				i=i*2;
				binaryNum = binaryNum/10;
				
			} else {
				System.out.println("Your number is not a binary number");
				
			}
			
		}
		System.out.println(baseTen);
	}

}