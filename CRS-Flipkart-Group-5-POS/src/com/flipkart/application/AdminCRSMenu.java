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
                AI.updateCatalogue();
                break;
            case 5:
                AI.assignCourseToStudent();
                break;
            default:
                System.out.println("Number choosen is not part of Menu");


        }


    }

}
