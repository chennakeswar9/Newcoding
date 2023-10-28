package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	@Before("execution(* demo.ShoppingCart.checkout(..))")
	public void beforelogger1(JoinPoint jp)
	{
		System.out.println(jp.getSignature());
		String arg =jp.getArgs()[0].toString();
		System.out.println("before loggers with argument:"+ arg);
	}
	
	@After("execution(* *.*.checkout(..))")
	public void afterlogger()
	{
		System.out.println("after loggers");
	}
	
	@Pointcut("execution(* demo.ShoppingCart.quanlity(..))")
	public void afterreturningpointcut()
	{
	
	}
	
	@AfterReturning(pointcut = "afterreturingpointcut()",returning = "retval")
	public void afterreturning(String retval)
	{
		System.out.println("After returing:"+ retval);
	}
	
}
