package bubbleSort;

public class BubbleSort {
    public static void sort(int[] array) {
        //Сортировка пузырьком

        // i номер прохода
        for (int i = 0; i < array.length; i++) {
            // 2 цыкл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }
}