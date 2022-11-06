
package ru.netology.stats;

public class StatsService {

    static public long sumSales(long[] sales) {
        long sumSalesReal = 0; // сумма продаж за год
        for (int i = 0; i < sales.length; i++) { // делаем цикл на длину массива а то вдруг в году будет больше месяцев
            sumSalesReal = sumSalesReal + sales[i];

        }
        return sumSalesReal;
    }

    static public long avarageSales(long[] sales) {
        long avarageSalesReal = 0; // средняя продажа за месяц
        for (int i = 0; i < sales.length; i++) {
            avarageSalesReal = avarageSalesReal + sales[i];
        }
        avarageSalesReal = avarageSalesReal / sales.length;
        return avarageSalesReal;
    }

    static public int minSales(long[] sales) {
        long minMonth = sales[0];
        int minMonthReal = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minMonth) {
                minMonth = sales[i];
                minMonthReal = i;
            }
        }
        return minMonthReal +1;
    }

    static public int maxSales(long[] sales) {
        long maxMonth = sales[0];
        int maxMonthReal = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxMonth) {
                maxMonth = sales[i];
                maxMonthReal = i;
            }
        }
        return maxMonthReal +1;
    }

    static public int countMonthBelow(long[] sales) {
        long myAvarageMonthSale = avarageSales(sales);
        int myCountMonthBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < myAvarageMonthSale) {
                myCountMonthBelow++;
            }
        }
        return myCountMonthBelow;
    }

    static public int countMonthAbove(long[] sales) {
        long myAvarageMonthSale = avarageSales(sales);
        int myCountMonthAbove = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < myAvarageMonthSale) {
                myCountMonthAbove++;
            }
        }
        return myCountMonthAbove;
    }
}
