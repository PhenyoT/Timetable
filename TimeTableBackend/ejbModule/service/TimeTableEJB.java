package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TimeTableEntity;

@Stateless
@LocalBean
public class TimeTableEJB {

   @PersistenceContext
    private EntityManager em;
    
    public TimeTableEJB() {
  	
    	
    }
    
    public void addNewStudent(TimeTableEntity timetableentity) {
    	
    	System.out.println("Saving Data to DB");
    	em.persist(timetableentity);    	
    }
    
    public List<TimeTableEntity> getStudentInfo()
    {
    	System.out.println("Retrieve Student Information from DB");
		return new ArrayList <TimeTableEntity> (em.createQuery("select s from student_tbl AS s", TimeTableEntity.class).getResultList());    	
    	
    }

}
