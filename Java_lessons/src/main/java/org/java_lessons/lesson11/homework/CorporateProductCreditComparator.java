package org.java_lessons.lesson11.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class CorporateProductCreditComparator implements Comparator {
    public int compareCcp(@NotNull CorporateProductCredit o1, CorporateProductCredit o2) {
        if (o1.getExpirationTime().isAfter(o2.getExpirationTime())) {
            return -1;
        } else if (o1.getExpirationTime().isBefore(o2.getExpirationTime())) {
            return 1;
        }
        return 0;
    }
}

