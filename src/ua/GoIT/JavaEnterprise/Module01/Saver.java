package ua.GoIT.JavaEnterprise.Module01;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Saver {
    Results results;
    Workbook workbook;
    Date date;

    public Saver() {
        this.results = new Results();
        this.workbook = new HSSFWorkbook();
        this.date = new Date();
    }

    public void saveToExcel() {
        ArrayList<Double> cr; // collection results

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
        cr = results.getResults(TypeCollections.ArrayList, VALUE_10k);
        rowArrayList_10k.createCell(0).setCellValue("ArrayList");
        for (int i=0; i<7; i++) {
            rowArrayList_10k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row LinkedList
        Row rowLinkedList_10k = sheet_10k.createRow(3);
        cr = results.getResults(TypeCollections.LinkedList, VALUE_10k);
        rowLinkedList_10k.createCell(0).setCellValue("LinkedList");
        for (int i=0; i<7; i++) {
            rowLinkedList_10k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row HashSet
        Row rowHashSet_10k = sheet_10k.createRow(4);
        cr = results.getResults(TypeCollections.HashSet, VALUE_10k);
        rowHashSet_10k.createCell(0).setCellValue("HashSet");
        for (int i=0; i<7; i++) {
            rowHashSet_10k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row TreeSet
        Row rowTreeSet_10k = sheet_10k.createRow(5);
        cr = results.getResults(TypeCollections.TreeSet, VALUE_10k);
        rowTreeSet_10k.createCell(0).setCellValue("TreeSet");
        for (int i=0; i<7; i++) {
            rowTreeSet_10k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        Row rowCurrentTime_10k = sheet_10k.createRow(6);
        rowCurrentTime_10k.createCell(0).setCellValue("date of creation: "+date.toString());

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
        cr = results.getResults(TypeCollections.ArrayList, VALUE_100k);
        rowArrayList_100k.createCell(0).setCellValue("ArrayList");
        for (int i=0; i<7; i++) {
            rowArrayList_100k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row LinkedList
        Row rowLinkedList_100k = sheet_100k.createRow(3);
        cr = results.getResults(TypeCollections.LinkedList, VALUE_100k);
        rowLinkedList_100k.createCell(0).setCellValue("LinkedList");
        for (int i=0; i<7; i++) {
            rowLinkedList_100k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row HashSet
        Row rowHashSet_100k = sheet_100k.createRow(4);
        cr = results.getResults(TypeCollections.HashSet, VALUE_100k);
        rowHashSet_100k.createCell(0).setCellValue("HashSet");
        for (int i=0; i<7; i++) {
            rowHashSet_100k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row TreeSet
        Row rowTreeSet_100k = sheet_100k.createRow(5);
        cr = results.getResults(TypeCollections.TreeSet, VALUE_100k);
        rowTreeSet_100k.createCell(0).setCellValue("TreeSet");
        for (int i=0; i<7; i++) {
            rowTreeSet_100k.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        Row rowCurrentTime_100k = sheet_100k.createRow(6);
        rowCurrentTime_100k.createCell(0).setCellValue("date of creation: "+date.toString());

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
        cr = results.getResults(TypeCollections.ArrayList, VALUE_1M);
        rowArrayList_1M.createCell(0).setCellValue("ArrayList");
        for (int i=0; i<7; i++) {
            rowArrayList_1M.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row LinkedList
        Row rowLinkedList_1M = sheet_1M.createRow(3);
        cr = results.getResults(TypeCollections.LinkedList, VALUE_1M);
        rowLinkedList_1M.createCell(0).setCellValue("LinkedList");
        for (int i=0; i<7; i++) {
            rowLinkedList_1M.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row HashSet
        Row rowHashSet_1M = sheet_1M.createRow(4);
        cr = results.getResults(TypeCollections.HashSet, VALUE_1M);
        rowHashSet_1M.createCell(0).setCellValue("HashSet");
        for (int i=0; i<7; i++) {
            rowHashSet_1M.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        // row TreeSet
        Row rowTreeSet_1M = sheet_1M.createRow(5);
        cr = results.getResults(TypeCollections.TreeSet, VALUE_1M);
        rowTreeSet_1M.createCell(0).setCellValue("TreeSet");
        for (int i=0; i<7; i++) {
            rowTreeSet_1M.createCell(i+1).setCellValue(String.format("%.3f",cr.get(i)));
        }

        Row rowCurrentTime_1M = sheet_1M.createRow(6);
        rowCurrentTime_1M.createCell(0).setCellValue("date of creation: "+date.toString());

        sheet_1M.autoSizeColumn(1); sheet_1M.autoSizeColumn(2);
        sheet_1M.autoSizeColumn(3); sheet_1M.autoSizeColumn(4);
        sheet_1M.autoSizeColumn(5); sheet_1M.autoSizeColumn(6);
        sheet_1M.autoSizeColumn(7);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Result_JavaEE_Module_01.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("\n File with result save to Microsoft Excel \"Result_JavaEE_Module_01.xls\" file!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
