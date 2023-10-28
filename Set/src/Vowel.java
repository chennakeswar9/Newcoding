
public class Vowel {
public static void main(String []args) {
	String Str="chennakeswar";
	Str= Str.toLowerCase();
	for(int i=0;i<Str.length();i++) {
		char ch=Str.charAt(i);
		if(ch=='a'||ch=='e'){
			System.out.println(Str.charAt(i));
		}
	}
}
}
