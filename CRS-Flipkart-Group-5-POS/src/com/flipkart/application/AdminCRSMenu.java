package com.flipkart.application;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Course;
import com.flipkart.dao.AdminDAO;
import com.flipkart.dao.AdminDAOoperation;
import com.flipkart.exceptions.CourseAlreadyExistsException;
import com.flipkart.exceptions.CourseNotAddedException;
import com.flipkart.exceptions.CourseNotFoundException;
import com.flipkart.exceptions.UserAlreadyExistsException;

import java.sql.SQLException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class AdminCRSMenu {
    public static void showChoices(Admin ad) throws SQLException, UserAlreadyExistsException, CourseAlreadyExistsException, CourseNotAddedException, CourseNotFoundException {
        int choice = 0;
<<<<<<< HEAD
        System.out.println(" ");
=======

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTimeString = now.format(formatter);
        System.out.print(dateTimeString+" ");

>>>>>>> 9626dd773eb3a47e4251ec665111bd931c924ba4
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
                    System.out.println("");


            }


        }
    }

}
