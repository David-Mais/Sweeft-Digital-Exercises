import org.example.exercises.ExerciseTwo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExerciseTwoTests {

    @Test(expected = IllegalArgumentException.class)
    public void exceptionTest() {
        ExerciseTwo.minSplit(-1);
    }
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("1", "1"),
                Arguments.of("2", "2"),
                Arguments.of("5", "1"),
                Arguments.of("15", "2"),
                Arguments.of("12", "3"),
                Arguments.of("1200", "24"),
                Arguments.of("55", "2"),
                Arguments.of("39", "7"),
                Arguments.of("555", "12"),
                Arguments.of("111", "4")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testNormalNumbers(int input, int expected) {
        Assert.assertEquals(expected, ExerciseTwo.minSplit(input));
    }



}
