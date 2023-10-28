
public class Duplicate {
	public static void main(String[] args) {
		String str= new String("chennakeswar");
		int count=0;
		char[] chars=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.print(" "+ chars[j]);
					
					count++;
				}
			}
		}
	}
}
