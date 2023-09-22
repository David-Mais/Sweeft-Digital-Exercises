import org.example.exercises.ExerciseFive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExerciseFiveTests {
    @Test(expected = IllegalArgumentException.class)
    public void negativeStairsTest() {
        ExerciseFive.countVariants(-10);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0,0),
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,3),
                Arguments.of(4,5),
                Arguments.of(5,8),
                Arguments.of(6,13),
                Arguments.of(7,21),
                Arguments.of(8,34),
                Arguments.of(9,55)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testTenCases(int input, int expected) {
        Assert.assertEquals(expected, ExerciseFive.countVariants(input));
    }
}
