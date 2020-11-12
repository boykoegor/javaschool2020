package com.tsystems.javaschool.tasks.subsequence;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        // TODO: Implement the logic here
        if (x == null || y == null){
            throw new IllegalArgumentException();
        }
        Iterator iter = y.iterator();
        for (Object e : x){
            boolean found = false;
            while (iter.hasNext() && !found){
                Object n = iter.next();
                found = Objects.equals(e, n);
            }
        }
        return false;
    }
}
