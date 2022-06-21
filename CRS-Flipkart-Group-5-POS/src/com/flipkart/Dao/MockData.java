package com.flipkart.Dao;
import java.util.*;
import com.flipkart.bean.*;

public class MockData {
    private static MockData single_instance = null;
    public HashMap<Integer,Student> student;
    public HashMap<Integer,Professor> professor;
    public HashMap<Integer,Admin> admin;

    public HashMap<Integer,Course> course;

    public HashMap<Student,List<Course>> registeredCourses;
    private MockData(){
        this.registeredCourses = new HashMap<Student,List<Course>>();

        this.student = new HashMap<Integer,Student>();
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setName("Datta");
        s1.setRole(1);
        s1.setUserId(101);
        this.student.put(101,s1);
        Student s2 = new Student();
        s2.setStudentId(102);
        s2.setName("Rohit");
        s2.setRole(1);
        s2.setUserId(102);
        this.student.put(102,s2);


        //Hard code data of Professor
        this.professor = new HashMap<Integer,Professor>();
        Professor s3 = new Professor();

        s3.setName("Datta");
        s3.setRole(2);
        s3.setUserId(201);
        this.professor.put(201,s3);
        Professor s4 = new Professor();

        s4.setName("Arbab");
        s4.setRole(2);
        s4.setUserId(202);
        this.professor.put(202,s4);

        //Hard code Data of Admin

        this.admin = new HashMap<Integer,Admin>();
        Admin s5 = new Admin();
        s5.setName("SS");
        s5.setRole(3);
        s5.setUserId(301);
        this.admin.put(301,s5);

        // Hard code Courses


        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("POIS");
        course1.setStatus(0);
        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("OS");
        course2.setStatus(0);
        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("DSA");
        course3.setStatus(0);
        Course course4 = new Course();
        course4.setCourseId(4);
        course4.setCourseName("Java Basics");
        course4.setStatus(0);

        this.course = new HashMap<Integer,Course>();
        this.course.put(1,course1);
        this.course.put(2,course2);
        this.course.put(3,course3);
        this.course.put(4,course4);

    }


    public static MockData getInstance(){
        if(single_instance == null) {
            single_instance = new MockData();
        }
        return single_instance;

    }


}
