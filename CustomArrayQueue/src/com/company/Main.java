package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        boolean checker;
        int peekElement;
        int pollElement;
        checker = queue.isEmpty();
        System.out.println(checker);
        for (int i = 1; i <= 15; i++) {
            queue.offer(i);
        }
        checker = queue.isEmpty();
        System.out.println(checker);
        peekElement = queue.peek();
        System.out.println(peekElement);
        while (!queue.isEmpty()) {
            pollElement = queue.poll();
            System.out.println(pollElement);
        }
        checker = queue.isEmpty();
        System.out.println(checker);
    }
}
