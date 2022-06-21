package com.flipkart.service;

import com.flipkart.dao.MockData;
import com.flipkart.bean.*;

public class AdminImplementation implements AdminInterface{
    @Override
    public Admin fetchAdminData(int id) {
        MockData data = MockData.getInstance();
        return data.admin.get(id);
    }

    @Override
    public void approveStudent() {
    }

    @Override
    public void generateReportCard() {

    }

    @Override
    public void addProfessor() {

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
