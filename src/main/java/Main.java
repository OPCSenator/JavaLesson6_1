import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        double [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        double mySumSales = StatsService.sumSales(sales);
        double myAvarageSales = StatsService.avarageSales(sales);
        int myMinMonth = StatsService.minSales(sales);
        int myMaxMonth = StatsService.maxSales(sales);
        int myCountMonthBelow = StatsService.countMonthBelow(sales);
        int myMCountMonthAbove = StatsService.countMonthAbove(sales);

        System.out.println("Сумма продаж:" + mySumSales);
        System.out.println("Средняя продажа в месяц:" + myAvarageSales);
        System.out.println("Месяц наименьших продаж:" + myMinMonth);
        System.out.println("Месяц наибольших продаж:" + myMaxMonth);
        System.out.println("Количество месяцев с продажами ниже среднего:" + myCountMonthBelow);
        System.out.println("Количество месяцев с продажами выше среднего:" + myMCountMonthAbove);
    }
}