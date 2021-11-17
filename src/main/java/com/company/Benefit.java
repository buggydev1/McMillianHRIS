package com.company;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Benefit
{
    static Scanner s = new Scanner(System.in);

    public static void showBenefits()
    {

        try
        {
            Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE_BENEFITS ");
            System.out.println("Press 1 to see your medical benefits, 2 to see you vision benefits or 3 to see your dental benefits");
            int typeRequested = s.nextInt();
            if(typeRequested == 1)
            {
                System.out.println(rs.getString("plan_name"));
                System.out.println(rs.getString("plan_type"));
                System.out.println(rs.getString("num_of_people"));
                System.out.println(rs.getString("deduction_cost"));
            }
            if(typeRequested == 2)
            {
                System.out.println(rs.getString("vision_plan_name"));
                System.out.println(rs.getString("vision_plan_type"));
                System.out.println(rs.getString("vision_num_of_people"));
                System.out.println(rs.getString("vision_deduction_cost"));
            }
            if(typeRequested == 3)
            {
                System.out.println(rs.getString("dental_plan_name"));
                System.out.println(rs.getString("dental_plan_type"));
                System.out.println(rs.getString("dental_num_of_people"));
                System.out.println(rs.getString("dental_deduction_cost"));
            }
            connect.close();
        } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public static void updateBenefits() {
            System.out.println("Please enter the Employee ID of the person whose benefits you would like to update: ");
            try {
                Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                Statement statement = connect.createStatement();
                ResultSet rs = statement.executeQuery("SELECT employeeID, firstName, lastName FROM EMPLOYEE_BENEFITS");
                while(rs.next()) {
                    System.out.println(rs.getString("employeeID")); //NOT SURE IF IT'S CALLED USER ID IN OUR DATA, WILL CHECK INTO IT
                }
                connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            int appId = s.nextInt();

            System.out.println("*** Please select which portion of the employee information that you would like to update. ***");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET firstName = " + update + " WHERE applicantID = " + appId + ";");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET lastName = " + update + " WHERE applicantID = " + appId + ";");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET phoneNumber = " + update + " WHERE applicantID = " + appId + ";");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET email = " + update + " WHERE applicantID = " + appId + ";");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET address = " + update + " WHERE applicantID = " + appId + ";");
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
                    Connection connect = DriverManager.getConnection("insert url to host here", "root", "group3password");
                    Statement statement = connect.createStatement();
                    statement.executeQuery("UPDATE APPLICANT_TRACKING SET prev_workEXP = " + update + " WHERE applicantID = " + appId + ";");
                    connect.close();
                    System.out.println("Successfully Updated Applicant!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
