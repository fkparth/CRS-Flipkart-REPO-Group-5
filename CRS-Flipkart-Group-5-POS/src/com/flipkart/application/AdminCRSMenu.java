package com.flipkart.application;
import com.flipkart.bean.*;
import com.flipkart.service.*;
import java.util.*;
public class AdminCRSMenu {
    public static void showChoices(Admin ad) {
        int choice = 0;

        System.out.println("Hello " + ad.getName());
        while (choice != -1) {

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
            choice = sc.nextInt();
            switch (choice) {
                case 1:
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
                    CourseCatalogInterface cci = new CourseCatalogImplementation();
                    Course newcourse;
                    switch (choice) {
                        case 1:

                            System.out.println("Enter Course Details for adding course");
                            System.out.println("Enter Course ID");
                            int cida = sc.nextInt();
                            System.out.println("Enter Course Name");
                            String cnamea = sc.next();
                            newcourse = new Course();
                            newcourse.setCourseId(cida);
                            newcourse.setCourseName(cnamea);
                            AI.updateCatalogue(newcourse, 1);
                        case 2:
                            //cci = new CourseCatalogImplementation();
                            System.out.println("Enter Course Details for dropping course");
                            System.out.println("Enter Course ID");
                            int cidd = sc.nextInt();
                            System.out.println("Enter Course Name");
                            String cnamed = sc.next();
                            newcourse = new Course();
                            newcourse.setCourseId(cidd);
                            newcourse.setCourseName(cnamed);
                            AI.updateCatalogue(newcourse, 1);


                    }

                    AI.updateCatalogue(course, 1);
                    break;
                case 5:
                    AI.assignCourseToStudent();
                    break;
                default:
                    System.out.println("Number chosen is not part of Menu");


            }


        }
    }

}
