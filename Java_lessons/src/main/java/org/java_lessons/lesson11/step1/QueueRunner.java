package ru.lessons.lesson11.step1;

import java.util.*;

public class QueueRunner {
    public static void main(String[] args) {
        // FIFO
        final Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");
        queue.add("C#");
        queue.add("Golang");
        System.out.println(queue);
        List<String> list = new ArrayList<>();
        list.add("Haskel");
        final var peeked = queue.peek(); // "Java", null если пустая очередь
        final var element = queue.element(); // "Java" Throws: NoSuchElementException если пустая очередь
        final var isOffered = queue.offer("Lua"); // true
        final var hasPHP = queue.contains("PHP"); // false
        final var hasList = queue.containsAll(list); // false
        final var pooled = queue.poll(); // удален первый элемент очереди "Java"
        final var isEmpty = queue.isEmpty(); // false
        final var removed = queue.remove(); // удален первый элемент очереди "Python"
    }
}
