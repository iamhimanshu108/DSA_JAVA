package Recursion;

public class arrayTraversal {

    public static void print(int i, int[] arr){
        if(i== arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,33,55,66,15,5};

        print(0,arr);
    }
}
