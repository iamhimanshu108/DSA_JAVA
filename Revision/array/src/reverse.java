import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        for (int i=n-1; i <n; i--) {
            System.out.println(arr[i]);
        }
    }
}
