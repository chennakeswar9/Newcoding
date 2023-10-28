
public class Selectionsort {
	static void method(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50,90,80};
		method(arr1);
		for(int i:arr1) {
			System.out.println(i);
		}

}
}