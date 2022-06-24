package com.flipkart.application;

import com.flipkart.bean.Student;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOoperation;
<<<<<<< HEAD
import com.flipkart.exceptions.CourseNotAddedException;
import com.flipkart.exceptions.CourseNotDroppedException;
import com.flipkart.exceptions.NoRegisteredCoursesException;
import com.flipkart.exceptions.RegistrationUnsuccessfulException;
=======
import com.flipkart.exceptions.*;
>>>>>>> 99306809c05828d02a7c1feb3bbb8735ec77d06e

import java.sql.SQLException;
import java.util.Scanner;
public class StudentCRSMenu {
<<<<<<< HEAD
    public static void showChoices(Student student) throws SQLException, RegistrationUnsuccessfulException, NoRegisteredCoursesException, CourseNotAddedException, CourseNotDroppedException {
=======
    public static void showChoices(Student student) throws SQLException, RegistrationUnsuccessfulException, NoRegisteredCoursesException, CourseNotAddedException, CourseNotDroppedException, PaymentUnsuccessfulException {
>>>>>>> 99306809c05828d02a7c1feb3bbb8735ec77d06e
        if (student==null)
            return;
        Scanner sc = new Scanner(System.in);
        int choice =0;
        while (choice!=-1){
            StudentDAO si = new StudentDAOoperation();
            System.out.println("Hello "+student.getName());
            System.out.println("1. View Course Catalogue");
            System.out.println("2. Register");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Add Courses");
            System.out.println("5. Drop Courses");
            System.out.println("6. Fee Payment ");
            System.out.println("7. View Gradesheets");
            System.out.println("Press -1 to Logout");
            System.out.println("Enter Choice : ");

             choice = sc.nextInt();
            switch (choice) {
                case 1:
                    si.viewCourseCatalogue();
                    break;
                case 2:
                    si.register(student);
                    break;
                case 3:
                    si.viewCourses(student.getUserId());
                    break;
                case 4:
                    si.addCourses(student);
                    break;
                case 5:
                    si.dropCourses(student);
                    break;
                case 6:
                    si.feePayment(student);
                    break;
                case 7:
                    si.viewGradesheet(student.getUserId());
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Invalid Choice Entered");
            }

        }

    }

}
