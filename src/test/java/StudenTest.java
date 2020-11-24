/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//https://github.com/Meadhbh-Fitzpatrick/SoftwareEngIII
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author meadh
 */

public class StudenTest {
	LocalDate dob = LocalDate.of(1999, 4, 15);
        student student = new student("Meadhbh Fitzpatrick", 21, dob, "1734893");

	course bp4 = new course("BP4", null, null);
	module ct104 = new module("ct104");
		
	@Test
	public void testGetName() 
	{
		Assert.assertTrue(student.getName() == "Meadhbh Fitzpatrick");
	}

	@Test
	public void testSetName() 
	{
		student.setName("Shane Drost");
		Assert.assertTrue(student.getName() == "Shane Drost");
	}

	@Test
	public void testGetAge() {
		Assert.assertTrue(student.getAge() == 21);	}

	@Test
	public void testSetAge() {
		student.setAge(25);
		Assert.assertTrue(student.getAge() == 25);
	}
		
	@Test
	public void testGetUsername() {
                student.setUserName("Meadhbh Fitzpatrick", "21");
		String username = "MeadhbhFitzpatrick21";
		Assert.assertTrue(student.getUsername().equals(username));
	}

	@Test
	public void testGetCourse() {
		student.setCourses(bp4);
		Assert.assertTrue(student.getCourses() == bp4.getCourseName());
	}

	@Test
	public void testSetCourse() {
		student.setCourses(bp4);
		Assert.assertTrue(student.getCourses() == bp4.getCourseName());
	}

	@Test
	public void testGetModules() {
		List<module> module = new ArrayList<module>();
		student.addModule(ct104);
		module.add(ct104);
		Assert.assertTrue(student.getModules().toString().equals(module.toString()));
	}

	@Test
	public void testAddModule() {
		List<module> module = new ArrayList<module>();
		student.addModule(ct104);
		module.add(ct104);
		//Assert.assertTrue(student.getModules().toString().equals(module.toString()));
	}

	@Test
	public void testGetDOB() {
		Assert.assertTrue(student.getDOB().equals(dob));
	}

	@Test
	public void testSetDOB() {
		LocalDate newDOB = LocalDate.of(1999, 6, 7);	
		student.setDOB(newDOB);
		Assert.assertTrue(student.getDOB().equals(newDOB));
	}

	@Test
	public void testGetID() {
		Assert.assertTrue(student.getID() == "17348933");
	}

	@Test
	public void testSetID() {
		student.setID("17424884");
		Assert.assertTrue(student.getID() == "17424884");
	}
}
