
public class anonymousArray {
public static int findMin(int arr[])
{
	int min = arr[0];
	for (int i = 1; i < arr.length; i++) {
         if(arr[i]<min)
        	 min = arr[i];
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minimum value is: "+findMin(new int[] {1,2,3,4,5}));

	}

}
