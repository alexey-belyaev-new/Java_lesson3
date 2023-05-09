package org.example;

import java.util.List;

public class Task4 {
    static Integer max(List<Integer> listInt) {
        int size = listInt.size();
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (listInt.get(i) > max) max = listInt.get(i);
        }
        return max;
    }

    static Integer min(List<Integer> listInt) {
        int size = listInt.size();
        int min = listInt.get(0);
        for (int i = 0; i < size; i++) {
            if (listInt.get(i) < min) min = listInt.get(i);
        }
        return min;
    }

    static Integer average(List<Integer> listInt) {
        int size = listInt.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listInt.get(i);
        }
        return sum / size;
    }



}
