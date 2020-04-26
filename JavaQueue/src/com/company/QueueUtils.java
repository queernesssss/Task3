package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueUtils {

    public static void fill(String file, Queue<Integer> queue) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        while (scan.hasNext()) {
            queue.offer(Integer.parseInt(scan.nextLine()));
        }
    }

    public static Queue<Integer> removeOdd(Queue<Integer> queue) {
        Queue<Integer> removedQueue = new PriorityQueue<>();
        while (!queue.isEmpty()) {
            int data = queue.poll();
            if (data % 2 == 0) {
                removedQueue.offer(data);
            }
        }
        return removedQueue;
    }

    public static int[] toArray(Queue<Integer> queue) {
        int[] array = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            array[i] = queue.poll();
            i++;
        }
        return array;
    }
}
