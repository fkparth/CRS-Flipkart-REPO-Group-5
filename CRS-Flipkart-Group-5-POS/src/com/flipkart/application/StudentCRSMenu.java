package com.flipkart.application;

import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;

public class StudentCRSMenu {
    public static void showChoices(Student student) {
        StudentInterface si = new StudentImplementation();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Hello " + student.getName());
            System.out.println("Here is your student menu");
            System.out.println("------------------------------------");
            System.out.println("1. Semester Registration");
            System.out.println("2. View Registered Courses");
            System.out.println("3. View grades");
            System.out.println("Press -1 to Logout");

            System.out.println("Enter Choice : ");
            int choice = sc.nextInt();

            if(choice==-1){
                break;
            }
            switch (choice) {
                case 1:
                    si.register(student);
                    break;
                case 2:
                    si.viewRegisteredCourses(student);
                    break;
                case 3:
                    si.viewGradesheet(student);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
