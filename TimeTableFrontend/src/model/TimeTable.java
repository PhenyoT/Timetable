package model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "timetable")
@SessionScoped
public class TimeTable {
	private String studentNos;
	private String studentNames;
	private String subjectNames;
	private Date examDates;
	
	public String getStudentNos() {
		return studentNos;
	}
	public void setStudentNos(String studentNos) {
		this.studentNos = studentNos;
	}
	public String getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(String studentNames) {
		this.studentNames = studentNames;
	}
	public String getSubjectNames() {
		return subjectNames;
	}
	public void setSubjectNames(String subjectNames) {
		this.subjectNames = subjectNames;
	}
	public Date getExamDates() {
		return examDates;
		
	}
	public void setExamDates(Date examDates) {
		this.examDates = examDates;
	}
	

	public TimeTableEntity getEntity() {
		TimeTableEntity timetableentity = new TimeTableEntity();
		timetableentity.setExamDate(examDates);
		timetableentity.setStudentName(studentNames);
		timetableentity.setStudentNo(studentNos);
		timetableentity.setSubjectName(subjectNames);
		return timetableentity;	
		
	}
}
