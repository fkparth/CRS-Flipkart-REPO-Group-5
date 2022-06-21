package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
public class StudentCRSMenu {
    public static void showChoices(Student student) {
        StudentInterface si = new StudentImplementation();
        System.out.println("Hello "+student.getName());
        System.out.println("1. View grades");
        System.out.println("2. Make payment");
        System.out.println("3. Add Primary Course");
        System.out.println("4. Remove Primary Course");
        System.out.println("5. Add Secondary Course");
        System.out.println("6. Remove Secondary Course ");
        System.out.println("7. View Primary registered Courses");
        System.out.println("8. View Secondary registered Courses");
        System.out.println("9. Show available courses");
        System.out.println("10. View Payments");
        System.out.println("Press -1 to Logout");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                si.viewGradesheet();
                break;
            case 2:
                si.viewGradesheet();
                break;
            case 3:
                si.viewGradesheet();
                break;
            case 4:
                si.viewGradesheet();
                break;
            case 5:
                si.viewGradesheet();
                break;


        }

    }

}
