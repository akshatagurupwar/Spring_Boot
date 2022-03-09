package petstoregradleproject;
import org.springframework.beans.factory.annotation.Autowired;


public class Payment {
	private int amount;
	private Person person;
	public Payment(){
		
	}
	@Autowired
	public Payment(Person person){
		this.person=person;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
