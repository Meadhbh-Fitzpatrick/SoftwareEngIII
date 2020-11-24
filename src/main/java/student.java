/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
//https://github.com/Meadhbh-Fitzpatrick/SoftwareEngIII
/**
 *
 * @author meadh
 */
public class student {
    private String name;
    private int age;
    private LocalDate DOB;
    private String ID;
    private String username;
    private course courses;
    private List<module> modules = new ArrayList<module>();
    
    public student(String name, int age,LocalDate DOB,String ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        
}
      // Getter
  public String getName() {
    return name;
  }
  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  // Getter
  public int getAge() {
    return age;
  }
  // Setter
  public void setAge(int newAge) {
    this.age = newAge;
  }
  // Getter
  public LocalDate getDOB() {
    return DOB;
  }
  // Setter
  public void setDOB(LocalDate DOB) {
    this.DOB = DOB;
  }
  // Getter
  public String getID() {
    return ID;
  }
  // Setter
  public void setID(String ID) {
    this.ID = ID;
  }  
    // Getter
  public String getUsername() {
    return username;
  }
  // Setter
  public void setUserName(String newUsername, String newAge) {
    this.username = newUsername + newAge;
  }
    // Getter
  public String getCourses() {
    return courses.getCourseName();
  }
  
    // Setter
  public void setCourses(course newCourses) {
    this.courses = newCourses;
  }
    public List<module> getModules()
    {
    	return modules;
    }
    
    public void addModule(module module)
    {
    	modules.add(module);
    }
    
    public String toString(){
        return name + " " + age + " " + ID + " ";
    }
}
