package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
import com.flipkart.Dao.*;
//import com.flipkart.service.StudentInterface.StudentFunction;
public class CRSApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t \t Welcome to CRS Application");
        System.out.println("Enter 1 Login");
        System.out.println("Enter 2 for Register");
        System.out.println("Enter 3 to Update Password");
        System.out.println("Enter 4 to Exit");
        System.out.println("Enter Here:");

        int menuClick = sc.nextInt();
        if(menuClick==1){
//            MockData data = MockData.getInstance();
//            System.out.println(data.student.get(101).getName());
            System.out.println("Please enter userName");
            int userName = sc.nextInt();
            System.out.println("Please Enter Password");
            String password = sc.next();
            //fetching role from db
            int reqRole = userName/100;
            if(reqRole==1){
                StudentInterface SI = new StudentImplementation();
                Student s = SI.fetchStudentData(userName);
                StudentCRSMenu stucrs = new StudentCRSMenu();
                stucrs.showChoices(s);


            }
            else if(reqRole==2){
                ProfessorInterface SI = new ProfessorImplementation();
                Professor p = SI.fetchProfessorData(userName);
                ProfessorCRSMenu procrs = new ProfessorCRSMenu();
                procrs.showChoices(p);

            }
            else if(reqRole==3){
                AdminInterface SI = new AdminImplementation();
                Admin ad = SI.fetchAdminData(userName);
                AdminCRSMenu adcrs = new AdminCRSMenu();
                adcrs.showChoices(ad);

            }



        }
        else if(menuClick==2){
            AdminInterface adm = new AdminImplementation();
            adm.approveStudent();


        }
        else if(menuClick==3){

        }
        else{
            System.out.println("Thank you");
        }
//        MockData data = MockData.getInstance();
//        System.out.println(data.professor.get(201).getName());



    }
}
