package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.*;

public interface AdminDAO {
    Admin fetchAdminData(int id);
    void approveStudent();

    void generateReportCard();

    void addProfessor();

    void updateCatalogue(int addOrDrop);

    void assignCourseToStudent();
}
