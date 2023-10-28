

public class Prime {
	public static void main(String[] args) {
		int temp,num=66;
		boolean isPrime= true;
		for(int i=2;i<num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("it is prime:"+ num);
		}
		else
		{
			System.out.println("it is not prime:"+ num);
		}
}
}