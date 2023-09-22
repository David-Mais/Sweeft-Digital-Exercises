package org.example.exercises;

import java.util.HashMap;
import java.util.Map;

public class ExerciseThree {
    public static int notContains(int[] array) {
        if(array.length ==  0) {
            throw new IllegalArgumentException("array length should be at least 1");
        }
        int retNum = 0;
        int counter = 1;
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int num : array) {
            intMap.put(num, 1);
        }
        while(true) {
            if(!intMap.containsKey(counter)) {
                retNum = counter;
                break;
            }
            counter++;
        }
        return retNum;
    }
}
