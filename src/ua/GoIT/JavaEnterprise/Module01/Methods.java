package ua.GoIT.JavaEnterprise.Module01;

import java.util.*;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Methods {
    final Random random = new Random();
    Convert convert = new Convert();

    public Double addMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            arrayList.add(random.nextInt(number-1), i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double getMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            arrayList.get(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double removeMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            arrayList.remove(random.nextInt(number-VALUE_ITERATION-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double containtsMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            arrayList.contains(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double populateMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            arrayList.add(i, random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorAddMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            ListIterator<Integer> listIterator = arrayList.listIterator(random.nextInt(number-1));
            listIterator.add(i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;
        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorRemoveMethodInArrayList(Integer number) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i < number; i++) {
            arrayList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            ListIterator<Integer> listIterator = arrayList.listIterator(random.nextInt(number-VALUE_ITERATION-1));
            listIterator.next(); listIterator.previous();
            listIterator.remove();
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;
        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double addMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            linkedList.add(random.nextInt(number-1), i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double getMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            linkedList.get(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double removeMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            linkedList.remove(random.nextInt(number-VALUE_ITERATION-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double containtsMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            linkedList.contains(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double populateMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            linkedList.add(i, random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorAddMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            ListIterator<Integer> listIterator = linkedList.listIterator(random.nextInt(number-1));
            listIterator.add(i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;
        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorRemoveMethodInLinkedList(Integer number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i=0; i < number; i++) {
            linkedList.add(i, i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            ListIterator<Integer> listIterator = linkedList.listIterator(random.nextInt(number-VALUE_ITERATION-1));
            listIterator.next(); listIterator.previous();
            listIterator.remove();
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;
        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double addMethodInHashSet(Integer number) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i < number; i++) {
            hashSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            hashSet.add(number+i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double getMethodInHashSet(Integer number) {
        // get method for HashSet not available
        return 0d;
    }

    public Double removeMethodInHashSet(Integer number) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i < number; i++) {
            hashSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            hashSet.remove(random.nextInt(number-VALUE_ITERATION-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double containtsMethodInHashSet(Integer number) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i < number; i++) {
            hashSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            hashSet.contains(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double populateMethodInHashSet(Integer number) {
        HashSet<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            hashSet.add(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorAddMethodInHashSet(Integer number) {
        // this method is not avaible in this collection
        return 0d;
    }

    public Double iteratorRemoveMethodInHashSet(Integer number) {
        // this method is not avaible in this collection
        return 0d;
    }

    public Double addMethodInTreeSet(Integer number) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i < number; i++) {
            treeSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            treeSet.add(number+i);
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double getMethodInTreeSet(Integer number) {
        // get method for HashSet not available
        return 0d;
    }

    public Double removeMethodInTreeSet(Integer number) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i < number; i++) {
            treeSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            treeSet.remove(random.nextInt(number-VALUE_ITERATION-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double containtsMethodInTreeSet(Integer number) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i < number; i++) {
            treeSet.add(i);
        }
        long startTime = System.nanoTime();
        for (int i=0; i < VALUE_ITERATION; i++) {
            treeSet.contains(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double populateMethodInTreeSet(Integer number) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        long startTime = System.nanoTime();
        for (int i=0; i < number; i++) {
            treeSet.add(random.nextInt(number-1));
        }
        long finishTime = System.nanoTime();
        long estimatedTime = finishTime - startTime;

        return convert.nanosecodToMicrosecond(estimatedTime/VALUE_ITERATION, 4);
    }

    public Double iteratorAddMethodInTreeSet(Integer number) {
        // this method is not avaible in this collection
        return 0d;
    }

    public Double iteratorRemoveMethodInTreeSet(Integer number) {
        // this method is not avaible in this collection
        return 0d;
    }
}
