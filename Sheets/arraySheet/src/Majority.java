import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {10,20,3,3,5,4,3,5,6,3,8,3};

        int n = arr.length;

        Arrays.sort(arr);



        for (int i = 0; i <n; i++) {
            System.out.println("Mojority " + arr);
        }



    }
}
