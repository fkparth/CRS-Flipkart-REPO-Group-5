package com.flipkart.application;
import java.util.Scanner;
public class CRSApplication {
    public static void main(String[] args) {
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
            System.out.println("Please enter userName");
            String userName = sc.next();
            System.out.println("Please Enter Password");
            String password = sc.next();
            //fetching role from db

            int roleId = sc.nextInt();
            if(roleId==1){
                StudentCRSMenu studentMenu = new StudentCRSMenu();
                studentMenu.showChoices();

            }
            else if(roleId==2){
                ProfessorCRSMenu profMenu = new ProfessorCRSMenu();
                profMenu.showChoices();

            }
            else{
                AdminCRSMenu adminMenu = new AdminCRSMenu();
                adminMenu.showChoices();

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
