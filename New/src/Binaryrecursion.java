
public class Binaryrecursion {
	public static int method(int[] arr, int first, int last ,int key) {
		if(last>first) {
			int mid= first+(last-first)/2;
			if(arr[mid]==key) {
			return	mid;
			}
			if(arr[mid]>key) {
				return method(arr,first,mid-1,key);
			}
			else
			{
				return method(arr,mid+1,last,key);
			}
		}	
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int key=30;
		int last=arr.length-1;
		int result=method(arr,0,last,key);
		if(result==-1) 
			System.out.println("notfound");
			else
				System.out.println(result);
		
			
	}

}
