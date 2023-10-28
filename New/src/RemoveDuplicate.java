
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,20,30,30,40,50,50};  
		int length=arr.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]!=arr[j]) {
		for(int k=j;k<length-1;k++) {
			arr[k]=arr[k+1];
		
		}
		length--;
		j--;
			}
			}	}
	
	for(int i=0;i<length;i++) {
		System.out.print(arr[i]);
	}
	
	
	
	
	
	}

}
