import java.util.Arrays;

public class Binaryarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int key=30;
		int result=Arrays.binarySearch(arr, key);
		if(result<0) 
			System.out.println("not found");
		else
			System.out.println(result);
	}
}
