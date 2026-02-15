package org.java_lessons.lesson5.printer;

public class PrinterExplorer {
    public static void main(String[] args) {
        Printer HP = new HPColorPrinterImpl("HP ExtraPower12V", "Color");
        Printer Cannon = new CannonBlackPrinterImpl("Cannon HV700", "Black");
        Printer Xerox = new XeroxColorPrinterImpl("Xerox ImbaFAST", "Color");

        Printer printerInfo;

        System.out.println("Принтер HP");
        printerInfo = HP;
        printerInfo.getPrinterModel();
        printerInfo.print();
        printerInfo.clear();

        System.out.println("Принтер Cannon");
        printerInfo = Cannon;
        printerInfo.getPrinterModel();
        printerInfo.print();
        printerInfo.clear();

        System.out.println("Принтер Xerox");
        printerInfo = Xerox;
        printerInfo.getPrinterModel();
        printerInfo.print();
        printerInfo.clear();

    }
}
