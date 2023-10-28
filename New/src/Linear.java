
public class Linear {
	public static int method(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,50,30,40,20};
		int key=50;
		System.out.println("given key element linear searching in the elements :"+ key +" , index element = "+method(arr1,key));
	}

}
