package com.company;

public class Medical extends Benefit{

    @Override
    public void setDeductionCost(String planType) {
        if (planType.equalsIgnoreCase("Alpha")){
            deductionCost = 25.00;
        }
        else if (planType.equalsIgnoreCase("Beta")){
            deductionCost = 15.00;
        }
        else { deductionCost = 10.00;}
    }
    public double getDeductionCost() {return deductionCost;}
}
