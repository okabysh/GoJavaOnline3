package ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection;

import java.util.LinkedList;

public class MyCollection implements IMyCollection {
    private LinkedList<Integer> collection = new LinkedList<Integer>();

    @Override
    public Integer size() {
        return collection.size();
    }

    @Override
    public void populateCollection() {
        for (int i=0; i<5; i++) {
            collection.add(i+1);
        }
    }

    @Override
    public void addFirst(Integer value) {
        collection.addFirst(value);
        if (collection.size() > 0) {
            for (int i = 1; i < collection.size(); i++) {
                collection.set(i, collection.get(i) + value);
            }
        } else {
            collection.addFirst(value);
        }
    }

    @Override
    public void addByIndex(int index, Integer value) {
        collection.add(index, value);
        for (int i = 0; i < collection.size(); i++) {
            if (i != index) {
                collection.set(i, collection.get(i) + value);
            }
        }
    }

    @Override
    public void addLast(Integer value) {
        collection.addLast(value);
        if (collection.size() > 0) {
            for (int i = 0; i < collection.size() - 1; i++) {
                collection.set(i, collection.get(i) + value);
            }
        } else {
            collection.addLast(value);
        }
    }

    @Override
    public void removeByIndex(int index) {
        int minuend = collection.get(index);
        collection.remove(index);
        for (int i = 0; i < collection.size(); i++) {
            collection.set(i, collection.get(i) - minuend);
        }
    }

    @Override
    public void removeByValue(Integer value) {
        int indexValue = collection.indexOf(value);
        if (indexValue != -1) {
            int minuend = collection.get(indexValue);
            collection.remove(indexValue);
            for (int i = 0; i < collection.size(); i++) {
                collection.set(i, collection.get(i) - minuend);
            }
        }
    }

    @Override
    public Integer get(int index) {
        return collection.get(index);
    }
}
