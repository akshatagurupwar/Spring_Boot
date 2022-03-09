package pestoreproject.pestoreapp;

public class CustomerService {
	
	private String serviceHelplineNumber;
	private String councellorName;
	public String getServiceHelplineNumber() {
		return serviceHelplineNumber;
	}
	public String getCouncellorName() {
		return councellorName;
	}
	
     private static CustomerService customerService= new CustomerService();
	
	private CustomerService() {
		this.serviceHelplineNumber = "+916765542";
		this.councellorName = "Aanand";
	}

	public static CustomerService createCustomerServiceInstance(){
		return customerService;
	}
	

}
