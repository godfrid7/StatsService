package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximum(long[] sales) {
        int maximum = 0;
        long maximumSale = sales[maximum];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximum = i;
                maximumSale = sales[i];
            }
        }
        return maximum + 1;
    }

    public int MinSalesMonth(long[] sales) {
        int MinMonth = 0;
        long MinSalesMonth = sales[MinMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= MinSalesMonth) {
                MinMonth = i;
                MinSalesMonth = sales[i];
            }
        }
        return MinMonth + 1;
    }


    public int bellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return  counter;
    }

    public int highAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return  counter;
    }
}
