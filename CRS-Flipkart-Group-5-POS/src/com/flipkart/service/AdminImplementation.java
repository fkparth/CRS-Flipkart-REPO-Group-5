package com.flipkart.service;
import com.flipkart.Dao.MockData;
import com.flipkart.bean.*;
import java.util.*;
public class AdminImplementation implements AdminInterface{
    @Override
    public Admin fetchAdminData(int id) {
        MockData data = MockData.getInstance();
        return data.admin.get(id);
    }

    @Override
    public void approveStudent() {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String newstudname = sc.next();
        System.out.println("Enter your password");
        sc.next();

        Student student = new Student();
        MockData data = MockData.getInstance();
        int currentSize = data.student.size();

        Student studreg = new Student();
        studreg.setUserId(currentSize+101);
        studreg.setName(newstudname);
        studreg.setRole(1);
        studreg.setStudentId(currentSize+101);
        data.student.put(studreg.getUserId(), studreg);

    }

    @Override
    public void generateReportCard() {

    }

    @Override
    public void addProfessor() {
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        System.out.println("Enter userid for new professor");
        int profid = sc.nextInt();
        prof.setUserId(profid);
        System.out.println("Enter new Professor Name");
        String profname = sc.next();
        prof.setName(profname);
        int profrole = 2;
        prof.setRole(profrole);
        MockData data = MockData.getInstance();
        data.professor.put(prof.getUserId(),prof);
    }

    @Override
    public void updateCatalogue(Course course,int addOrdrop) {
        MockData data = MockData.getInstance();
        if(addOrdrop == 1){
            data.course.put(course.getCourseId(),course);
        }
        else{
            data.course.remove(course.getCourseId());
        }
    }

    @Override
    public void assignCourseToStudent() {


    }
}
