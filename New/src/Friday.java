
public class Friday {
	public static void left(int[] arr, int n) {
		
		int first;
		for(int i=0;i<n;i++) {
			int j;
			first=arr[0];
		for(j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[j]=first;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("left"+ arr[i]+" ");
		}
	}
	
	public static void right(int[] arr1, int r) {
		for(int i=0;i<r;i++) {
			int j;
			int last=arr1[arr1.length-1];
			for(j=arr1.length-1;j>0;j--) {
				arr1[j]=arr1[j-1];
			}
			arr1[0]=last;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("right"+arr1[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {10,20,30,40,50};
		int[] arr1=new int[] {10,20,30,40,50};
		int n=3;
		int r=3;
		left(arr, n);
		System.out.print("===============");
		right(arr1, r);
		
	}
}
