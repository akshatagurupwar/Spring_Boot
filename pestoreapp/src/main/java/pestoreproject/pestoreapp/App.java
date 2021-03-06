package pestoreproject.pestoreapp;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	{
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"springbeans.xml","newSchema.xml"});
        PetStore store=(PetStore)context.getBean("petStore",PetStore.class);
        
        System.out.println(store.getStoreName());
        System.out.println(store.getAddress());
        
        
        Customer customer=(Customer)context.getBean("ncustomer",Customer.class);
        
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getEmail());
        
        PetService petService=context.getBean("petService",PetService.class);
        
        System.out.println(petService.getPetstore().getStoreName());
        System.out.println(petService.getPetstore().getAddress());
        
        PetFood petFood=context.getBean("petFood",PetFood.class);
        
        System.out.println(petFood.getFoodType());
        System.out.println(petFood.getCalories());
        System.out.println(petFood.getQuantity());
        
        CustomerService customerService=context.getBean("customerService",CustomerService.class);

        
        System.out.println(customerService.getServiceHelplineNumber());
        System.out.println(customerService.getCouncellorName());
        
        
        List<RescueChamp> rescueChampList=petService.getChamplist();
        
        for(RescueChamp champ:rescueChampList)
        {
        	System.out.println(champ.getChampName());
        	System.out.println(champ.getAnimalsRescued());
        }
        
        
        
    }

}