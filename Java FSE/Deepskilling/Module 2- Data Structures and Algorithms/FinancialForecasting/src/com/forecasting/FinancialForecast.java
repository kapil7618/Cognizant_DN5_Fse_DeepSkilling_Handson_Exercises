package com.forecasting;

public class FinancialForecast {

    // Calculates future value recursively
    public static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate / 100), rate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double annualGrowthRate = 8;
        int years = 5;

        double futureValue = forecast(presentValue, annualGrowthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + annualGrowthRate + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f%n", futureValue);
    }
}
