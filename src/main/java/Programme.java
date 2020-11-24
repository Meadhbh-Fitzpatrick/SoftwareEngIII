/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
//part b)of assignment
//https://github.com/Meadhbh-Fitzpatrick/SoftwareEngIII

//For part b, I used jitpack and recieved the followinf dependencies/repositories
//	<repositories>
//		<repository>
//		    <id>jitpack.io</id>
//		    <url>https://jitpack.io</url>
//		</repository>
//	</repositories>

//	<dependency>
//	    <groupId>com.github.Meadhbh-Fitzpatrick</groupId>
//	    <artifactId>SoftwareEngIII</artifactId>
//	    <version>Tag</version>
//	</dependency>
//However I was unable to add my repository to settings.xml as it my PC would not give me access to do so
//therefore I was unable to add jitpack to assignment
/**
 *
 * @author meadh
 */
public class Programme {
    public static List<course> courses = new ArrayList<course>();
     public static List<student> students = new ArrayList<student>();
    
    public Programme(){   
}
    
    public static void main(String[] args){
    student s1 = new student("Meadhbh Fitzpatrick", 21, null, "1734893");
    student s2 = new student("Shane Drost", 21, null, "17424884");
    student s3 = new student("Amy Gilmore", 21, null, "5");
    student s4 = new student("Aine oConnor", 22, null, "8");
    student s5 = new student("Saoirse Fitzpatrick", 20, null, "7");

  
    module m1 = new module("Science");
    module m2 = new module("Art");
    module m3 = new module("Maths");
    module m4 = new module("Geography");
     
    course c1 = new course("BP4", null, null);
    course c2 = new course("RA1", null, null);
    course c3 = new course("R2D2", null, null);
    
    
    m1.addStudent(s1);
    m1.addStudent(s5);
    
    m2.addStudent(s2);
    m2.addStudent(s3);
    
    m3.addStudent(s4);
    m3.addStudent(s1);
    
    m4.addStudent(s5);
    m4.addStudent(s2);
    
    c1.addModule(m1);
    c1.addModule(m4);
    c1.addModule(m2);
    
    c2.addModule(m3);
    c2.addModule(m1);

    c3.addModule(m2);
    c3.addModule(m4);
    
    courses.add(c1);
    courses.add(c2);
    courses.add(c3);
    
    
    System.out.print("Course: ");
    System.out.println(c1.getCourseName());
    System.out.println(c1.getModules());
    System.out.print("Course: ");
    System.out.println(c2.getCourseName());
    System.out.println(c2.getModules());
    System.out.print("Course: ");
    System.out.println(c3.getCourseName());
    System.out.println(c3.getModules()); 
    
    System.out.print("Module: ");
    System.out.print(m1);
    System.out.print(" ");
    System.out.print(m1.getStudents());
    System.out.println();
    
    System.out.print("Module: ");
    System.out.print(m2);
    System.out.print(" ");
    System.out.print(m2.getStudents());
    System.out.println();
    
    System.out.print("Module: ");
    System.out.print(m3);
    System.out.print(" ");
    System.out.print(m3.getStudents());
    System.out.println();
    
    System.out.print("Module: ");
    System.out.print(m4);
    System.out.print(" ");
    System.out.print(m4.getStudents());
    System.out.println();
    
    
    } 
}
