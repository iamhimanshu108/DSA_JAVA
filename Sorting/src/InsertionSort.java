import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,10,6,1,3};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }


}
