package ru.netology.stats;

public class StatsService {

    // 1 рассчитывает сумму всех продаж
    public long amountSales(long[] sales) {
        long amount = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }

        return amount; // итого сумма
    }

    // 2 рассчитывает среднюю сумму продаж в месяц
    public long AverageSalesAmount(long[] sales) {
        // long amount = 0; // сумма всех продаж

        // for (int i = 0; i < sales.length; i++) {
        //     amount = amount + sales[i];
        // }
        long amount = amountSales(sales); //воспользовались вычислением сумммы продаж выше

        return amount / sales.length; // средняя сумма продаж
    }

    // 3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // 4 считает номер месяца минимальных продаж.

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // 5 количество месяцев, в которых продажи были ниже среднего
    public int belowAverageSales(long[] sales) {

        // long amount = 0; // сумма всех продаж

        // for (int i = 0; i < sales.length; i++) {
        //     amount = amount + sales[i];
        // }
        // long amountsr = amount / sales.length; //расчет среднего значения взят из 2

        long amountsr = AverageSalesAmount(sales); //расчет среднего значения взят из 2

        int minMonth = 0; // счетчик месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountsr) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = minMonth + 1; // добавим к счетчику еще один месяц
            }
        }

        return minMonth; // количество месяцев с продажами ниже среднего
    }

    // 6 количество месяцев, в которых продажи были выше среднего
    public int aboveAverageSales(long[] sales) {

        //long amount = 0; // сумма всех продаж

        // for (int i = 0; i < sales.length; i++) {
        //     amount = amount + sales[i];
        // }
        // long amountsr = amount / sales.length; //расчет среднего значения взят из 2

        long amountsr = AverageSalesAmount(sales); //расчет среднего значения взят из 2

        int maxMonth = 0; // счетчик месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountsr) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = maxMonth + 1; // добавим к счетчику еще один месяц
            }
        }

        return maxMonth; // количество месяцев с продажами выше среднего
    }

}
