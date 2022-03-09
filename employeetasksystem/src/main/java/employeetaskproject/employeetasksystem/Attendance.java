package employeetaskproject.employeetasksystem;

import java.util.Date;

public class Attendance {
	private String attendance_id;
	private Date attendance_date;
	private Attendance_Types status;
	
	
	public Attendance(String attendance_id, Date attendance_date, Attendance_Types status) {
		super();
		this.attendance_id = attendance_id;
		this.attendance_date = attendance_date;
		this.status = status;
	}
	public String getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(String attendance_id) {
		this.attendance_id = attendance_id;
	}
	public Date getAttendance_date() {
		return attendance_date;
	}
	public void setAttendance_date(Date attendance_date) {
		this.attendance_date = attendance_date;
	}
	public Attendance_Types getStatus() {
		return status;
	}
	public void setStatus(Attendance_Types status) {
		this.status = status;
	}
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
    

}
