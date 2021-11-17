package com.company;
import java.util.*;

public class Main extends employeeTrackingSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("*=*=*=*=*=*=* Welcome to the McMillan Employee Management System *=*=*=*=*=*=*");
        System.out.println("Please select whether you would like to make changes in the employee or applicant databases: ");
        System.out.println("1. Employee");
        System.out.println("2. Applicant");

        int choice = s.nextInt();

        if(choice == 1) {
            System.out.println("Would you like to: ");
            System.out.println("1. Create a new employee");
            System.out.println("2. Read an employee in the database");
            System.out.println("3. Update an employee's information");
            System.out.println("4. Delete an employee");
            int empChoice = s.nextInt();

            if(empChoice == 1) {
                createEmployee();
            }
            else if(empChoice == 2) {
                readEmployee();
            }
            else if(empChoice == 3) {
                updateEmployee();
            }
            else if(empChoice == 4) {
                deleteEmployee();
            }
        }

        if(choice == 2) {
            System.out.println("Would you like to: ");
            System.out.println("1. Create a new applicant");
            System.out.println("2. Read an applicant in the database");
            System.out.println("3. Update an applicant's information");
            System.out.println("4. Delete an applicant");
            int empChoice = s.nextInt();

            if(empChoice == 1) {
                createApplicant();
            }
            else if(empChoice == 2) {
                readApplicant();
            }
            else if(empChoice == 3) {
                updateApplicant();
            }
            else if(empChoice == 4) {
                deleteApplicant();
            }
        }
    }
}
