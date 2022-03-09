package petstoregradleproject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {

	@Bean("person")
	public Person getPerson(){
		Person obj=new Person();
		obj.setPersonName("Herry Poter");
		obj.setAge(23);
		return obj;
	}
}
