import java.util.Scanner;

public class Linearanotherjavaway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n, i, search, arr[];
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	
	arr= new int[n];
	search=sc.nextInt();
	
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]==search)
		{
			System.out.println(search+"linear searching"+i+1);
			break;
		}
	}
	
	}}


