package src.Module06.Task3Addition;

import java.util.Arrays;

public class MyArrayListImpl implements MyArrayList {
    private Object[] data;
    private int capacity;
    private int currentSize;

    public MyArrayListImpl() {
        this(1);
    }

    public MyArrayListImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public void add(Object object) {
        if (currentSize + 1 > data.length) {
            data = Arrays.copyOf(data, data.length + capacity );
        }
        data[currentSize] = object;
        currentSize++;
    }

    @Override
    public Object get(int index) {
        return null;
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
