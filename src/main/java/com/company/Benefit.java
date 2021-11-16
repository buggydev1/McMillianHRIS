package com.company;

public class Benefit {
    private String planType;
    private int numOfPeople;
    double deductionCost;

    public String getPlanType() { return planType;}
    public void setPlanType(String plan) { planType = plan;}

    public int getNumOfPeople() { return numOfPeople;}
    public void setNumOfPeople(int num) { numOfPeople = num;}

    public void setDeductionCost(String planType) {
        if (planType.equalsIgnoreCase("Alpha")){
            deductionCost = 20.00;
        }
        else if (planType.equalsIgnoreCase("Beta")){
            deductionCost = 10.00;
        }
        else { deductionCost = 5.00;}
    }
    public double getDeductionCost() {return deductionCost;}
}
