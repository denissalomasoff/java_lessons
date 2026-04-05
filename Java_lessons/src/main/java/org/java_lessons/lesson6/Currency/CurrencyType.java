package org.java_lessons.lesson6.Currency;

public enum CurrencyType {
    RUB("Российский рубль", 643, 0.013),
    EUR("Евро", 978, 1.18),
    USD("Американский доллар", 840, 1),
    CNY("Юань", 156, 0.14),
    AED("Дирхам", 784, 0.27);
    private final String russianName;
    private final int unionCode;
    private final double coef;

    CurrencyType(String russianName, int unionCode, double coef) {
        this.russianName = russianName;
        this.unionCode = unionCode;
        this.coef = coef;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getUnionCode() {
        return unionCode;
    }

    public double getCoef() {
        return coef;
    }
}
