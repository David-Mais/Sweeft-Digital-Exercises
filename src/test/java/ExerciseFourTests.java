import org.example.exercises.ExerciseFour;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExerciseFourTests {
    @Test(expected = IllegalArgumentException.class)
    public void nonBinaryElements() {
        String firstOperand = "Hello";
        String secondOperand = "World";
        ExerciseFour.binaryAddition(firstOperand, secondOperand);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("0", "0", "0"),
                Arguments.of("1", "0", "1"),
                Arguments.of("1", "1", "10"),
                Arguments.of("10", "10", "100"),
                Arguments.of("1010111", "1110101", "11001100"),
                Arguments.of("101", "10", "111"),
                Arguments.of("1101", "1010", "10111"),
                Arguments.of("1001", "1110", "10111"),
                Arguments.of("1111", "0011", "10010"),
                Arguments.of("11000", "10101", "101101")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void tenDifferentBinarySum(String operandOne, String operandTwo, String result) {
        Assert.assertEquals(result, ExerciseFour.binaryAddition(operandOne, operandTwo));
    }
}
