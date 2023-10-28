
public class Armstrong {
	public static void main(String[] args) {
		int count=0, number,temp;
		int armstrong=153;
		temp=armstrong;
		while(armstrong>0)
		{
			number=armstrong%10;
			armstrong=armstrong/10;
			count=count+(number*number*number);
		}
		if(temp==count) 
			System.out.println("armstrong");
			else
				System.out.println("not armstrong");
		}
	}

