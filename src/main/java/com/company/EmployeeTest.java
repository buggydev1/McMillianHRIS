package com.company;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
//        int id;
        String name;
        String address;
        String email;
        int phoneNumber;
        Scanner keyboard = new Scanner(System.in);

        Employee newEmployee = new Employee();

        System.out.println("Let's create your employee profile. Please enter the following:");
        System.out.println("Name: >>");
        name = keyboard.nextLine();
        System.out.println("Address (All on one line please): >>");
        address = keyboard.nextLine();
        System.out.println("Email: >>");
        email = keyboard.nextLine();
        System.out.println("Phone number (format: 1234567890) >>");
        phoneNumber = keyboard.nextInt();
        keyboard.nextLine();
        newEmployee.setAll(name, address, email, phoneNumber);
        System.out.println(newEmployee.toString());
    }
}
