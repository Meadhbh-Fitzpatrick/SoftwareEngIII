/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meadh
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class courseTest {

	LocalDate startDate = LocalDate.of(2020, 11, 5);
	LocalDate endDate = LocalDate.of(2021, 5, 7);
	LocalDate dob = LocalDate.of(1999, 15, 4);
        student student = new student("Meadhbh Fitzpatrick", 21, dob, "1734893");
	course bp4 = new course("BP4", startDate, endDate);
	module ct104 = new module("ct104");
	
	
	@Test
	public void testGetstartDate() {
		Assert.assertTrue(bp4.getStartDate().equals(startDate));
	}

	@Test
	public void testSetstartDate() {
		LocalDate newStartDate = LocalDate.of(2007, 7, 7);
		bp4.setStartDate(newStartDate);
		Assert.assertTrue(bp4.getStartDate().equals(newStartDate));
	}

	@Test
	public void testGetEndDate() {
		Assert.assertTrue(bp4.getEndDate().equals(endDate));
	}

	@Test
	public void testSetAcademicEndDate() {
		LocalDate newEndDate = LocalDate.of(2005, 5, 28);
		bp4.setAcademicEndDate(newEndDate);
		Assert.assertTrue(bp4.getEndDate().equals(newEndDate));
	}

	@Test
	public void testGetStudents() {
		List<student> students = new ArrayList<student>();
		student.setCourses(bp4);
		Assert.assertTrue(bp4.getStudents().equals(students));
	}

	@Test
	public void testSetStudents() {
		List<student> students = new ArrayList<student>();
		students.add(student);
		bp4.setStudents(students);
		Assert.assertTrue(bp4.getStudents().equals(students));
	}

	@Test
	public void testGetModules() {
		List<module> modules = new ArrayList<module>();
		modules.add(ct104);
		bp4.setModules(modules);
		Assert.assertTrue(bp4.getModules().equals(modules));
	}

	@Test
	public void testSetModules() {
		List<module> modules = new ArrayList<module>();
		modules.add(ct104);
		bp4.setModules(modules);
		Assert.assertTrue(bp4.getModules().equals(modules));
	}

	@Test
	public void testGetCourseName() {
		Assert.assertTrue(bp4.getCourseName().equals("BP4"));
	}

	@Test
	public void testSetCourseName() {
		bp4.setCourseName("Course Name Test");
		Assert.assertTrue(bp4.getCourseName().equals("Course Name Test"));
	}
}
