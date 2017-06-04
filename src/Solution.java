import static java.lang.Math.abs;

/**
 * Created by Андрей on 29.05.2017.
 */
public class Solution {
    final private static int ARRAY_IS_EMPTY = -1;
    final private static int MAX_SIZE_ARRAY = 100000;
    final private static int ARRAY_OVERSIZE_ERROR_CODE = -2;
    public static int solution(int[] A){

        int sizeN, averageM, maxDeviation, indexExtreme;
        maxDeviation = 0;
        sizeN = A.length;
        indexExtreme = -1;

        if (sizeN > 0 && sizeN <= MAX_SIZE_ARRAY) {

            int sum = 0;
            for (int i=0; i < sizeN; i++) {
                sum = sum + A[i];
            }

            averageM = sum / sizeN;

            for (int i=0; i < sizeN; i++) {
                //System.out.print(abs(A[i]-averageM) + " " );
                if (abs(A[i]-averageM) > maxDeviation) {
                    maxDeviation = abs(A[i]-averageM);
                    indexExtreme = i;
                }
            }

        } else if (sizeN == 0) {
            return ARRAY_IS_EMPTY;
            //System.out.println("Количество элементов массива больше 100 000");
        } else if (sizeN > MAX_SIZE_ARRAY) {
            return ARRAY_OVERSIZE_ERROR_CODE;
        }
        return indexExtreme;
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 4, 12, 15};
        int result = solution(array);

        switch (result) {
            case ARRAY_IS_EMPTY:
                System.out.println("Массив пуст");
                break;
            case ARRAY_OVERSIZE_ERROR_CODE:
                System.out.println("Массив содержит больше 100 000 элементов");
                break;
            default:
                System.out.println("index - " + result);
        }
    }
}

