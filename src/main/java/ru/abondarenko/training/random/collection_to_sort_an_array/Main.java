package ru.abondarenko.training.random.collection_to_sort_an_array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * C помощью какой коллекции можно отсортировать массив ?
 * - Stack
 * - Queue
 * - Priority Queue
 *
 */

/**
 *  Решение:
 */

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{40,32,42,1,19,12,99,5};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int value : array) {
            priorityQueue.offer(value);
        }
        for (int i = 0; i < array.length; i++) {
            if (!priorityQueue.isEmpty()) {
                array[i] = priorityQueue.poll();
            }
        }
    }
}