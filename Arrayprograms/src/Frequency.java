//Program to find the frequency of each element in the array
public class Frequency {
public static void main(String []args) {
	int a[] =new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};  
	int b[] =new int[a.length];
	int visted=-1;
	for(int i=0;i<a.length;i++) {
		int count =1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j])
			{
				count++;
				b[j]=visted;
			}
		}
		if(b[i]!=visted) {
			b[i]=count;
		}
		
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
	}
}
}
