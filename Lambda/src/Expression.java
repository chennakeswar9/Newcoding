
public class Expression {

	
	

	public static void main(String args[])
	{

		Lambda obj=new Lambda() {
			
	

			@Override
			public String draw(String msg, String chenna) {
				// TODO Auto-generated method stub
				return msg + chenna;
				
			}
		};
		
		System.out.println( obj.draw("hi", "ji"));
}
}