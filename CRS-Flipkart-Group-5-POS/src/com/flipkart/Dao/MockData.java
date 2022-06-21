package com.flipkart.dao;

import com.flipkart.bean.Admin;

import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;

import java.util.HashMap;

public class MockData {
    private static MockData single_instance = null;
    public HashMap<Integer,Student> student;
    HashMap<Integer,Professor> professor;
    HashMap<Integer,Admin> admin;
    private MockData(){
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


    }
    public static MockData getInstance(){
        if(single_instance == null) {
            single_instance = new MockData();
        }
        return single_instance;

    }


}
