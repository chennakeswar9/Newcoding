
public class Reversestring {

	public static void main(String []args) {
		String str="chennakeswar";
		int size=str.length();
		for(int i=0;i<size;i++)
		{
			System.out.print(str.charAt(str.length()-i-1));
		}
}
}
