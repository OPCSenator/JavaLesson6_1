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
            long[] testSalesSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            StatsService service = new StatsService();
            long expected = 78;
            long actual = service.sumSales(testSalesSum);

            Assertions.assertEquals(actual, expected);

        }

    }

}
