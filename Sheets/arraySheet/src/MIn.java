public class MIn {
    public static void main(String[] args) {
        int[] arr = {10,20,30,45,46,78,98,4,124,758,1456,12,18};

        int n = arr.length;

        int min = arr[0];

        for (int i = 0; i <n ; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
