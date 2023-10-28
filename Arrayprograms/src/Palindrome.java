import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		sc.close();
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
			System.out.println("it is plaindrome");
		else
			System.out.println("it is not plainfrome");
	}
}
