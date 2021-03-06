package onlineshoppingproject.onlineshoppingapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
        

    	
    	
    	System.out.println("====================================Order Details=============================================");

        
        Order order=context.getBean("order",Order.class);
        

        List<Cart> cartList=order.getCartList();

        for(Cart ca:cartList){
            System.out.println("------------------------------User Detail----------------------------------------");

            System.out.println("Username:"+ca.getUser().getUsername());
            
            System.out.println("Email:"+ca.getUser().getEmail());
            System.out.println("Password:"+ca.getUser().getPassword());
            System.out.println("Shipping_Address"+ca.getUser().getShipping_address());
            System.out.println("Billing_Address:"+ca.getUser().getBilling_address());
        	System.out.println("=================================Product Detail================================================");

        	for(Product p:ca.getProductList()){
                System.out.println("------------------------------Product----------------------------------------");

        		System.out.println("Product_Name:"+p.getProduct_name());
        		System.out.println("Price:"+p.getPrice());
        		System.out.println("Quality_in_Stock:"+p.getQuality_in());
        		System.out.println("Image_Location:"+p.getImagelocation());
        		
        	}
            System.out.println("-------------------------------------------------------------------------");

        	System.out.println("Total Amount:"+ca.getTotal_amount());
            System.out.println("Status:"+ca.isStatus());
        	System.out.println("Confirm_Order:"+ca.isConfirmorder());
            System.out.println("=====================================================================================");

        }
        
	    
    	
    }
}
