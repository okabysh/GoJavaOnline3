package ua.GoIT.JavaEnterprise.Module01;

import java.util.ArrayList;

import static ua.GoIT.JavaEnterprise.Module01.Constants.VALUE_1k;

public class MyArrayList {
    public Integer addFunctionInArrayList(Integer number) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long finishTime = System.currentTimeMillis();
        long estimatedTime = finishTime - startTime;

        // convert to ms and return
        return (int)estimatedTime;
    }

    public Integer getFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.currentTimeMillis();
        for (int i=0; i < number; i++) {
            arrayList.get(i);
        }
        long finishTime = System.currentTimeMillis();
        long estimatedTime = finishTime - startTime;

        // convert to ms and return
        return (int)estimatedTime;
    }

    public Integer removeFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = number-1; i > 0; i--) {
            arrayList.remove(i);
        }

        long finishTime = System.currentTimeMillis();
        long estimatedTime = finishTime - startTime;

        // convert to ms and return
        return (int)estimatedTime;
    }

    public Integer containtsFunctionInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }

        long startTime = System.currentTimeMillis();
        for (int i=0; i < number; i++) {
            arrayList.contains(i);
        }
        long finishTime = System.currentTimeMillis();
        long estimatedTime = finishTime - startTime;

        // convert to ms and return
        return (int)estimatedTime;
    }
}
