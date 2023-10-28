package demo;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context= new AnnotationConfigApplicationContext(Beanconfig.class);
	//	Nurse doctor=(Nurse) context.getBean("nurse");
	//	Nurse doctor= context.getBean(Nurse.class);
		//Staff staff= context.getBean(Nurse.class);
	 Doctor doctor= context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("mbbs");
//	System.out.println(doctor);
//	Doctor doctor1= context.getBean(Doctor.class);
//
//		System.out.println(doctor1);
	}

}
