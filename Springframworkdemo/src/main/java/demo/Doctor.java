package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Scope(scopeName = "prototype")
@Component
public class Doctor implements Staff, BeanNameAware{

	
	
private String qualification;
	
	@Override
public String toString() {
	return "Doctor [qualification=" + qualification + "]";
}

	public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

	public void assist()
	{
		System.out.println("Doctor is assist");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Setbean name method is called");
		
	}
	@PostConstruct
	public void postconstruct()
	{
		System.out.println("postconstruct method is called");
		
	}


}
