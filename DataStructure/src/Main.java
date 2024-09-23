import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNew = {2, 45, -7, 6, 80, -4};
        InsertionSort.getInstance().sort(arrayNew);
        System.out.println(Arrays.toString(arrayNew));
    }
}