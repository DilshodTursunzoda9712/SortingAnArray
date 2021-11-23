package sortBySelection;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[][] data = {
                {2, 3, 1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 12, 53, 14, 18, 2, 60, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            SelectionSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}