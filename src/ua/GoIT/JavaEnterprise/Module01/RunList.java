package ua.GoIT.JavaEnterprise.Module01;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class RunList {
    public RunList() {
        MyArrayList myArrayList = new MyArrayList();
        Results results = new Results();
        int currentTime;
        int totalTime = 0;

        // add() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.addFunctionInArrayList(VALUE_10k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListAdd, VALUE_10k, i, currentTime);
        }
        System.out.println("function add(index) to ArrayList(10,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // get() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.getFunctionInArrayList(VALUE_10k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListGet, VALUE_10k, i, currentTime);
        }
        System.out.println("function get(index) from ArrayList(10,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // remove() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.removeFunctionInArrayList(VALUE_10k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListRemove, VALUE_10k, i, currentTime);
        }
        System.out.println("function remove(index) from ArrayList(10,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // containts() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.containtsFunctionInArrayList(VALUE_10k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListContaints, VALUE_10k, i, currentTime);
        }
        System.out.println("function containts(value) from ArrayList(10,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // add() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.addFunctionInArrayList(VALUE_100k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListAdd, VALUE_100k, i, currentTime);
        }
        System.out.println("function add(index) to ArrayList(100,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // get() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.getFunctionInArrayList(VALUE_100k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListGet, VALUE_100k, i, currentTime);
        }
        System.out.println("function get(index) from ArrayList(100,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // remove() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.removeFunctionInArrayList(VALUE_100k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListRemove, VALUE_100k, i, currentTime);
        }
        System.out.println("function remove(index) from ArrayList(100,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // containts() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.containtsFunctionInArrayList(VALUE_100k);
            totalTime = totalTime + currentTime;
            results.saveResult(TypeCollections.ArrayListContaints, VALUE_100k, i, currentTime);
        }
        System.out.println("function containts(value) from ArrayList(100,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // add() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.addFunctionInArrayList(VALUE_1M);
            totalTime = totalTime + currentTime;
        }
        System.out.println("function add(index) to ArrayList(1,000,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // get() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.getFunctionInArrayList(VALUE_1M);
            totalTime = totalTime + currentTime;
        }
        System.out.println("function get(index) from ArrayList(1,000,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // remove() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.removeFunctionInArrayList(VALUE_1M);
            totalTime = totalTime + currentTime;
        }
        System.out.println("function remove(index) from ArrayList(1,000,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");

        // containts() function in ArrayList<>
        for (int i = 1; i < VALUE_ITERATION; i++) {
            currentTime = myArrayList.containtsFunctionInArrayList(VALUE_1M);
            totalTime = totalTime + currentTime;
        }
        System.out.println("function containts(value) from ArrayList(1,000,000) executed avarage: "+totalTime/VALUE_ITERATION+"ms");
    }
}
