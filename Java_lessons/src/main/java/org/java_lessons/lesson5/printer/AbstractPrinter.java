package org.java_lessons.lesson5.printer;

public abstract class AbstractPrinter implements Printer{
    private String printerModel;
    private String printerType;

    public AbstractPrinter(String printerModel, String printerType) {
        this.printerModel = printerModel;
        this.printerType = printerType;
    }

    @Override
    public void getPrinterModel() {
        System.out.println("Модель принтера: "+printerModel);
    }

    @Override
    public void getPrinterType() {
        System.out.println("Тип принтера: "+printerType);
    }

    @Override
    public void clear() {
        System.out.println("Кэш очищен.");
    }

    @Override
    public void print() {
        System.out.println("Идет печать...");
    }
}
