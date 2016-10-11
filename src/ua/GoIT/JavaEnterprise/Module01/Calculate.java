package ua.GoIT.JavaEnterprise.Module01;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Calculate {
    Results results = new ua.GoIT.JavaEnterprise.Module01.Results();
    Methods calculate = new Methods();

    public void calculateArrayList() {
        double currentTime = 0;

        // add() function in ArrayList<>
        currentTime = calculate.addMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListAdd_10k, currentTime);
        currentTime = calculate.addMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListAdd_100k, currentTime);
        currentTime = calculate.addMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListAdd_1M, currentTime);

        // get() function in ArrayList<>
        currentTime = calculate.getMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListGet_10k, currentTime);
        currentTime = calculate.getMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListGet_100k, currentTime);
        currentTime = calculate.getMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListGet_1M, currentTime);

        // remove() function in ArrayList<>
        currentTime = calculate.removeMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListRemove_10k, currentTime);
        currentTime = calculate.removeMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListRemove_100k, currentTime);
        currentTime = calculate.removeMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListRemove_1M, currentTime);

        // containts() function in ArrayList<>
        currentTime = calculate.containtsMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListContaints_10k, currentTime);
        currentTime = calculate.containtsMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListContaints_100k, currentTime);
        currentTime = calculate.containtsMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListContaints_1M, currentTime);

        // populate function in ArrayList<>
        currentTime = calculate.populateMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListPopulate_10k, currentTime);
        currentTime = calculate.populateMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListPopulate_100k, currentTime);
        currentTime = calculate.populateMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListPopulate_1M, currentTime);

         //iteratorAdd() function in ArrayList<>
        currentTime = calculate.iteratorAddMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_10k, currentTime);
        currentTime = calculate.iteratorAddMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_100k, currentTime);
        currentTime = calculate.iteratorAddMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_1M, currentTime);

         //iteratorRemove() function in ArrayList<>
        currentTime = calculate.iteratorRemoveMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_10k, currentTime);
        currentTime = calculate.iteratorRemoveMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_100k, currentTime);
        currentTime = calculate.iteratorRemoveMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_1M, currentTime);
    }

    public void calculateLinkedList() {
        double currentTime = 0;

        // add() function in LinkedList<>
        currentTime = calculate.addMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListAdd_10k, currentTime);
        currentTime = calculate.addMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListAdd_100k, currentTime);
        currentTime = calculate.addMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListAdd_1M, currentTime);

        // get() function in LinkedList<>
        currentTime = calculate.getMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListGet_10k, currentTime);
        currentTime = calculate.getMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListGet_100k, currentTime);
        currentTime = calculate.getMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListGet_1M, currentTime);

        // remove() function in ArrayList<>
        currentTime = calculate.removeMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListRemove_10k, currentTime);
        currentTime = calculate.removeMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListRemove_100k, currentTime);
        currentTime = calculate.removeMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListRemove_1M, currentTime);

        // containts() function in LinkedList<>
        currentTime = calculate.containtsMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListContaints_10k, currentTime);
        currentTime = calculate.containtsMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListContaints_100k, currentTime);
        currentTime = calculate.containtsMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListContaints_1M, currentTime);

        // populate function in LinkedList<>
        currentTime = calculate.populateMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListPopulate_10k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListPopulate_100k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListPopulate_1M, currentTime);

        // iteratorAdd() function in LinkedList<>
        currentTime = calculate.populateMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_10k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_100k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_1M, currentTime);

        // iteratorRemove() function in LinkedList<>
        currentTime = calculate.populateMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_10k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_100k, currentTime);
        currentTime = calculate.populateMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_1M, currentTime);
    }

    public void calculateHashSet() {
        double currentTime = 0;

        // add() function in HashSet<>
        currentTime = calculate.addMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetAdd_10k, currentTime);
        currentTime = calculate.addMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetAdd_100k, currentTime);
        currentTime = calculate.addMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetAdd_1M, currentTime);

        // get() function in HashSet<>
        currentTime = calculate.getMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetGet_10k, currentTime);
        currentTime = calculate.getMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetGet_100k, currentTime);
        currentTime = calculate.getMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetGet_1M, currentTime);

        // remove() function in HashSet<>
        currentTime = calculate.removeMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetRemove_10k, currentTime);
        currentTime = calculate.removeMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetRemove_100k, currentTime);
        currentTime = calculate.removeMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetRemove_1M, currentTime);

        // containts() function in HashSet<>
        currentTime = calculate.containtsMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetContaints_10k, currentTime);
        currentTime = calculate.containtsMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetContaints_100k, currentTime);
        currentTime = calculate.containtsMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetContaints_1M, currentTime);

        // populate function in HashSet<>
        currentTime = calculate.populateMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetPopulate_10k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetPopulate_100k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetPopulate_1M, currentTime);

        // iteratorAdd() function in HashSet<>
        currentTime = calculate.populateMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetIteratorAdd_10k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetIteratorAdd_100k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetIteratorAdd_1M, currentTime);

        // iteratorRemove() function in HashSet<>
        currentTime = calculate.populateMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetIteratorRemove_10k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetIteratorRemove_100k, currentTime);
        currentTime = calculate.populateMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetIteratorRemove_1M, currentTime);
    }

    public void calculateTreeSet() {
        double currentTime = 0;

        // add() function in TreeSet<>
        currentTime = calculate.addMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetAdd_10k, currentTime);
        currentTime = calculate.addMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetAdd_100k, currentTime);
        currentTime = calculate.addMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetAdd_1M, currentTime);

        // get() function in TreeSet<>
        currentTime = calculate.getMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetGet_10k, currentTime);
        currentTime = calculate.getMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetGet_100k, currentTime);
        currentTime = calculate.getMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetGet_1M, currentTime);

        // remove() function in TreeSet<>
        currentTime = calculate.removeMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetRemove_10k, currentTime);
        currentTime = calculate.removeMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetRemove_100k, currentTime);
        currentTime = calculate.removeMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetRemove_1M, currentTime);

        // containts() function in TreeSet<>
        currentTime = calculate.containtsMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetContaints_10k, currentTime);
        currentTime = calculate.containtsMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetContaints_100k, currentTime);
        currentTime = calculate.containtsMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetContaints_1M, currentTime);

        // populate function in TreeSet<>
        currentTime = calculate.populateMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetPopulate_10k, currentTime);
        currentTime = calculate.populateMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetPopulate_100k, currentTime);
        currentTime = calculate.populateMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetPopulate_1M, currentTime);

        // iteratorAdd() function in TreeSet<>
        currentTime = calculate.containtsMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_10k, currentTime);
        currentTime = calculate.containtsMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_100k, currentTime);
        currentTime = calculate.containtsMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_1M, currentTime);

        // iteratorRemove() function in TreeSet<>
        currentTime = calculate.populateMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_10k, currentTime);
        currentTime = calculate.populateMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_100k, currentTime);
        currentTime = calculate.populateMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_1M, currentTime);
    }

    public void printToScreen() {
        double add, get, remove, contains, populate,  iteratorAdd, iteratorRemove;

        // 10,000 Items
        System.out.println("");
        System.out.println("Table 1");
        System.out.println(TEXT_FOR_TABLE_10k);
        System.out.println("\t\t\t"+"|"+"\t"+"add"+"\t\t"+"|"+"\t\t"+"get"+"\t\t"+"|"+"\t\t"+"remove"+"\t\t"+"|"+"\t"+"contains"+"\t"+"|"+"\t"+"populate"+"\t"+"|"+"\t"+"iterator.add"+"\t"+"|"+"\t"+"iterator.remove"+"\t"+"|");

        add = results.loadResult(TypeCollections.ArrayListAdd_10k);
        get = results.loadResult(TypeCollections.ArrayListGet_10k);
        remove = results.loadResult(TypeCollections.ArrayListRemove_10k);
        contains = results.loadResult(TypeCollections.ArrayListContaints_10k);
        populate = results.loadResult(TypeCollections.ArrayListPopulate_10k);
        iteratorAdd = results.loadResult(TypeCollections.ArrayListIteratorAdd_10k);
        iteratorRemove = results.loadResult(TypeCollections.ArrayListIteratorRemove_10k);
        System.out.println("ArrayList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.LinkedListAdd_10k);
        get = results.loadResult(TypeCollections.LinkedListGet_10k);
        remove = results.loadResult(TypeCollections.LinkedListRemove_10k);
        contains = results.loadResult(TypeCollections.LinkedListContaints_10k);
        populate = results.loadResult(TypeCollections.LinkedListPopulate_10k);
        iteratorAdd = results.loadResult(TypeCollections.LinkedListIteratorAdd_10k);
        iteratorRemove = results.loadResult(TypeCollections.LinkedListIteratorRemove_10k);
        System.out.println("LinkedList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.HashSetAdd_10k);
        get = results.loadResult(TypeCollections.HashSetGet_10k);
        remove = results.loadResult(TypeCollections.HashSetRemove_10k);
        contains = results.loadResult(TypeCollections.HashSetContaints_10k);
        populate = results.loadResult(TypeCollections.HashSetPopulate_10k);
        iteratorAdd = results.loadResult(TypeCollections.HashSetIteratorAdd_10k);
        iteratorRemove = results.loadResult(TypeCollections.HashSetIteratorRemove_10k);
        System.out.println("HashSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.TreeSetAdd_10k);
        get = results.loadResult(TypeCollections.TreeSetGet_10k);
        remove = results.loadResult(TypeCollections.TreeSetRemove_10k);
        contains = results.loadResult(TypeCollections.TreeSetContaints_10k);
        populate = results.loadResult(TypeCollections.TreeSetPopulate_10k);
        iteratorAdd = results.loadResult(TypeCollections.TreeSetIteratorAdd_10k);
        iteratorRemove = results.loadResult(TypeCollections.TreeSetIteratorRemove_10k);
        System.out.println("TreeSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        //100,000 Items
        System.out.println("");
        System.out.println("Table 2");
        System.out.println(TEXT_FOR_TABLE_100k);
        System.out.println("\t\t\t"+"|"+"\t"+"add"+"\t\t"+"|"+"\t\t"+"get"+"\t\t"+"|"+"\t\t"+"remove"+"\t\t"+"|"+"\t"+"contains"+"\t"+"|"+"\t"+"populate"+"\t"+"|"+"\t"+"iterator.add"+"\t"+"|"+"\t"+"iterator.remove"+"\t"+"|");

        add = results.loadResult(TypeCollections.ArrayListAdd_100k);
        get = results.loadResult(TypeCollections.ArrayListGet_100k);
        remove = results.loadResult(TypeCollections.ArrayListRemove_100k);
        contains = results.loadResult(TypeCollections.ArrayListContaints_100k);
        populate = results.loadResult(TypeCollections.ArrayListPopulate_100k);
        iteratorAdd = results.loadResult(TypeCollections.ArrayListIteratorAdd_100k);
        iteratorRemove = results.loadResult(TypeCollections.ArrayListIteratorRemove_100k);
        System.out.println("ArrayList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.LinkedListAdd_100k);
        get = results.loadResult(TypeCollections.LinkedListGet_100k);
        remove = results.loadResult(TypeCollections.LinkedListRemove_100k);
        contains = results.loadResult(TypeCollections.LinkedListContaints_100k);
        populate = results.loadResult(TypeCollections.LinkedListPopulate_100k);
        iteratorAdd = results.loadResult(TypeCollections.LinkedListIteratorAdd_100k);
        iteratorRemove = results.loadResult(TypeCollections.LinkedListIteratorRemove_100k);
        System.out.println("LinkedList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.HashSetAdd_100k);
        get = results.loadResult(TypeCollections.HashSetGet_100k);
        remove = results.loadResult(TypeCollections.HashSetRemove_100k);
        contains = results.loadResult(TypeCollections.HashSetContaints_100k);
        populate = results.loadResult(TypeCollections.HashSetPopulate_100k);
        iteratorAdd = results.loadResult(TypeCollections.HashSetIteratorAdd_100k);
        iteratorRemove = results.loadResult(TypeCollections.HashSetIteratorRemove_100k);
        System.out.println("HashSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.TreeSetAdd_100k);
        get = results.loadResult(TypeCollections.TreeSetGet_100k);
        remove = results.loadResult(TypeCollections.TreeSetRemove_100k);
        contains = results.loadResult(TypeCollections.TreeSetContaints_100k);
        populate = results.loadResult(TypeCollections.TreeSetPopulate_100k);
        iteratorAdd = results.loadResult(TypeCollections.TreeSetIteratorAdd_100k);
        iteratorRemove = results.loadResult(TypeCollections.TreeSetIteratorRemove_100k);
        System.out.println("TreeSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        //1,000,000 Items
        System.out.println("");
        System.out.println("Table 3");
        System.out.println(TEXT_FOR_TABLE_1M);
        System.out.println("\t\t\t"+"|"+"\t"+"add"+"\t\t"+"|"+"\t\t"+"get"+"\t\t"+"|"+"\t\t"+"remove"+"\t\t"+"|"+"\t"+"contains"+"\t"+"|"+"\t"+"populate"+"\t"+"|"+"\t"+"iterator.add"+"\t"+"|"+"\t"+"iterator.remove"+"\t"+"|");

        add = results.loadResult(TypeCollections.ArrayListAdd_1M);
        get = results.loadResult(TypeCollections.ArrayListGet_1M);
        remove = results.loadResult(TypeCollections.ArrayListRemove_1M);
        contains = results.loadResult(TypeCollections.ArrayListContaints_1M);
        populate = results.loadResult(TypeCollections.ArrayListPopulate_1M);
        iteratorAdd = results.loadResult(TypeCollections.ArrayListIteratorAdd_1M);
        iteratorRemove = results.loadResult(TypeCollections.ArrayListIteratorRemove_1M);
        System.out.println("ArrayList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.LinkedListAdd_1M);
        get = results.loadResult(TypeCollections.LinkedListGet_1M);
        remove = results.loadResult(TypeCollections.LinkedListRemove_1M);
        contains = results.loadResult(TypeCollections.LinkedListContaints_1M);
        populate = results.loadResult(TypeCollections.LinkedListPopulate_1M);
        iteratorAdd = results.loadResult(TypeCollections.LinkedListIteratorAdd_1M);
        iteratorRemove = results.loadResult(TypeCollections.LinkedListIteratorRemove_1M);
        System.out.println("LinkedList\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.HashSetAdd_1M);
        get = results.loadResult(TypeCollections.HashSetGet_1M);
        remove = results.loadResult(TypeCollections.HashSetRemove_1M);
        contains = results.loadResult(TypeCollections.HashSetContaints_1M);
        populate = results.loadResult(TypeCollections.HashSetPopulate_1M);
        iteratorAdd = results.loadResult(TypeCollections.HashSetIteratorAdd_1M);
        iteratorRemove = results.loadResult(TypeCollections.HashSetIteratorRemove_1M);
        System.out.println("HashSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");

        add = results.loadResult(TypeCollections.TreeSetAdd_1M);
        get = results.loadResult(TypeCollections.TreeSetGet_1M);
        remove = results.loadResult(TypeCollections.TreeSetRemove_1M);
        contains = results.loadResult(TypeCollections.TreeSetContaints_1M);
        populate = results.loadResult(TypeCollections.TreeSetPopulate_1M);
        iteratorAdd = results.loadResult(TypeCollections.TreeSetIteratorAdd_1M);
        iteratorRemove = results.loadResult(TypeCollections.TreeSetIteratorRemove_1M);
        System.out.println("TreeSet\t"+"|"+"\t"+add+"\t"+"|"+"\t"+get+"\t"+"|"+"\t"+remove+"\t"+"|"+"\t"+contains+"\t"+"|"+"\t"+populate+"\t"+"|"+"\t"+iteratorAdd+"\t"+"|"+"\t"+iteratorRemove+"\t"+"|");
    }

    public void saveToExcel() {
        Workbook workbook = new HSSFWorkbook();

        //sheet_10k
        Sheet sheet_10k = workbook.createSheet("Table 10k");

        Font font = workbook.createFont(); // to create font
        font.setBoldweight(Font.BOLDWEIGHT_BOLD); // apply to bold font
        CellStyle styleBoldFont = workbook.createCellStyle(); // to create bold style
        styleBoldFont.setFont(font); // apply to bold font to style

        Row rowTableName_10k = sheet_10k.createRow(0);
        rowTableName_10k.createCell(0).setCellValue(TEXT_FOR_TABLE_10k);
        rowTableName_10k.getCell(0).setCellStyle(styleBoldFont); // this text in cell is bold

        Row headTable_10k = sheet_10k.createRow(1);
        headTable_10k.createCell(1).setCellValue("add");
        headTable_10k.createCell(2).setCellValue("get");
        headTable_10k.createCell(3).setCellValue("remove");
        headTable_10k.createCell(4).setCellValue("contains");
        headTable_10k.createCell(5).setCellValue("populate");
        headTable_10k.createCell(6).setCellValue("iterator.add");
        headTable_10k.createCell(7).setCellValue("iterator.remove");

        // row ArrayList
        Row rowArrayList_10k = sheet_10k.createRow(2);
        rowArrayList_10k.createCell(0).setCellValue("ArrayList");
        rowArrayList_10k.createCell(1).setCellValue(results.loadResult(TypeCollections.ArrayListAdd_10k));
        rowArrayList_10k.createCell(2).setCellValue(results.loadResult(TypeCollections.ArrayListGet_10k));
        rowArrayList_10k.createCell(3).setCellValue(results.loadResult(TypeCollections.ArrayListRemove_10k));
        rowArrayList_10k.createCell(4).setCellValue(results.loadResult(TypeCollections.ArrayListContaints_10k));
        rowArrayList_10k.createCell(5).setCellValue(results.loadResult(TypeCollections.ArrayListPopulate_10k));
        rowArrayList_10k.createCell(6).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorAdd_10k));
        rowArrayList_10k.createCell(7).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorRemove_10k));

        // row LinkedList
        Row rowLinkedList_10k = sheet_10k.createRow(3);
        rowLinkedList_10k.createCell(0).setCellValue("LinkedList");
        rowLinkedList_10k.createCell(1).setCellValue(results.loadResult(TypeCollections.LinkedListAdd_10k));
        rowLinkedList_10k.createCell(2).setCellValue(results.loadResult(TypeCollections.LinkedListGet_10k));
        rowLinkedList_10k.createCell(3).setCellValue(results.loadResult(TypeCollections.LinkedListRemove_10k));
        rowLinkedList_10k.createCell(4).setCellValue(results.loadResult(TypeCollections.LinkedListContaints_10k));
        rowLinkedList_10k.createCell(5).setCellValue(results.loadResult(TypeCollections.LinkedListPopulate_10k));
        rowLinkedList_10k.createCell(6).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorAdd_10k));
        rowLinkedList_10k.createCell(7).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorRemove_10k));

        // row HashSet
        Row rowHashSet_10k = sheet_10k.createRow(4);
        rowHashSet_10k.createCell(0).setCellValue("HashSet");
        rowHashSet_10k.createCell(1).setCellValue(results.loadResult(TypeCollections.HashSetAdd_10k));
        rowHashSet_10k.createCell(2).setCellValue(results.loadResult(TypeCollections.HashSetGet_10k));
        rowHashSet_10k.createCell(3).setCellValue(results.loadResult(TypeCollections.HashSetRemove_10k));
        rowHashSet_10k.createCell(4).setCellValue(results.loadResult(TypeCollections.HashSetContaints_10k));
        rowHashSet_10k.createCell(5).setCellValue(results.loadResult(TypeCollections.HashSetPopulate_10k));
        rowHashSet_10k.createCell(6).setCellValue(results.loadResult(TypeCollections.HashSetIteratorAdd_10k));
        rowHashSet_10k.createCell(7).setCellValue(results.loadResult(TypeCollections.HashSetIteratorRemove_10k));

        // row TreeSet
        Row rowTreeSet_10k = sheet_10k.createRow(5);
        rowTreeSet_10k.createCell(0).setCellValue("TreeSet");
        rowTreeSet_10k.createCell(1).setCellValue(results.loadResult(TypeCollections.TreeSetAdd_10k));
        rowTreeSet_10k.createCell(2).setCellValue(results.loadResult(TypeCollections.TreeSetGet_10k));
        rowTreeSet_10k.createCell(3).setCellValue(results.loadResult(TypeCollections.TreeSetRemove_10k));
        rowTreeSet_10k.createCell(4).setCellValue(results.loadResult(TypeCollections.TreeSetContaints_10k));
        rowTreeSet_10k.createCell(5).setCellValue(results.loadResult(TypeCollections.TreeSetPopulate_10k));
        rowTreeSet_10k.createCell(6).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorAdd_10k));
        rowTreeSet_10k.createCell(7).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorRemove_10k));

        sheet_10k.autoSizeColumn(1); sheet_10k.autoSizeColumn(2);
        sheet_10k.autoSizeColumn(3); sheet_10k.autoSizeColumn(4);
        sheet_10k.autoSizeColumn(5); sheet_10k.autoSizeColumn(6);
        sheet_10k.autoSizeColumn(7);

        // sheet 100k
        Sheet sheet_100k = workbook.createSheet("Table 100k");

        Row rowTableName_100k = sheet_100k.createRow(0);
        rowTableName_100k.createCell(0).setCellValue(TEXT_FOR_TABLE_100k);
        rowTableName_100k.getCell(0).setCellStyle(styleBoldFont); // this text in cell is bold

        Row headTable_100k = sheet_100k.createRow(1);
        headTable_100k.createCell(1).setCellValue("add");
        headTable_100k.createCell(2).setCellValue("get");
        headTable_100k.createCell(3).setCellValue("remove");
        headTable_100k.createCell(4).setCellValue("contains");
        headTable_100k.createCell(5).setCellValue("populate");
        headTable_100k.createCell(6).setCellValue("iterator.add");
        headTable_100k.createCell(7).setCellValue("iterator.remove");

        // row ArrayList
        Row rowArrayList_100k = sheet_100k.createRow(2);
        rowArrayList_100k.createCell(0).setCellValue("ArrayList");
        rowArrayList_100k.createCell(1).setCellValue(results.loadResult(TypeCollections.ArrayListAdd_100k));
        rowArrayList_100k.createCell(2).setCellValue(results.loadResult(TypeCollections.ArrayListGet_100k));
        rowArrayList_100k.createCell(3).setCellValue(results.loadResult(TypeCollections.ArrayListRemove_100k));
        rowArrayList_100k.createCell(4).setCellValue(results.loadResult(TypeCollections.ArrayListContaints_100k));
        rowArrayList_100k.createCell(5).setCellValue(results.loadResult(TypeCollections.ArrayListPopulate_100k));
        rowArrayList_100k.createCell(6).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorAdd_100k));
        rowArrayList_100k.createCell(7).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorRemove_100k));

        // row LinkedList
        Row rowLinkedList_100k = sheet_100k.createRow(3);
        rowLinkedList_100k.createCell(0).setCellValue("LinkedList");
        rowLinkedList_100k.createCell(1).setCellValue(results.loadResult(TypeCollections.LinkedListAdd_100k));
        rowLinkedList_100k.createCell(2).setCellValue(results.loadResult(TypeCollections.LinkedListGet_100k));
        rowLinkedList_100k.createCell(3).setCellValue(results.loadResult(TypeCollections.LinkedListRemove_100k));
        rowLinkedList_100k.createCell(4).setCellValue(results.loadResult(TypeCollections.LinkedListContaints_100k));
        rowLinkedList_100k.createCell(5).setCellValue(results.loadResult(TypeCollections.LinkedListPopulate_100k));
        rowLinkedList_100k.createCell(6).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorAdd_100k));
        rowLinkedList_100k.createCell(7).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorRemove_100k));

        // row HashSet
        Row rowHashSet_100k = sheet_100k.createRow(4);
        rowHashSet_100k.createCell(0).setCellValue("HashSet");
        rowHashSet_100k.createCell(1).setCellValue(results.loadResult(TypeCollections.HashSetAdd_100k));
        rowHashSet_100k.createCell(2).setCellValue(results.loadResult(TypeCollections.HashSetGet_100k));
        rowHashSet_100k.createCell(3).setCellValue(results.loadResult(TypeCollections.HashSetRemove_100k));
        rowHashSet_100k.createCell(4).setCellValue(results.loadResult(TypeCollections.HashSetContaints_100k));
        rowHashSet_100k.createCell(5).setCellValue(results.loadResult(TypeCollections.HashSetPopulate_100k));
        rowHashSet_100k.createCell(6).setCellValue(results.loadResult(TypeCollections.HashSetIteratorAdd_100k));
        rowHashSet_100k.createCell(7).setCellValue(results.loadResult(TypeCollections.HashSetIteratorRemove_100k));

        // row TreeSet
        Row rowTreeSet_100k = sheet_100k.createRow(5);
        rowTreeSet_100k.createCell(0).setCellValue("TreeSet");
        rowTreeSet_100k.createCell(1).setCellValue(results.loadResult(TypeCollections.TreeSetAdd_100k));
        rowTreeSet_100k.createCell(2).setCellValue(results.loadResult(TypeCollections.TreeSetGet_100k));
        rowTreeSet_100k.createCell(3).setCellValue(results.loadResult(TypeCollections.TreeSetRemove_100k));
        rowTreeSet_100k.createCell(4).setCellValue(results.loadResult(TypeCollections.TreeSetContaints_100k));
        rowTreeSet_100k.createCell(5).setCellValue(results.loadResult(TypeCollections.TreeSetPopulate_100k));
        rowTreeSet_100k.createCell(6).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorAdd_100k));
        rowTreeSet_100k.createCell(7).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorRemove_100k));

        sheet_100k.autoSizeColumn(1); sheet_100k.autoSizeColumn(2);
        sheet_100k.autoSizeColumn(3); sheet_100k.autoSizeColumn(4);
        sheet_100k.autoSizeColumn(5); sheet_100k.autoSizeColumn(6);
        sheet_100k.autoSizeColumn(7);

        // sheet_1M
        Sheet sheet_1M = workbook.createSheet("Table 1M");

        Row rowTableName_1M = sheet_1M.createRow(0);
        rowTableName_1M.createCell(0).setCellValue(TEXT_FOR_TABLE_1M);
        rowTableName_1M.getCell(0).setCellStyle(styleBoldFont); // this text in cell is bold

        Row headTable_1M = sheet_1M.createRow(1);
        headTable_1M.createCell(1).setCellValue("add");
        headTable_1M.createCell(2).setCellValue("get");
        headTable_1M.createCell(3).setCellValue("remove");
        headTable_1M.createCell(4).setCellValue("contains");
        headTable_1M.createCell(5).setCellValue("populate");
        headTable_1M.createCell(6).setCellValue("iterator.add");
        headTable_1M.createCell(7).setCellValue("iterator.remove");

        // row ArrayList
        Row rowArrayList_1M = sheet_1M.createRow(2);
        rowArrayList_1M.createCell(0).setCellValue("ArrayList");
        rowArrayList_1M.createCell(1).setCellValue(results.loadResult(TypeCollections.ArrayListAdd_1M));
        rowArrayList_1M.createCell(2).setCellValue(results.loadResult(TypeCollections.ArrayListGet_1M));
        rowArrayList_1M.createCell(3).setCellValue(results.loadResult(TypeCollections.ArrayListRemove_1M));
        rowArrayList_1M.createCell(4).setCellValue(results.loadResult(TypeCollections.ArrayListContaints_1M));
        rowArrayList_1M.createCell(5).setCellValue(results.loadResult(TypeCollections.ArrayListPopulate_1M));
        rowArrayList_1M.createCell(6).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorAdd_1M));
        rowArrayList_1M.createCell(7).setCellValue(results.loadResult(TypeCollections.ArrayListIteratorRemove_1M));

        // row LinkedList
        Row rowLinkedList_1M = sheet_1M.createRow(3);
        rowLinkedList_1M.createCell(0).setCellValue("LinkedList");
        rowLinkedList_1M.createCell(1).setCellValue(results.loadResult(TypeCollections.LinkedListAdd_1M));
        rowLinkedList_1M.createCell(2).setCellValue(results.loadResult(TypeCollections.LinkedListGet_1M));
        rowLinkedList_1M.createCell(3).setCellValue(results.loadResult(TypeCollections.LinkedListRemove_1M));
        rowLinkedList_1M.createCell(4).setCellValue(results.loadResult(TypeCollections.LinkedListContaints_1M));
        rowLinkedList_1M.createCell(5).setCellValue(results.loadResult(TypeCollections.LinkedListPopulate_1M));
        rowLinkedList_1M.createCell(6).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorAdd_1M));
        rowLinkedList_1M.createCell(7).setCellValue(results.loadResult(TypeCollections.LinkedListIteratorRemove_1M));

        // row HashSet
        Row rowHashSet_1M = sheet_1M.createRow(4);
        rowHashSet_1M.createCell(0).setCellValue("HashSet");
        rowHashSet_1M.createCell(1).setCellValue(results.loadResult(TypeCollections.HashSetAdd_1M));
        rowHashSet_1M.createCell(2).setCellValue(results.loadResult(TypeCollections.HashSetGet_1M));
        rowHashSet_1M.createCell(3).setCellValue(results.loadResult(TypeCollections.HashSetRemove_1M));
        rowHashSet_1M.createCell(4).setCellValue(results.loadResult(TypeCollections.HashSetContaints_1M));
        rowHashSet_1M.createCell(5).setCellValue(results.loadResult(TypeCollections.HashSetPopulate_1M));
        rowHashSet_1M.createCell(6).setCellValue(results.loadResult(TypeCollections.HashSetIteratorAdd_1M));
        rowHashSet_1M.createCell(7).setCellValue(results.loadResult(TypeCollections.HashSetIteratorRemove_1M));

        // row TreeSet
        Row rowTreeSet_1M = sheet_1M.createRow(5);
        rowTreeSet_1M.createCell(0).setCellValue("TreeSet");
        rowTreeSet_1M.createCell(1).setCellValue(results.loadResult(TypeCollections.TreeSetAdd_1M));
        rowTreeSet_1M.createCell(2).setCellValue(results.loadResult(TypeCollections.TreeSetGet_1M));
        rowTreeSet_1M.createCell(3).setCellValue(results.loadResult(TypeCollections.TreeSetRemove_1M));
        rowTreeSet_1M.createCell(4).setCellValue(results.loadResult(TypeCollections.TreeSetContaints_1M));
        rowTreeSet_1M.createCell(5).setCellValue(results.loadResult(TypeCollections.TreeSetPopulate_1M));
        rowTreeSet_1M.createCell(6).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorAdd_1M));
        rowTreeSet_1M.createCell(7).setCellValue(results.loadResult(TypeCollections.TreeSetIteratorRemove_1M));

        sheet_1M.autoSizeColumn(1); sheet_1M.autoSizeColumn(2);
        sheet_1M.autoSizeColumn(3); sheet_1M.autoSizeColumn(4);
        sheet_1M.autoSizeColumn(5); sheet_1M.autoSizeColumn(6);
        sheet_1M.autoSizeColumn(7);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Result_JavaEE_Module_01.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println(" File with result save to Microsoft Excel \"Result_JavaEE_Module_01.xls\" file successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
