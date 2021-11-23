package bubbleSort;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] data = {
                {2,3,1},
                {0, 5, 7, 2},
                {9, 7, 2, 3, 0},
                {6, 18, 13, 23, 5, 4, 11, 2, 10, 9, 7},
        };

        for(int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}