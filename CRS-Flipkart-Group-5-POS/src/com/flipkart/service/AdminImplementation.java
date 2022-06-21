package com.flipkart.service;

import com.flipkart.bean.*;

public class AdminImplementation implements AdminInterface{
    @Override
    public Admin fetchAdminData(int id) {
        Admin ad = new Admin();
        ad.setUserId(301);
        ad.setName("SS");
        ad.setRole(3);
        return ad;
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
    public void updateCatalogue(Course course) {


    }

    @Override
    public void assignCourseToStudent() {

    }
}
