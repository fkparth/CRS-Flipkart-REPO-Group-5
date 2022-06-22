package com.flipkart.application;
import com.flipkart.bean.*;
import com.flipkart.service.*;
import com.flipkart.dao.*;

import java.sql.SQLException;
import java.util.*;

public class ProfessorCRSMenu {
    public static void showChoices(Professor professor) throws SQLException {
        int choice = 0;

        System.out.println("Hello " + professor.getName());
        Scanner sc = new Scanner(System.in);
        while (choice != -1) {
            ProfessorDAO PI = new ProfessorDAOoperation();
            System.out.println("1. Choose Course");
            System.out.println("2. View Student List ");
            System.out.println("3. Assign Grade");

            System.out.println("-1. exit");
            System.out.println("Enter a choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    PI.chooseCourse(professor.getUserId());
                    break;
                case 2:
                    PI.viewStudentsList(professor.getUserId());
                    break;
                case 3:
                    PI.assignGrade(professor.getUserId());
                    break;


            }

        }
    }
}
