
public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1, 2, 4, 6, 7, 3, 4, 5};
		int total=arr.length;
		int max;
		int min;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]<arr[j]) {
				int	temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		min=arr[total-2];
		int i=0;
		if(arr[i]>min) {
			System.out.println(min);
		}
	
	}
}
