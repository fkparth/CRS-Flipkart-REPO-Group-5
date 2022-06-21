package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
public class StudentCRSMenu {
    public static void showChoices(Student student) {
<<<<<<< HEAD
=======
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
>>>>>>> cbd1dfd0472877570fc3494eacfdb696d853d28f

        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        int choice =0;
        while (choice!=-1){
            StudentInterface si = new StudentImplementation();
            System.out.println("Hello "+student.getName());
            System.out.println("1. View grades");
            System.out.println("2. Register for semester");
            System.out.println("3. Add Primary Course");
            System.out.println("4. Remove Primary Course");
            System.out.println("5. Add Secondary Course");
            System.out.println("6. Remove Secondary Course ");
            System.out.println("7. View Primary registered Courses");
            System.out.println("8. View Secondary registered Courses");
            System.out.println("9. Show available courses");
            System.out.println("10. View Payments");
            System.out.println("Press -1 to Logout");
            System.out.println("Enter Choice : ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    si.viewGradesheet();
                    break;
                case 2:
                    si.register(student);
                    break;
                case 3:
                    si.viewCourses(student);
                    break;
                case 4:
                    si.viewGradesheet();
                    break;
                case 5:
                    si.viewGradesheet();
                    break;
                default:
                    System.out.println("The input doesn't match the menu");
            }

=======
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
>>>>>>> cbd1dfd0472877570fc3494eacfdb696d853d28f
        }

    }

}
