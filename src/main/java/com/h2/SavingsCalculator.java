package com.h2;

public class SavingsCalculator  {
    private float[]  credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        credits = this.credits;
        debits = this.debits;
    }

    private float sumOfCredits(){
        float sum = 0.0f;
        for (int i = 0; i <= credits.length; i ++){
            sum =  sum + i;
        }
        return sum;
    }

    private float sumOfDebits(){
        float sum = 0.0f;
        for (int i = 0; i <= debits.length; i ++){
            sum = sum + i;
        }
        return sum;
    }
}
