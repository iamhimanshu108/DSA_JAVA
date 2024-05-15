package Sorting.BubbleSort;

public class bubblesort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,8,9,54,6,4};
        int n = arr.length;
        print(arr);
        System.out.println();
        // Bubble Sort  -1
        for(int x=0; x<=n-1;x++){
            for (int i = 0; i <n-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // Bubble Sort  -2 less time and Comp
        for(int x=0; x<n-1;x++){
            for (int i = 0; i <n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // Bubble Sort  -3 optimised

        for(int x=0; x<n-1;x++){
            boolean flag = true;
            for (int i = 0; i <n-1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if(flag==true)break;
        }


        print(arr);

    }
}
