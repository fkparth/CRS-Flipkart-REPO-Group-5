package com.flipkart.application;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Course;
import com.flipkart.dao.AdminDAO;
import com.flipkart.dao.AdminDAOoperation;

import java.sql.SQLException;
import java.util.Scanner;
public class AdminCRSMenu {
    public static void showChoices(Admin ad) throws SQLException {
        int choice = 0;

        System.out.println("Hello " + ad.getName());
        while (choice != -1) {

            AdminDAO AI = new AdminDAOoperation();
            System.out.println("Enter 1 to approve Student");
            Course course = new Course();
            System.out.println("Enter 2 to generate report card of a student");
            System.out.println("Enter 3 to add professor");
            System.out.println("Enter 4 to update course catalogue");
            System.out.println("Enter 5 to assignCourse to student");
            System.out.println("Enter 6 to view course catalogue");
            System.out.println("Enter -1 to logout");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AI.approveStudent();
                    break;
                case 2:
                    AI.generateReportCard();
                    break;
                case 3:
                    AI.addProfessor();
                    break;
                case 4:
                    System.out.println("Enter 1 to Add course");
                    System.out.println("Enter 2 to Drop course");
                    System.out.println("Enter your choice:");
                    int adchoice = sc.nextInt();
                    AI.updateCatalogue(adchoice);
                    break;
                case 5:
                    AI.assignCourseToStudent();
                    break;
                case 6:
                    AI.viewCourseCatalogue();
                    break;
                default:
                    System.out.println("Number chosen is not part of Menu");


            }


        }
    }

}
