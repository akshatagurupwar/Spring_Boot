package ratingproject.ratingapp;

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
        
        User user=context.getBean("user",User.class);
        System.out.println(user.getUsername());
        System.out.println(user.getEmailid());
        System.out.println(user.getMobileno());
        System.out.println(user.getPassword());
        System.out.println("============================================================");
        Financialproduct financialproduct=context.getBean("financialproduct",Financialproduct.class);
        System.out.println(financialproduct.getFinancialproductid());
        System.out.println(financialproduct.getFinancialproduct_name());
        System.out.println(financialproduct.getDescription());
        System.out.println(financialproduct.getRating());
        System.out.println(financialproduct.getReview().getReviewid());
        System.out.println(financialproduct.getReview().getReview_text());
        System.out.println("Comments:");
        List<Comment> comments=financialproduct.getReview().getComments();
        for(Comment c:comments){
        	System.out.println("Comment_id:"+c.getComment_id());
        	System.out.println("Comments_text:"+c.getComment_text());
        	System.out.println("Comment_Like:"+c.getLikes());
        	System.out.println("Comment_dislike:"+c.getDislikes());


        }





    }
}
