
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meadh
 */
public class course {
    private String courseName;
    private List<student> students = new ArrayList<student>();
    private List<module> modules = new ArrayList<module>();
    private LocalDate startDate;
    private LocalDate endDate;
    
    public course(String name, LocalDate startDate, LocalDate endDate)
    {
    	this.courseName = name;
    	this.startDate = startDate;
    	this.endDate = endDate;
    }
    
    public LocalDate getStartDate() {
		return startDate;
	}
    
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setAcademicEndDate(LocalDate academicEndDate) {
		this.endDate = endDate;
	}
	
	public List<student> getStudents() {
		return students;
	}
	
	public void setStudents(List<student> students) {
		this.students = students;
	}
	
	public List<module> getModules() {
		return modules;
	}
	
	public void setModules(List<module> modules) {
		this.modules = modules;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
	