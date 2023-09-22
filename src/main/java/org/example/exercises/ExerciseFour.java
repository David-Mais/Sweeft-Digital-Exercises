package org.example.exercises;

public class ExerciseFour {
    private static final String BINARY_REGEX = "^[01]+$";
    public static String binaryAddition(String firstOperand, String secondOperand) {
        if(!firstOperand.matches(BINARY_REGEX) || !secondOperand.matches(BINARY_REGEX)) {
            throw new IllegalArgumentException("only 0s and 1s expected");
        }
        int first = Integer.parseInt(firstOperand,2);
        int second = Integer.parseInt(secondOperand,2);

        int sum = first + second;

        return Integer.toBinaryString(sum);
    }
}
