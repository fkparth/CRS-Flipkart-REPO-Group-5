package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
public class StudentCRSMenu {
    public static void showChoices(Student student) {
        StudentInterface si = new StudentImplementation();
        System.out.println("Hello "+student.getName());
        System.out.println("1. View Course Catalogue");
        System.out.println("2. Register");
        System.out.println("3. View Courses");
        System.out.println("4. Add Courses");
        System.out.println("5. Drop Courses");
        System.out.println("6. Fee Payment ");
        System.out.println("7. View Gradesheets");
        System.out.println("Press -1 to Logout");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                si.viewCourseCatalogue();
                break;
            case 2:
                si.register();
                break;
            case 3:
                si.viewCourses();
                break;
            case 4:
                si.addCourses();
                break;
            case 5:
                si.dropCourses();
                break;
            case 6:
                si.feePayment();
                break;
            case 7:
                si.viewGradesheet();
                break;
            case -1:
                break;
            default :
                System.out.println("Invalid Choice Entered");
        }

    }

}
