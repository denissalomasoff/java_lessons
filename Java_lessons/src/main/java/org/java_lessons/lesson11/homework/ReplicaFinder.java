package org.java_lessons.lesson11.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplicaFinder {
    public static boolean allItemsAreUnique(List<String> list) {
        // Создается множество uniqueSet из списка, входящего в метод, и в этом множестве автоматически удаляются дубликаты;
        Set<String> uniqueSet = new HashSet<>(list);
        // Eсли размер множества = размеру списка, то дубликатов нет;
        if (uniqueSet.size() == list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
