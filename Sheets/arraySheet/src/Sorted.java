import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {10,21,54,354,7,5,6,3,8,22};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        Arrays.sort(arr);
        System.out.println("-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
