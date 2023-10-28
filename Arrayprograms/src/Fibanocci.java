
public class Fibanocci {
	public static void main(String[] args) {
		int number1=0;
		int number2=0;
		int number3=1;
		for(int i=0;i<=10;i++) {
			number1=number2;
			number2=number3;
			number3=number1+number2;
			System.out.println(number1);
			
	}}
}
