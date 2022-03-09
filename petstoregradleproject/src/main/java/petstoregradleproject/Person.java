package petstoregradleproject;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private String personName;
	private int age;
	public Person(){
		
	}

	public void setPersonName(String personName){
		this.personName=personName;
	}
	public String getPersonName(){
		return this.personName;
	}
    @Required
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
