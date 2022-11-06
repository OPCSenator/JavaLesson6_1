
package ru.netology.stats;

public class StatsService {

    static public double sumSales(double[] sales) {
        double sumSalesReal = 0; // сумма продаж за год
        for (int i = 0; i < sales.length; i++) { // делаем цикл на длину массива а то вдруг в году будет больше месяцев
            sumSalesReal = sumSalesReal + sales[i];

        }
        return sumSalesReal;
    }

    static public double avarageSales(double[] sales) {
        double avarageSalesReal = 0; // средняя продажа за месяц
        for (int i = 0; i < sales.length; i++) {
            avarageSalesReal = avarageSalesReal + sales[i];
        }
        avarageSalesReal = avarageSalesReal / sales.length;
        return avarageSalesReal;
    }

    static public int minSales(double[] sales) {
        double minMonth = sales[0];
        int minMonthReal = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minMonth) {
                minMonth = sales[i];
                minMonthReal = i;
            }
        }
        return minMonthReal +1;
    }

    static public int maxSales(double[] sales) {
        double maxMonth = sales[0];
        int maxMonthReal = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxMonth) {
                maxMonth = sales[i];
                maxMonthReal = i;
            }
        }
        return maxMonthReal +1;
    }

    static public int countMonthBelow(double[] sales) {
        double myAvarageMonthSale = avarageSales(sales);
        int myCountMonthBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < myAvarageMonthSale) {
                myCountMonthBelow++;
            }
        }
        return myCountMonthBelow;
    }

    static public int countMonthAbove(double[] sales) {
        double myAvarageMonthSale = avarageSales(sales);
        int myCountMonthAbove = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > myAvarageMonthSale) {
                myCountMonthAbove++;
            }
        }
        return myCountMonthAbove;
    }
}
