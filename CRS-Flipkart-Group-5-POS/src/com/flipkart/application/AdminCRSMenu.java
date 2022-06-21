package com.flipkart.application;
import com.flipkart.bean.*;
import com.flipkart.service.*;
import java.util.*;
public class AdminCRSMenu {
    public static void showChoices(Admin ad)
    {

        System.out.println("Hello "+ad.getName());
        AdminInterface AI = new AdminImplementation();
        System.out.println("Enter 1 to approve Student");
        Course course = new Course();
        System.out.println("Enter 2 to generate report card of a student");
        System.out.println("Enter 3 to add professor");
        System.out.println("Enter 4 to update course catalogue");
        System.out.println("Enter 5 to assignCourse to student");
        System.out.println("Enter -1 to logout");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
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
                System.out.println("Enter 1 to Add course,Enter 2 to delete Course");
                System.out.println("Enter here:");

                AI.updateCatalogue(course);
                break;
            case 5:
                AI.assignCourseToStudent();
                break;
            default:
                System.out.println("Number chosen is not part of Menu");


        }


    }

}
