
public class Fibniocci {

	public static void main(String []args) {
		int n=0;
		int n1=1;
		int n2;
		int l=10;
		for(int i=2;i<=l;i++)
		{
			n2=n+n1;
			System.out.println(n2);
			n=n1;
			n1=n2;
		}
	}
}
