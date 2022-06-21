package com.flipkart.service;

import com.flipkart.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProfessorImplementation implements ProfessorInterface{
    @Override
    public Professor fetchProfessorData(int id) {

        HashMap<Integer,Professor> stuData = new HashMap<Integer,Professor>();
        Professor s1 = new Professor();

        s1.setName("Datta");
        s1.setRole(2);
        s1.setUserId(201);
        stuData.put(201,s1);
        Professor s2 = new Professor();

        s2.setName("Arbab");
        s2.setRole(2);
        s2.setUserId(202);
        stuData.put(202,s2);
        return stuData.get(id);
    }
    @Override
    public void chooseCourse() {
        List<Course> courseList = new ArrayList<Course>();
        CourseCatalogInterface obj=new CourseCatalogImplementation();
        courseList=obj.fetchCoursesList();

        for(int i=0;i<courseList.size();i++){
            System.out.print(courseList.get(i).getCourseId());
            System.out.print("-");
            System.out.print(courseList.get(i).getCourseName()+" ");
            System.out.println(courseList.get(i).getStatus());
        }

        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Professor prof=new Professor();

        courseList.get(choice-1).setStatus("Deactive");
        prof.setCourse(courseList.get(choice-1));



        for(int i=0;i<courseList.size();i++){
            System.out.print(courseList.get(i).getCourseId());
            System.out.print("-");
            System.out.print(courseList.get(i).getCourseName()+" ");
            System.out.println(courseList.get(i).getStatus());
        }



    }

    @Override
    public void viewStudentsList() {

    }

    @Override
    public void assignGrade() {

    }
}
