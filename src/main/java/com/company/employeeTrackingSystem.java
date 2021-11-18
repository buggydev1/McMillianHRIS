package com.company;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class employeeTrackingSystem extends applicantTrackingSystem {
    static Scanner s = new Scanner(System.in);
    public static void createEmployee() {
        System.out.println("First Name: "); //check for new variable name when SQL table changed
        String first_name = s.nextLine();
        System.out.println("Last Name: "); //check for new variable name when SQL table changed
        String last_name = s.nextLine();
        System.out.println("Address: ");
        String address = s.nextLine();
        System.out.println("Email: ");
        String email = s.nextLine();
        System.out.println("Phone Number: ");
        String phone_number = s.nextLine();
        System.out.println("Hire Date: ");
        String hire_date = s.nextLine();
        System.out.println("Salary: ");
        String salary = s.nextLine();
        System.out.println("Manager's ID: ");
        String manager_id = s.nextLine();
        System.out.println("Department's ID: ");
        String dep_id = s.nextLine();
        System.out.println("Training Status: ");
        String training_status = s.nextLine();
        System.out.println("Performance Status: ");
        String performance_status = s.nextLine();


        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
            Statement statement = connect.createStatement();
            statement.executeQuery("INSERT INTO APPLICANT_TRACKING VALUES (" + first_name + ", " + last_name + ", " + address +
                    ", " + email + ", " + phone_number + ", " + hire_date + ", " + salary + ", " + manager_id + ", " + dep_id + ", " + training_status +
                    ", " + performance_status + ";");
            connect.close();
            System.out.println("Employee successfully created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readEmployee() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE;");
            while(rs.next()) {
                System.out.println(rs.getString("first_name"));
                System.out.println(rs.getString("last_name"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("phone_number"));
                System.out.println(rs.getString("hire_date"));
                System.out.println(rs.getString("salary"));
                System.out.println(rs.getString("manager_id"));
                System.out.println(rs.getString("dep_id"));
                System.out.println(rs.getString("training_status"));
                System.out.println(rs.getString("performance_status"));
            }
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee() {
        System.out.println("Please enter the Employee ID of the person you would like to update: ");
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT employee_id, first_name, last_name FROM EMPLOYEE;");
            while(rs.next()) {
                System.out.println(rs.getString("employee_id")); //NOT SURE IF IT'S CALLED USER ID IN OUR DATA, WILL CHECK INTO IT
            }
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int empId = s.nextInt();

        System.out.println("*** Please select which portion of the Employee information that you would like to update. ***");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Address");
        System.out.println("4. Email Address");
        System.out.println("5. Phone Number");
        System.out.println("6. Hire Date");
        System.out.println("7. Salary");
        System.out.println("8. Manager ID Number");
        System.out.println("9. Department ID Number");
        System.out.println("10. Training Status");
        System.out.println("11. Performance Status");

        int selection = s.nextInt();
        if (selection == 1) {
            System.out.println("Please enter the updated first name: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET first_name = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 2) {
            System.out.println("Please enter the updated last name: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET last_name = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 3) {
            System.out.println("Please enter the updated address: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET address = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 4) {
            System.out.println("Please enter the updated email address: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET email = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 5) {
            System.out.println("Please enter the updated phone number: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET phone_number = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 6) {
            System.out.println("Please enter the updated hire date: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET hire_date = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 7) {
            System.out.println("Please enter the updated salary: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET salary = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 8) {
            System.out.println("Please enter the updated manager ID: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET manager_id = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 9) {
            System.out.println("Please enter the updated department ID: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET dep_id = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 10) {
            System.out.println("Please enter the updated training status: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET training_status = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (selection == 11) {
            System.out.println("Please enter the updated performance status: ");
            String update = s.nextLine();
            try {
                Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
                Statement statement = connect.createStatement();
                statement.executeQuery("UPDATE EMPLOYEE SET performance_status = " + update + " WHERE employee_id = " + empId + ";");
                connect.close();
                System.out.println("Successfully Updated Employee!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteEmployee() {
        System.out.println("Please enter first name of the employee that you wish to delete: ");
        String fName = s.nextLine();
        System.out.println("Please enter last name of the employee that you wish to delete: ");
        String lName = s.nextLine();
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://35.238.229.38:3306/McmillenHr", "root", "group3password");
            Statement statement = connect.createStatement();
            statement.executeQuery("DELETE FROM EMPLOYEE WHERE first_name = " + fName + " & last_name = " + lName + ";");
            connect.close();
            System.out.println("Successfully Deleted Employee!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

