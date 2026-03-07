package ru.lessons.lesson11.step3;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueRunner {
    public static void main(String[] args) {
        final Queue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.offer(1);
        blockingQueue.offer(2);
        blockingQueue.offer(3);
        blockingQueue.offer(4); // не добавлен элемент
        final var polled = blockingQueue.poll(); // 1
        blockingQueue.offer(4); // [2, 3, 4] добавлена 4
    }
}
