package employeetaskproject.employeetasksystem;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("Springbeans.xml");
    	
    	Employee employee=context.getBean("employee",Employee.class);
    	
        System.out.println("==========================Employeee=============================");
    	System.out.println("Employee_id:"+employee.getEmployeeid());
    	System.out.println("Employee_name:"+employee.getEmployee_name());
    	System.out.println("Employee_department:"+employee.getDepartment());
    	System.out.println("Employee_designation:"+employee.getDesignation());
    	System.out.println("Employee_Password:"+employee.getPassword());
    	System.out.println("Superior:"+employee.getSuperior().getEmployeeid());
        System.out.println("Rating:"+employee.getEmployee_rating());

    	
    	
    System.out.println("==========================Task Detail=============================");
    	List<Task> tasklist=employee.getTasklist();
    	
    	for(Task t:tasklist){
    		System.out.println("-----------------------Task-----------------------");
    		System.out.println("Task_Id:"+t.getTask_id());

    		System.out.println("Taskname:"+t.getTaskname());
    		System.out.println("Task_Description:"+t.getTask_description());
    		System.out.println("Date_Of_Allocation:"+t.getDate_of_allocation());
    		System.out.println("Deadline:"+t.getDeadline());
    		System.out.println("Allocated to:"+t.getAllocated_to().getEmployee_name());

    	
    		
        }
        System.out.println("==========================Attendance=============================");

    	List<Attendance> attendance_list=employee.getAttendance_list();
    	for(Attendance a:attendance_list){
    		System.out.println("---------------------Attendance-------------------------");

    		System.out.println("Attendance_id:"+a.getAttendance_id());
    		System.out.println("Attendance_date:"+a.getAttendance_date());
    		System.out.println("Status:"+a.getStatus());

    	}




    	
    }
}
