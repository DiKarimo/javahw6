package ru.netology.javahw6.saleshw6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindTotal() {

        SalesService service = new SalesService();

        int expectedTotal = 180;
        int actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void shouldFindAverage() {

        SalesService service = new SalesService();

        int expectedAverage = 15;
        int actualAverage = service.averageOfSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindNumberOfMaxMonth () {

        SalesService service = new SalesService();

        int expectedNumberOfMaxMonth = 8;
        int actualNumberOfMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedNumberOfMaxMonth, actualNumberOfMaxMonth);
    }

    @Test
    public void shouldFindNumberOfMinMonth () {

        SalesService service = new SalesService();

        int expectedNumberOfMinMonth = 9;
        int actualNumberOfMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedNumberOfMinMonth, actualNumberOfMinMonth);
    }

    @Test
    public void shouldSumOfMonthsLowerThanAverage () {

        SalesService service = new SalesService();

        int expectedSum = 5;
        int actualSum = service.sumOfMonthsLowerThanAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public  void shouldSumOfMonthsAboveThanAverage () {

        SalesService service = new SalesService();

        int expectedSumOfMonths = 5;
        int actualSumOfMonths = service.sumOfMonthsAboveThanAverage(sales);

        Assertions.assertEquals(expectedSumOfMonths, actualSumOfMonths);

    }
}
