import java.util.Arrays;

public class InsertionSort {
    private static final InsertionSort instance = new InsertionSort();

    private InsertionSort() {
    }

    public static InsertionSort getInstance() {
        return instance;
    }

    public void sort(int[] arrayNew) {
        System.out.println();
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayNew.length; firstUnsortedIndex++) {
            int newElement = arrayNew[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arrayNew[i - 1] > newElement; i--) {
                arrayNew[i] = arrayNew[i - 1];
            }
            arrayNew[i] = newElement;
            System.out.println(Arrays.toString(arrayNew));
        }
    }
}
