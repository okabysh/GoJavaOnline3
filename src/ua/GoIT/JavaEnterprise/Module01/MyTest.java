package ua.GoIT.JavaEnterprise.Module01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyTest {


    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(1_000_000);
//        final Random random = new Random();
//        for (int i=0; i < 1_000_000; i++) {
//            arrayList.add(i, i);
//        }
//        long startTime = System.nanoTime();
//        for (int i=0; i < 1_000; i++) {
//            arrayList.contains(random.nextInt(1_000_000));
//            }
//        long finishTime = System.nanoTime();
//        long estimatedTime = finishTime - startTime;
//        System.out.println((float)estimatedTime/1_000/1_000+"µs");

        ArrayList arrayList = new ArrayList(1000);
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
           System.out.println(iterator.next());
        }
    }
}
