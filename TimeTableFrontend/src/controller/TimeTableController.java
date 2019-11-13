package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.TimeTable;
import model.TimeTableEntity;
import service.TimeTableEJB;

@ManagedBean(name = "timetablecontroller")
@SessionScoped
public class TimeTableController {
	
	@EJB
	TimeTableEJB timetableejb;
	
	@ManagedProperty(value = "#{timetable}") 
	private TimeTable timetable;
	
	private List<TimeTableEntity> timetablelist = new ArrayList<>();

	public TimeTable getTimetable() {
		return timetable;
	}

	public void setTimetable(TimeTable timetable) {
		this.timetable = timetable;
	}

	public List<TimeTableEntity> getTimetablelist() {
		
		System.out.println("Fetching Info from EJB");
		timetablelist = timetableejb.getStudentInfo();
		return timetablelist;
	}

	public void setTimetablelist(List<TimeTableEntity> timetablelist) {
		this.timetablelist = timetablelist;
	}
	
	public String addNewStudents() {
		System.out.println("Sending Info to EJB");
		timetableejb.addNewStudent(timetable.getEntity());
		return null;		
	}
	
	public String DisplayInfo() {
		return "display.xhtml";
		
	}
	
}
