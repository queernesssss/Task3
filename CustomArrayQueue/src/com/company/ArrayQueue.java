package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array = new int[10];
    private int size = 0;

    public ArrayQueue() { }

    public void offer(int data) {
        if (size == array.length) {
            int newLength = (int) (array.length * 1.5 + 1);
            array = Arrays.copyOf(array, newLength);
        }
        array[size] = data;
        size++;
    }

    public int poll() {
        int data = 0;
        if(!isEmpty()) {
            data = array[0];
            for (int i = 0; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
        return data;
    }

    public int peek() {
        return array[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return array[0] == 0;
    }
}
