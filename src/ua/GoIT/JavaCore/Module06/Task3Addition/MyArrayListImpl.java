package ua.GoIT.JavaCore.Module06.Task3Addition;

import java.util.Arrays;

public class MyArrayListImpl implements MyArrayList {
    private Object[] data;
    private int currentSize;

    public MyArrayListImpl() {
        this(1);
    }

    public MyArrayListImpl(int capacity) {
        data = new Object[capacity];
    }

    @Override
    public void add(Object object) {
        if (currentSize + 1 > data.length) {
            data = Arrays.copyOf(data, (data.length * 3 / 2 + 1));
        }
        data[currentSize] = object;
        currentSize++;
    }

    @Override
    public Object get(int index) {
        try {
            return data[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! You index:[" + index + "] is out of bounds!");
            return null;
        }

    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        if (currentSize > 0) {
            return false;
        } else {
            return true;
        }

    }
}
