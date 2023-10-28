
public class Bubblesort {

	static void method(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,8,6,1,5};
		method(arr);
		
	}

}
