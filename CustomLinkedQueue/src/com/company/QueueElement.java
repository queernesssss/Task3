package com.company;

public class QueueElement {
    private QueueElement next;
    private int data;

    public QueueElement(int data, QueueElement next) {
        this.next = next;
        this.data = data;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QueueElement getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
