package com.flipkart.service;

import com.flipkart.bean.Admin;

public class AdminImplementation implements AdminInterface{
    @Override
    public Admin fetchUserData(int id) {
        Admin ad = new Admin();
        ad.setUserId(301);
        ad.setName("sruthi");
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
    public void updateCatalogue() {

    }

    @Override
    public void assignCourseToStudent() {

    }
}
