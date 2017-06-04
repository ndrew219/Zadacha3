package home.ndrew3;

import static java.lang.Math.abs;

/**
 * Created by Андрей on 29.05.2017.
 * update 04.06.2017
 */
public class Solution {
    final public static int ARRAY_IS_EMPTY = -1;
    final public static int ARRAY_OVERSIZE_ERROR_CODE = -2;
    final private static int MAX_SIZE_ARRAY = 100000;

    public static int solution(int[] a){
        int sizeN = a.length;
        if (sizeN > 0 && sizeN <= MAX_SIZE_ARRAY) {
           int sum = 0;
            for (int i=0; i < sizeN; i++) {
                sum = sum + a[i];
            }
            int averageM = sum / sizeN;
            int maxDeviation = 0;
            int indexExtreme = -1;
            for (int i=0; i < sizeN; i++) {
                //System.out.print(abs(A[i]-averageM) + " " );
                if (abs(a[i]-averageM) > maxDeviation) {
                    maxDeviation = abs(a[i]-averageM);
                    indexExtreme = i;
                }
            }
            return indexExtreme;
        } else if (sizeN > MAX_SIZE_ARRAY) {
            return ARRAY_OVERSIZE_ERROR_CODE;
        } else {
            return ARRAY_IS_EMPTY;
        }
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

