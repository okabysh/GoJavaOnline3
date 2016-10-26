package ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection;

import static ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.Launcher.iMyCollection;

public class Printer {
    public void print() {
        //to print the collection
        System.out.print("Collection: ");
        for (int i = 0; i<iMyCollection.size(); i++) {
            System.out.print(iMyCollection.get(i)+", ");
        }
        System.out.println(" size: " + iMyCollection.size() + "\n");
    }
}
