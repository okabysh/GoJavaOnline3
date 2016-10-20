package ua.GoIT.JavaEnterprise.Module01;

import java.util.ArrayList;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Printer {
    Results results;

    public Printer() {
        this.results = new Results();
    }

    public void printToScreen() {
        ArrayList cr; // collection results

        String formatterHeadTable = "|%15s | %8s   | %8s   |%9s  |%10s  |%10s  |%15s |%17s |\n";
        String formatterRowsTable = "| %-15s| %8.3f   | %8.3f   |%9.3f  |%10.3f  |%10.3f  |%15.3f |%17.3f |\n";

        // 10,000 Items
        System.out.println("");
        System.out.println("Table 1");
        System.out.println(TEXT_FOR_TABLE_10k);
        System.out.format(formatterHeadTable,"","add","get","remove","contains","populate","iteratator.add","iterator.remove");
        cr = results.getResults(TypeCollections.ArrayList, VALUE_10k);
        System.out.format(formatterRowsTable,"ArrayList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.LinkedList, VALUE_10k);
        System.out.format(formatterRowsTable,"LinkedList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.HashSet, VALUE_10k);
        System.out.format(formatterRowsTable,"HashSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.TreeSet, VALUE_10k);
        System.out.format(formatterRowsTable,"TreeSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));

        //100,000 Items
        System.out.println("");
        System.out.println("Table 2");
        System.out.println(TEXT_FOR_TABLE_100k);
        System.out.format(formatterHeadTable,"","add","get","remove","contains","populate","iteratator.add","iterator.remove");
        cr = results.getResults(TypeCollections.ArrayList, VALUE_100k);
        System.out.format(formatterRowsTable,"ArrayList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.LinkedList, VALUE_100k);
        System.out.format(formatterRowsTable,"LinkedList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.HashSet, VALUE_100k);
        System.out.format(formatterRowsTable,"HashSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.TreeSet, VALUE_100k);
        System.out.format(formatterRowsTable,"TreeSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));

        //1,000,000 Items
        System.out.println("");
        System.out.println("Table 3");
        System.out.println(TEXT_FOR_TABLE_1M);
        System.out.format(formatterHeadTable,"","add","get","remove","contains","populate","iteratator.add","iterator.remove");
        cr = results.getResults(TypeCollections.ArrayList, VALUE_1M);
        System.out.format(formatterRowsTable,"ArrayList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.LinkedList, VALUE_1M);
        System.out.format(formatterRowsTable,"LinkedList",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.HashSet, VALUE_1M);
        System.out.format(formatterRowsTable,"HashSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
        cr = results.getResults(TypeCollections.TreeSet, VALUE_1M);
        System.out.format(formatterRowsTable,"TreeSet",cr.get(0),cr.get(1),cr.get(2),cr.get(3),cr.get(4),cr.get(5),cr.get(6));
    }
}
