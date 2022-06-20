package com.flipkart.application;
import java.util.Scanner;
public class CRSApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CRS Application");
        System.out.println("1.Login");
        System.out.println("2.Registration Of the Student");
        System.out.println("3.Update Password");
        System.out.println("4.Exit");
        int menuClick = sc.nextInt();
        if(menuClick==1){
            System.out.println("Please enter userName");
            String userName = sc.next();
            System.out.println("Please Enter Password");
            String password = sc.next();
            //fetching role from db

            int roleId = sc.nextInt();
            if(roleId==1){
                StudentCRSMenu temp = new StudentCRSMenu();
                temp.showChoices();

            }
            else if(roleId==2){
                ProfessorCRSMenu temp = new ProfessorCRSMenu();
                temp.showChoices();

            }
            else{
                AdminCRSMenu temp = new AdminCRSMenu();
                temp.showChoices();

            }


        }
        else if(menuClick==2){

        }
        else if(menuClick==3){

        }
        else{
            System.out.println("Thank you");
        }



    }
}
