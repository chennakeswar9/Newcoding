package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context= new AnnotationConfigApplicationContext(Beanconfig.class);
		ShoppingCart cart= context.getBean(ShoppingCart.class);
		cart.checkout("Success");
	}

}
