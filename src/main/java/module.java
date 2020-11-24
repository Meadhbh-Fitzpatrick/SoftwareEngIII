
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author meadh
 */
public class module {
	private String moduleName;
	private List<student> students = new ArrayList<student>();
	private List<course> course = new ArrayList<course>();

    public module(String name)
    {
    	this.moduleName = name;
    }
    
    public String getModuleName()
    {
    	return moduleName;
    }
    
    public void setModuleName(String moduleName)
    {
    	this.moduleName = moduleName;
    }
    
    public List<student> getStudents()
    {
    	return students;
    }
    
    public void addStudent(student student)
    {
    	students.add(student);
    }
    
    public List<course> getCourse()
    {
    	return course;
    }
    
    public void addCourse(course courseNew)
    {
    	course.add(courseNew);
    }
    
        public void addModule(course courseNew)
    {
    	course.add(courseNew);
    }
    
   // public String listModules(List<Module> list) {
      //  String result = list.toString();
      //  return result;
    //}
    
}
    
   
