package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenicationAspect {
	
	@Pointcut("within(demo..*)")
	public void authenicationpointcut()
	{
		
	}
	
	@Pointcut("within(demo..*)")
	public void authorizationpointcut()
	{
		
	}
	@Before("authenicationpointcut() && authorizationpointcut()")
	public void authenticate()
	{
		System.out.println("Authenticating the request");
	}
	

}
