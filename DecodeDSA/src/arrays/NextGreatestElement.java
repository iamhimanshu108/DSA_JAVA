package arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        // Methopd 1 Brute Force
        for (int i = 0; i < n-1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = 0; j <n ; j++) {
                mx = Math.max(mx, arr[j]);

            }ans[i] = mx;
        }

        //Method 2 Optimesed

        int nge = ans[n-1];

        for (int i = n-2; i >=0; i--) {
            ans[i] = nge;
            nge =Math.max(nge,arr[i]);
        }

        for (int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
        for (int ele : ans){
            System.out.println(ele+" ");
        }
        System.out.println();


    }
}
