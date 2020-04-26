package com.company;

public class LinkedQueueUtils {

    public static LinkedQueue removeOdd(LinkedQueue queue) {
        LinkedQueue removedQueue = new LinkedQueue();
        while (!queue.isEmpty()) {
            int data = queue.poll();
            if (data % 2 == 0) {
                removedQueue.offer(data);
            }
        }
        return removedQueue;
    }
}
