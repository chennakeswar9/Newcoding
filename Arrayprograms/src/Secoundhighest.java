
public class Secoundhighest {
public static void main(String[] args) {
	int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
	int largestnumber=0;
	int secondlargest=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largestnumber) {
			secondlargest	= largestnumber;
			largestnumber	= arr[i];
		}	
		else if(arr[i]>secondlargest) {
			secondlargest=arr[i];
		}
	}
	System.out.println("secondlargestis:"+secondlargest);
	System.out.println("largest is:"+largestnumber);
}
}
