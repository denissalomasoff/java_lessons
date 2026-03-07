package ru.lessons.lesson11.step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackRunner {
    public static void main(String[] args) {
        // LIFO
        final Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        stack.push("Sixth");
        stack.push("Seventh");
        List<String> list = new ArrayList<>();
        list.add("Haskel");
        final var peeked = stack.peek(); // "Seventh", если пустой Throws: EmptyStackException
        final var size = stack.size(); // 7
        final var added = stack.add("Eleven"); // true
        final var contains = stack.contains("Eleven"); // true
        final var addAll = stack.addAll(list); // true
        final var remove = stack.pop(); // "Haskel" удален
    }
}
