package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.dao.MockData;

import java.util.*;
import java.util.Scanner;

public class ProfessorImplementation implements ProfessorInterface{
    @Override
    public Professor fetchProfessorData(int id) {


        MockData data = MockData.getInstance();
        return data.professor.get(id);
    }
    @Override
    public void chooseCourse() {
        HashMap<Integer, Course> courseList = new HashMap<Integer, Course>();
        CourseCatalogImplementation obj=new CourseCatalogImplementation();
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
