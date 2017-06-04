package home.ndrew3;

import home.ndrew3.Solution;
import org.junit.Test;
import static home.ndrew3.Solution.ARRAY_IS_EMPTY;
import static home.ndrew3.Solution.ARRAY_OVERSIZE_ERROR_CODE;
import static org.junit.Assert.assertEquals;


/**
 * Created by Андрей on 03.06.2017.
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExpectedValues(){
        int[] array = {9, 4, -3, -10};
        assertEquals(3, solution.solution(array));
        int[] array2 = {9, 4, 4, 12, 15};
        assertEquals(4, solution.solution(array2));

    }

    @Test
    public void testInvalidSize(){
        int[] array = new int[100001];
        assertEquals(ARRAY_OVERSIZE_ERROR_CODE, solution.solution(array));
        int[] array1 = new int[0];
        assertEquals(ARRAY_IS_EMPTY, solution.solution(array1));

    }
}