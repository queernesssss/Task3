package com.company;

public class LinkedQueue {
    private QueueElement head;
    private QueueElement tail;
    private int length = 0;

    public LinkedQueue() { }

    public void offer(int data) {
        QueueElement el = new QueueElement(data, null);
        if (isEmpty()) {
            this.head = el;
            this.tail = head;
        } else {
            tail.setNext(el);
            tail = el;
        }
        length++;
    }

    public int poll() {
        int data = head.getData();
        if (head.getNext() == null) {
            clean();
        } else {
            head = head.getNext();
        }
        length--;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        return length;
    }

    public int[] toArray() {
        int[] array = new int[length];
        int i = 0;
        while (!isEmpty()) {
            array[i] = poll();
            i++;
        }
        return array;
    }

    public void clean() {
        head = null;
        tail = null;
        length = 0;
    }
}
