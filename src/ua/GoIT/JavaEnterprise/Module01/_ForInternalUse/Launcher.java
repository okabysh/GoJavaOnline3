package ua.GoIT.JavaEnterprise.Module01._ForInternalUse;

import java.util.HashSet;
import java.util.Random;

import static ua.GoIT.JavaEnterprise.Module01.Constants.VALUE_ITERATION;

public class Launcher {
    public static void main(String[] args) {
        final Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        long startTime;
        long finishTime;
        long estimatedTime;

        hashSet.clear();
        for (int i = 0; i < 16_384; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(16_384 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("10k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 25_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(25_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("25k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 50_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(50_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("50k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 75_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(75_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("75k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 100_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(100_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("100k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 250_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(250_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("250k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 500_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(500_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("500k: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(1_000_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("1M: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 10_000_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(10_000_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("10M: " + (double)estimatedTime / VALUE_ITERATION / 1000);

        hashSet.clear();
        for (int i = 0; i < 25_000_000; i++) {
            hashSet.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(25_000_000 - VALUE_ITERATION - 1));
        }
        finishTime = System.nanoTime();
        estimatedTime = finishTime - startTime;
        System.out.println("25M: " + (double)estimatedTime / VALUE_ITERATION / 1000);

    }
}
