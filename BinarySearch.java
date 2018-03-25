
public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {5, 12, 15, 32, 45, 54, 78};
		
		// call the function for the searche
	//	linearSearch(numbers, 45);
		System.out.println(binarySearch(numbers, 80));
		
		
	}

	// linear search
	public static void linearSearch(int[] dataSet, int target) {
		int pos = -1;
		
		// iterate through the data set
		for ( int j = 0; j<dataSet.length; j++){
			if (dataSet[j] == target) {
				pos = j+1;
				System.out.println("The element " + target + " was found at position " +pos );
			}
		}
		if ( pos == -1) {
		System.out.println("Element not found in the set");
	}
	}
	
	
	// binary search algorithm  THE ARRAY MUST BE SORTED
	public static int binarySearch(int[] dataSet, int target) {
		int a=0;
		int z=dataSet.length-1;  // index position of the last element in the array
		
		
		while (a<=z) {
			int q = (a+z)/2;
			if (target<dataSet[q]) z=q-1;
			else if (target>dataSet[q]) a=q+1;
			else return q;
		}
		return -1;
	}
}
