package ua.GoIT.JavaEnterprise.Module01;

public class Launcher {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Printer printer = new Printer();
        Saver saver = new Saver();

        // calculate Collections
        calculate.calculateArrayList();
        calculate.calculateLinkedList();
        calculate.calculateHashSet();
        calculate.calculateTreeSet();

        // print result to screen (for console)
        printer.printToScreen();

        // save result to Microsoft Excel file (*.xls)
        saver.saveToExcel();
    }
}
