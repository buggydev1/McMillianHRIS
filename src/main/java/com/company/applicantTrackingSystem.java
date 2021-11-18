package com.company;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class applicantTrackingSystem {
    static Scanner s = new Scanner(System.in);
    public static void createApplicant() {
        System.out.println("First Name: ");
        String firstName = s.nextLine();
        System.out.println("Last Name: ");
        String lastName = s.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = s.nextLine();
        System.out.println("Email: ");
        String email = s.nextLine();
        System.out.println("Address: ");
        String address = s.nextLine();
        System.out.println("Previous Work Experience: ");
        String prev_workEXP = s.nextLine();

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
            Statement statement = connect.createStatement();
            statement.executeQuery("INSERT INTO APPLICANT VALUES (" + firstName + ", " + lastName + ", " + phoneNumber +
                    ", " + email + ", " + address + ", " + prev_workEXP + ";");
            connect.close();
            System.out.println("Applicant successfully created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readApplicant() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM APPLICANT;");
            while(rs.next()) {
                System.out.println(rs.getString("applicantID"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastName"));
                System.out.println(rs.getString("phoneNumber"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("prev_workEXP"));
            }
            connect.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

    public static void updateApplicant() {
        System.out.println("Please enter the Applicant ID of the person you would like to update: ");
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT applicantID, firstName, lastName FROM APPLICANT");
            while(rs.next()) {
                System.out.println(rs.getString("applicantID")); //NOT SURE IF IT'S CALLED USER ID IN OUR DATA, WILL CHECK INTO IT
            }
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int appId = s.nextInt();

        System.out.println("*** Please select which portion of the applicant information that you would like to update. ***");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Phone Number");
        System.out.println("4. Email");
        System.out.println("5. Address");
        System.out.println("6. Previous Work Experience");

        int selection = s.nextInt();
        if (selection == 1) {
            System.out.println("Please enter the updated first name: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET firstName = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 2) {
            System.out.println("Please enter the updated last name: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET lastName = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 3) {
            System.out.println("Please enter the updated phone number: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET phoneNumber = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 4) {
            System.out.println("Please enter the updated email address: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET email = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 5) {
            System.out.println("Please enter the updated home address: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET address = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 6) {
            System.out.println("Please enter the updated work experience: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE APPLICANT SET prev_workEXP = " + update + " WHERE applicantID = " + appId + ";");
                connect.close();
                System.out.println("Successfully Updated Applicant!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteApplicant() {
        System.out.println("Please enter first name of the applicant that you wish to delete: ");
        String fName = s.nextLine();
        System.out.println("Please enter last name of the applicant that you wish to delete: ");
        String lName = s.nextLine();
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "passwordGroup3");
            Statement statement = connect.createStatement();
            statement.executeQuery("DELETE FROM APPLICANT WHERE firstName = " + fName + " & lastName = " + lName + ";");
            connect.close();
            System.out.println("Successfully Deleted Applicant!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
