package com.flipkart.service;
//import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.List;
import com.flipkart.bean.*;

public interface StudentInterface {
    public Student FetchUserData(int id);

    void register(Student student);

    void viewGradesheet(Student student);

    void viewRegisteredCourses(Student student);
}


