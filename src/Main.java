import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNew = {52, 30, -8, -8, 3, 6, 77, -2, 1};
        for (int x = arrayNew.length - 1; x > 0; x--) {
            for (int i = 0; i < x; i++) {
                if (arrayNew[i]> arrayNew[i+1])
                    swap(arrayNew,i,i+1);
            }
        }
        System.out.println(Arrays.toString(arrayNew));

    }

    public static void swap(int[] arrayNew, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arrayNew[i];
        arrayNew[i] = arrayNew[j];
        arrayNew[j] = temp;
    }
}