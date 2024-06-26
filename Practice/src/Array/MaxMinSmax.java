package Array;

public class MaxMinSmax {
    public static void main(String[] args) {
        int arr[]= {10,20,4,6,8,9,22,45};

        int n =arr.length;
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        int SMAX = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
           if(arr[i]>MAX){
               MAX = arr[i];
           }
           else if(arr[i]>SMAX){
               SMAX = arr[i];
           }

        }
        for (int i = 0; i < n; i++) {

           if (arr[i]<MIN)MIN = arr[i];
        }
        System.out.println(MAX);
        System.out.println(MIN);
        System.out.println(SMAX);
    }
}
