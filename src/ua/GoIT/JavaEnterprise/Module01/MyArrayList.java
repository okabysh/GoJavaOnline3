package ua.GoIT.JavaEnterprise.Module01;

import java.util.ArrayList;

import static ua.GoIT.JavaEnterprise.Module01.Constants.VALUE_1k;

public class MyArrayList {
    public Integer addFunctionInArrayList(Integer number) {
        long startTime = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        // convert to µs and return
        return (int)estimatedTime/VALUE_1k;
    }

    public Integer getFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            arrayList.get(i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        // convert to µs and return
        return (int)estimatedTime/VALUE_1k;
    }

    public Integer removeFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.nanoTime();
        for (int i = number-1; i > 0; i--) {
            arrayList.remove(i);
        }

        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        // convert to µs and return
        return (int)estimatedTime/VALUE_1k;
    }

    public Integer containtsFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            arrayList.contains(i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        // convert to µs and return
        return (int)estimatedTime/VALUE_1k;
    }
}
