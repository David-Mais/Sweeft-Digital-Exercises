package org.example.exercises;

import java.util.HashMap;
import java.util.Map;

public class ExerciseOne {
    public static int singleNumber(int[] nums) {
        if(nums.length == 0) {
            throw new IllegalArgumentException("length of an array should be at least 1");
        }
        Map<Integer, Integer> numberQuantity = new HashMap<>();
        for(int n : nums) {
            if(numberQuantity.containsKey(n)) {
                int newAmount = numberQuantity.get(n) + 1;
                numberQuantity.put(n, newAmount);
            }else {
                numberQuantity.put(n, 1);
            }
        }
        int retNum = 0;
        for(Map.Entry<Integer, Integer> entry : numberQuantity.entrySet()) {
            if(entry.getValue() == 1) {
                retNum = entry.getKey();
            }
        }
        return retNum;
    }
}
