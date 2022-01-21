import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][]{{1,2,3,4},{2}};
		

		int arr1[][] = arr.clone();

  
    System.out.println("Are Equal?  "+Arrays.equals(arr, arr1));
    System.out.println("Are Equal?  "+(arr==arr1));
    System.out.printf("%.4f", 10.0);
  
	}

}
