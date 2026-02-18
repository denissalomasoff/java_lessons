package org.java_lessons.lesson6.Currency;

import static org.java_lessons.lesson6.Currency.CurrencyType.*;

public class DictionaryCurrency {
    public static void main(String[] args) {
        CurrencyType curRub = CurrencyType.RUB;
        CurrencyType curEur = CurrencyType.EUR;
        CurrencyType curDol = CurrencyType.USD;
        CurrencyType curDir = CurrencyType.AED;
        CurrencyType curUan = CurrencyType.CNY;

        System.out.println("Справочник валют");
        System.out.println("Наименование- " + "международный код- " + "Коэффициент");
        System.out.println(String.format("%s - %d - %f",
                RUB.getRussianName(),
                RUB.getUnionCode(),
                RUB.getCoef()));
        System.out.println(String.format("%s - %d - %f",
                USD.getRussianName(),
                USD.getUnionCode(),
                USD.getCoef()));
        System.out.println(String.format("%s - %d - %f",
                EUR.getRussianName(),
                EUR.getUnionCode(),
                EUR.getCoef()));
        System.out.println(String.format("%s - %d - %f",
                CNY.getRussianName(),
                CNY.getUnionCode(),
                CNY.getCoef()));
        System.out.println(String.format("%s - %d - %f",
                AED.getRussianName(),
                AED.getUnionCode(),
                AED.getCoef()));

    }
}
