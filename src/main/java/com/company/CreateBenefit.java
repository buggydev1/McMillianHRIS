package com.company;
import java.util.Scanner;
public class CreateBenefit {
        public static void main(String[] args) {
        String planType;
        int numOfPeople;

        Scanner keyboard = new Scanner(System.in);
        Medical newBenefit = new Medical();

        System.out.println("Enter Plan Type preferred: Alpha or Beta");
        planType = keyboard.nextLine();
        System.out.println("How many people on plan?");
        numOfPeople = keyboard.nextInt();

        newBenefit.setPlanType(planType);
        newBenefit.setNumOfPeople(numOfPeople);
        newBenefit.setDeductionCost(planType);

        System.out.println("Health care plan type selected: " + newBenefit.getPlanType() + ". The number of people on the plan: " + newBenefit.getNumOfPeople() +
                " And the deduction is " + newBenefit.getDeductionCost() + "% multiplied by the number of people.");

    }
}
