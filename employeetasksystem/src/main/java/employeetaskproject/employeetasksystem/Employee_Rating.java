package employeetaskproject.employeetasksystem;

public class Employee_Rating {
	
	private Task task;
	private Rating rating;
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public Employee_Rating(Task task) {
		super();
		this.task = task;
	}
	public Employee_Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
