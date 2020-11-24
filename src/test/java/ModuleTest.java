/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//https://github.com/Meadhbh-Fitzpatrick/SoftwareEngIII
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

/**
 *
 * @author meadh
 */

public class ModuleTest {
	LocalDate dob = LocalDate.of(1999, 4, 15);
        student student = new student("Meadhbh Fitzpatrick", 21, dob, "1734893");
        
	course bp4 = new course("BP4", null, null);
	module ct104 = new module("ct104");
	
	@Test
	public void testGetModuleName() {
		Assert.assertTrue(ct104.getModuleName().equals("ct104"));
	}

	@Test
	public void testSetModuleName() {
		ct104.setModuleName("moduleName");
		Assert.assertTrue(ct104.getModuleName().equals("moduleName"));
	}

	@Test
	public void testGetStudents() {
		List<student> students = new ArrayList<student>();
		students.add(student);
		ct104.addStudent(student);
		Assert.assertTrue(ct104.getStudents().equals(students));
	}

	@Test
	public void testAddStudent() {
		List<student> students = new ArrayList<student>();
		students.add(student);
		ct104.addStudent(student);
		Assert.assertTrue(ct104.getStudents().equals(students));
	}

	@Test
	public void testGetCourse() {
		List<course> courses = new ArrayList<course>();
		courses.add(bp4);
		ct104.addCourse(bp4);
		Assert.assertTrue(ct104.getCourse().equals(courses));
	}

	@Test
	public void testAddCourse() {
		List<course> courses = new ArrayList<course>();
		courses.add(bp4);
		ct104.addCourse(bp4);
		Assert.assertTrue(ct104.getCourse().equals(courses));
	}

	//@Test
	//public void testToStringListOfModule() {
	//	List<module> moduleList = new ArrayList<module>();
	//	Assert.assertTrue(ct104.ListModule(moduleList).equals(moduleList.toString()));
	//}

}