package com.company;
import java.util.*;
public class Employee {
//    int empId;
    String empName, empAddress, empEmail;
    int empPhoneNumber;

    public String getName(){return empName;}
    public void setName(String name){empName = name;}

    public String getAddress(){return empAddress;}
    public void setEmployeeAddress(String address){empAddress = address;}

    public String getEmail(){return empEmail;}
    public void setEmail(String email){empEmail = email;}

    public int getPhoneNumber(){return empPhoneNumber;}
    public void setPhoneNumber(int phNum){empPhoneNumber = phNum;}

    public void setAll(String name, String email, String address, int phNum){
        this.setName(name);
        this.setEmployeeAddress(address);
        this.setEmail(email);
        this.setPhoneNumber(phNum);
    }



    public String toString(){
        return this.getName() + " Profile \n Email:" + this.getAddress() + "\n Address " + this.getEmail() + "\n Phone number: " + this.getPhoneNumber();
    }
}
