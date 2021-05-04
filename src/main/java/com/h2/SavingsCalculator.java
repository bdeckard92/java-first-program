package com.h2;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class SavingsCalculator  {
    private float[]  credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
         this.debits = debits;
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
    private static int remainingDaysInMonth(LocalDate date){
        int year = date.getYear();
        Month month = date.getMonth();
        YearMonth yearMonth = YearMonth.of(year, month);
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDaysInMonth = totalDaysInMonth - date.getDayOfMonth();
        return remainingDaysInMonth;

    }

    public float calculate(){
        return sumOfCredits() - sumOfDebits();
    }

    public static void main(String[] args){


    }


}
