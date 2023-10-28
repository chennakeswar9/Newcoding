
public class Insertionsort {
		static void method(int[] arr) {
			for(int j=1;j<arr.length;j++) {
				int key = arr[j];
				int i=j-1;
				while((i>-1)&&(arr[i]>key)) {
					arr[i+1]=arr[i];
					i--;
				}
				arr[i+1]=key;
			}
		}	
	
	public static void main(String[] args) {
		int[] arr1= {1,6,4,8,9};
		method(arr1);
		for(int i:arr1) {
			System.out.println(i);
		}
	}
}
