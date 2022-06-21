package com.flipkart.application;
import com.flipkart.bean.*;
import com.flipkart.service.*;

import java.util.*;
public class ProfessorCRSMenu {
    public static void showChoices(Professor professor) {
        System.out.println("Hello "+professor.getName());
        ProfessorInterface PI = new ProfessorImplementation();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Choose Course");
        System.out.println("2. View Student List ");
        System.out.println("3. Assign Grade");

        System.out.println("-1. exit");
        System.out.println("Enter a choice :");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                PI.chooseCourse();
                break;
            case 2:
                PI.viewStudentsList();
                break;
            case 3:
                PI.assignGrade();
                break;


        }

    }
}
