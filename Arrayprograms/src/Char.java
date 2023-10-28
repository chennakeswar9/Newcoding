import java.util.Scanner;

public class Char {
	
	public static void main(String[] args) {
	String str="chennakeswar";
	char chars[]=str.toCharArray();
	for(int i=chars.length-1;i>=0;i--) {
		System.out.println(chars[i]);
	}
	
	StringBuffer br= new StringBuffer();
	br.append(str);
	br=br.reverse();
	System.out.println(br);
	
	Scanner sc= new Scanner(System.in);
	str=sc.nextLine();
	String[] ch=str.split("");
	for(int i=ch.length-1;i>=0;i--) {
	System.out.println(ch[i]);	
	}
	String reverse="";
	int length=str.length();
	for(int i=length-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}
}
}