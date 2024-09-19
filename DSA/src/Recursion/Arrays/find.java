package Recursion.Arrays;

public class find {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6};
        System.out.println(Find(arr,4,0));
        System.out.println(FindIndex(arr,4,0));
        System.out.println(FindIndexLast(arr,4, arr.length)-1);
    }

    static boolean Find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || Find(arr,target, index + 1);

    }

    static int  FindIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return FindIndex(arr, target, index+1);
        }



    }

    static int  FindIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return FindIndexLast(arr, target, index-1);
        }



    }
}
