package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // 1 рассчитывает сумму всех продаж

    @Test
    public void amountSalesTest() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expect = 180;
        long actual = service.amountSales(sale);

        Assertions.assertEquals(expect, actual);
    }

    // 2 рассчитывает среднюю сумму продаж в месяц
    @Test
    public void AverageSalesAmountTest() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expect = 15;
        long actual = service.AverageSalesAmount(sale);

        Assertions.assertEquals(expect, actual);
    }

    // 3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    public void monthMaxSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    // 4 номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    // 5 количество месяцев, в которых продажи были ниже среднего

    @Test
    public void numberOfMinMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    // 6 количество месяцев, в которых продажи были выше среднего
    @Test
    public void numberOfMaxMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageSales(sale);

        Assertions.assertEquals(expected, actual);
    }

}
