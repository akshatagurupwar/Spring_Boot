package employeetaskproject.employeetasksystem;

import java.util.List;

public class Employee {
	
	private int employeeid;
	private String employee_name;
	private String department;
	private String designation;
	private Employee superior;  
	private String password;
	
	private List<Task> tasklist;
	
	private List<Attendance> attendance_list;
	private Rating employee_rating;
	
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Task> getTasklist() {
		return tasklist;
	}
	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	}
	public List<Attendance> getAttendance_list() {
		return attendance_list;
	}
	public void setAttendance_list(List<Attendance> attendance_list) {
		this.attendance_list = attendance_list;
	}
	public Rating getEmployee_rating() {
		return employee_rating;
	}
	public void setEmployee_rating(Rating employee_rating) {
		this.employee_rating = employee_rating;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;
	}
	public Employee(int employeeid, String employee_name, String department, String designation, Employee superior,
			String password, List<Task> tasklist, List<Attendance> attendance_list, Rating employee_rating) {
		super();
		this.employeeid = employeeid;
		this.employee_name = employee_name;
		this.department = department;
		this.designation = designation;
		this.superior = superior;
		this.password = password;
		this.tasklist = tasklist;
		this.attendance_list = attendance_list;
		this.employee_rating = employee_rating;
	}
	
	
	

}
