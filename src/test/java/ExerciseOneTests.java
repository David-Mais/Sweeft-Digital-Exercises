import org.example.exercises.ExerciseOne;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseOneTests {
    @Test
    public void allTwoExceptOne() {
        int[] nums = {1,1,2,2,3,3,4};
        int expected = 4;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void someThreeSomeTwo() {
        int[] nums = {1,1,1,2,2,3,3,4,2,6,1,4};
        int expected = 6;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber1() {
        int[] nums = {1, 2, 2, 1, 3};
        int expected = 3;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber2() {
        int[] nums = {4, 4, 3, 2, 2, 3, 1};
        int expected = 1;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber3() {
        int[] nums = {-1, -1, -2};
        int expected = -2;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber4() {
        int[] nums = {5};
        int expected = 5;
        int actual = ExerciseOne.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionTest() {
        int[] empty = {};
        ExerciseOne.singleNumber(empty);
    }
}
