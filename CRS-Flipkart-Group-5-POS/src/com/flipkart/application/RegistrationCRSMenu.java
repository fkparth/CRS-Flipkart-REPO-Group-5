package com.flipkart.application;

import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;

public class RegistrationCRSMenu {
    public static void showChoices(Student student){
        RegistrationInterface ri = new RegistrationImplementation();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Hello " + student.getName());
            System.out.println("Here is your registration menu");
            System.out.println("------------------------------------");
            System.out.println("1. View Course Catalogue");
            System.out.println("2. View Registered Courses");
            System.out.println("3. Add Courses");
            System.out.println("4. Drop Courses");
            System.out.println("5. Make Fee Payment");
            System.out.println("Press -1 to exit registration menu");

            System.out.println("Enter Choice : ");
            int choice = sc.nextInt();

            if(choice==-1){
                break;
            }
            switch(choice){
                case 1:
                    ri.viewCourses();
                    break;
                case 2:
                    ri.registeredCourses(student);
                    break;
                case 3:
                    ri.addCourse(student);
                    break;
                case 4:
                    ri.dropCourse(student);
                    break;
                case 5:
                    ri.feePayment();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
