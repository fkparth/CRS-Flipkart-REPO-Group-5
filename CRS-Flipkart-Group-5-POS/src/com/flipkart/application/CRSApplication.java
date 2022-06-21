package com.flipkart.application;
import java.util.*;
import com.flipkart.service.*;
import com.flipkart.bean.*;
//import com.flipkart.service.StudentInterface.StudentFunction;
public class CRSApplication {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t \t Welcome to CRS Application");
        System.out.println("Enter 1 Login");
        System.out.println("Enter 2 for Registration Of the Student");
        System.out.println("Enter 3 to Update Password");
        System.out.println("Enter 4 to Exit");
        System.out.println("Enter Here:");
        int menuClick = sc.nextInt();
        if(menuClick==1){
            System.out.println("Please enter userId");
            int userName = sc.nextInt();
            System.out.println("Please Enter Password");
            String password = sc.next();
            //fetching role from db
            int reqRole = userName/100;
            if(reqRole==1){
                StudentInterface SI = new StudentImplementation() {
                    @Override
                    public void viewCourseCatalogue() {

                    }
                };
                Student s = SI.FetchUserData(userName);
                StudentCRSMenu stucrs = new StudentCRSMenu();
                stucrs.showChoices(s);


            }
            else if(reqRole==2){
                ProfessorInterface SI = new ProfessorImplementation();
                Professor p = SI.FetchUserData(userName);
                ProfessorCRSMenu procrs = new ProfessorCRSMenu();
                procrs.showChoices(p);

            }
            else if(reqRole==3){
                AdminInterface SI = new AdminImplementation();
                Admin ad = SI.fetchUserData(userName);
                AdminCRSMenu adcrs = new AdminCRSMenu();
                adcrs.showChoices(ad);

            }



        }
        else if(menuClick==2){
            AdminInterface adm=new AdminImplementation();
            System.out.println("Enter Your Name");
            String name=sc.next();
            System.out.println("Enter your password");
            String password=sc.next();


        }
        else if(menuClick==3){

        }
        else{
            System.out.println("Thank you");
        }




    }
}
