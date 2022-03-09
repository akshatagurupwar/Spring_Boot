package employeetaskproject.employeetasksystem;
import java.util.*;
public class Task {
	private int task_id;
	private String taskname;
	private String task_description;
	private Date date_of_allocation;
	private Date deadline;
	private Employee allocated_to;
	
	
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTask_description() {
		return task_description;
	}
	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}
	public Date getDate_of_allocation() {
		return date_of_allocation;
	}
	public void setDate_of_allocation(Date date_of_allocation) {
		this.date_of_allocation = date_of_allocation;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Employee getAllocated_to() {
		return allocated_to;
	}
	public void setAllocated_to(Employee allocated_to) {
		this.allocated_to = allocated_to;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int task_id, String taskname, String task_description, Date date_of_allocation, Date deadline,
			Employee allocated_to) {
		super();
		this.task_id = task_id;
		this.taskname = taskname;
		this.task_description = task_description;
		this.date_of_allocation = date_of_allocation;
		this.deadline = deadline;
		this.allocated_to = allocated_to;
	}
	
	
	
	
	
	
	
	
	
	
	

}
