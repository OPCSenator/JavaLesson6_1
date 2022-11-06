import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

//@ParameterizedTest
//@CsvSource({
//                "1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10, 11, 12, 78"
//        })

        @Test

        public void sumSalesTest(){
            double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            StatsService service = new StatsService();
            double expected = 78;
            double actual = service.sumSales(testSalesSum);

            Assertions.assertEquals(actual, expected);
        }
    @Test
    public void avarageSalesTest(){
        double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        double expected = 6.5;
        double actual = service.avarageSales(testSalesSum);

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void minSalesTest(){
        double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int expected = 1;
        int actual = service.minSales(testSalesSum);

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void maxSalesTest(){
        double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int expected = 12;
        int actual = service.maxSales(testSalesSum);

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void countMonthBelowTest(){
        double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.countMonthBelow(testSalesSum);

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void countMonthAboveTest(){
        double[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.countMonthAbove(testSalesSum);

        Assertions.assertEquals(actual, expected);
    }


}
