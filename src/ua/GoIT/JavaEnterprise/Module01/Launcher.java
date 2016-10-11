package ua.GoIT.JavaEnterprise.Module01;

public class Launcher {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.calculateArrayList();
        calculate.calculateLinkedList();
        calculate.calculateHashSet();
        calculate.calculateTreeSet();

        calculate.printToScreen();
        calculate.saveToExcel();
    }
}
