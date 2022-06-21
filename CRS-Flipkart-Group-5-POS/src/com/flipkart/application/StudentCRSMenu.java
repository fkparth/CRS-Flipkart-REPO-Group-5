package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
public class StudentCRSMenu {
    public static void showChoices(Student student) {

        Scanner sc = new Scanner(System.in);

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

        }

    }

}
