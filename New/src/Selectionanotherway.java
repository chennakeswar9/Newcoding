import java.util.Scanner;

public class Selectionanotherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		int arr[]=new int[50];
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
