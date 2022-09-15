package ru.netology.javahw6.saleshw6.services;

public class SalesService {

    public int totalSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int averageOfSales(int[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum = sum + sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int numberOfMonth = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = numberOfMonth;
            }
            numberOfMonth = numberOfMonth + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int numberOfMonth = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = numberOfMonth;
            }
            numberOfMonth = numberOfMonth + 1;
        }
        return minMonth + 1;
    }

    public int sumOfMonthsLowerThanAverage(int[] sales) {
        int average = averageOfSales(sales);
        int monthsLowerThanAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsLowerThanAverage++;
            }
        }
        return monthsLowerThanAverage;
    }

    public int sumOfMonthsAboveThanAverage (int[] sales) {
        int average = averageOfSales(sales);
        int monthsAboveThanAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveThanAverage++;
            }
        }
        return monthsAboveThanAverage;
    }
}