package com.flipkart.service;

import com.flipkart.Dao.MockData;
import com.flipkart.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProfessorImplementation implements ProfessorInterface{
    @Override
    public Professor fetchProfessorData(int id) {


        MockData data = MockData.getInstance();
        return data.professor.get(id);
    }
    @Override
    public void chooseCourse(int id) {    //prof id
        MockData data=MockData.getInstance();
//        HashMap<Integer,Course> coursesList = data.course;
        System.out.println("Here are list of available Courses:");
        for(int key: data.course.keySet()){
            if(data.course.get(key).getStatus()==0){
                System.out.println(data.course.get(key).getCourseId() + " " +data.course.get(key).getCourseName());
            }
        }
        System.out.println("Enter Course Code :");
        Scanner sc = new Scanner(System.in);
        int ccode = sc.nextInt();
        data.course.get(ccode).setStatus(1);
        data.course.get(ccode).setProfessor(data.professor.get(id));
    }

    @Override
    public void viewStudentsList(int id) {   //prof id
        MockData data = MockData.getInstance();
        int pcourseid = -1;
        for(int key: data.course.keySet()) {
          //  System.out.println(data.course.get(key).getProfessor().getUserId());
            if (data.course.get(key).getStatus()==1 &&   data.course.get(key).getProfessor().getUserId() == id) {
                pcourseid = data.course.get(key).getCourseId();
            }
        }
            List<Student> studlist = new ArrayList<Student>();
        for(Student key1: data.registeredCourses.keySet()){
            for(Course key2:data.registeredCourses.get(key1) ){
                if (key2.getCourseId() == pcourseid){
                    studlist.add(key1);
                }
            }
        }
        System.out.println("Course Id:"+pcourseid);
        System.out.println("StudentID  :  StudentName");
        for (Student key3:studlist){
            System.out.println(key3.getUserId()+"  :  "+key3.getName());
        }
    }

    @Override
    public void assignGrade() {

    }
}
