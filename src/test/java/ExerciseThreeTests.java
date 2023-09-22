import org.example.exercises.ExerciseThree;
import org.example.exercises.ExerciseTwo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExerciseThreeTests {

    @Test(expected = IllegalArgumentException.class)
    public void exceptionTest() {
        int[] emptyArr = {};
        ExerciseThree.notContains(emptyArr);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 8, 11, 17, 20, 7, 10, 1, 14, 5, 6, 18, 16, 19, 12}, 2),
                Arguments.of(new int[]{2, 4, 7, 9, 15, 13, 10, 19, 18, 16, 6, 11, 5, 1}, 3),
                Arguments.of(new int[]{18, 7, 6, 14, 15, 10, 17, 12, 4, 3, 13, 2, 1, 9}, 5),
                Arguments.of(new int[]{20, 15, 10, 14, 7, 3, 4, 6, 11, 18, 2, 5, 9, 19}, 1),
                Arguments.of(new int[]{1, 13, 12, 8, 3, 5, 10, 19, 7, 18, 11, 6, 16, 15}, 2),
                Arguments.of(new int[]{17, 13, 2, 12, 4, 7, 10, 6, 1, 20, 11, 18, 5, 3}, 8),
                Arguments.of(new int[]{19, 7, 6, 4, 15, 3, 13, 12, 2, 8, 9, 11, 10, 16}, 1),
                Arguments.of(new int[]{16, 12, 3, 4, 18, 1, 10, 7, 6, 11, 8, 15, 19, 9}, 2),
                Arguments.of(new int[]{5, 14, 2, 7, 19, 8, 15, 9, 16, 11, 18, 13, 10, 12}, 1),
                Arguments.of(new int[]{6, 15, 12, 3, 8, 4, 11, 20, 1, 17, 2, 9, 10, 19}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void tenArrayTestCases(int[] arr, int expected){
        Assert.assertEquals(expected, ExerciseThree.notContains(arr));
    }
}
