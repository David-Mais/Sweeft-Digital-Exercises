package org.example.exercises;

public class ExerciseFive {
    public static int countVariants(int stairsCount) {
        if(stairsCount < 0) {
            throw new IllegalArgumentException("Impossible to have negative amount of stairs");
        }
        if(stairsCount == 0) {
            return 0;
        }else if(stairsCount == 1) {
            return 1;
        } else if (stairsCount == 2) {
            return 2;
        }

        return countVariants(stairsCount - 1) +
                countVariants(stairsCount - 2);
    }
}
