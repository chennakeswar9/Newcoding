
public class palindrome {
public static void main(String []args) {
	String str="radar";
	StringBuffer sb= new StringBuffer(str);
	sb.reverse();
	String data=sb.toString();
	if(str.equals(data)) {
		System.out.println("palindrome");}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

