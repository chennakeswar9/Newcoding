package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String status)
	{
		//logging
		//authentication & authorization
		//sanitize the data
		System.out.println("Checking the shopping cart nethod is called");
	}
	
	public int quality()
	{
		return 2;
	}
	
	
}
