
public class Tests {

	public static void main(String[] args) {
	//	reduceByOne(10);
		int[] numbers = {2,5,17,33,61};
		
		System.out.println(FindRecurs(0,numbers,61));
	
	}
	
	public static void reduceByOne(int n) {
		if (n>=0) reduceByOne(n-1);
		System.out.println(("completed call: "+n));
	}	
	
	
	// recursive linear search algorithm
	public static int FindRecurs(int pos, int[] DataSet, int target) {
		if (pos>DataSet.length) return -1;
		else if (DataSet[pos]== target) return pos;
		return FindRecurs(pos+1, DataSet, target);
	}
	


}
