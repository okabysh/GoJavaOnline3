package ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection;

public class Launcher {
    public static IMyCollection iMyCollection = new MyCollection();

    public static void main(String[] args) {
        Printer printer = new Printer();

        // to populate the collection
        iMyCollection.populateCollection();
        printer.print();

        // add first element in to collection
        System.out.println("1) adding first value=3;");
        iMyCollection.addFirst(3);
        printer.print();

        // add last element in to collection
        System.out.println("2) adding last value=6;");
        iMyCollection.addLast(6);
        printer.print();

        // add element by index in to collection
        System.out.println("3) adding value=10 in to index=5;");
        iMyCollection.addByIndex(5, 10);
        printer.print();

        // remove element by index from collection
        System.out.println("4) remove element with index=1;");
        iMyCollection.removeByIndex(1);
        printer.print();

        // remove element by value from collection
        System.out.println("5) remove element with value=4;");
        iMyCollection.removeByValue(4);
        printer.print();
    }
}
