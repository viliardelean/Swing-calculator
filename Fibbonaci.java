
public class Fibbonaci {

	public static void main(String[] args) {
		//a fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		System.out.println(fib(3));

	}

	public static int fib(int n){
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return (fib(n-1)*n);
	}
}
