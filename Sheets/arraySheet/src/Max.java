//WAP to find the maximum element in an array
public class Max
{
    public static void main(String[] args) {
//        int[] arr = {10,20,30,45,46,78,98,124,758,1456,12,18};
//
//        int n = arr.length;
//
//        int max= arr[0];
//
//        for (int i = 0; i <n ; i++) {
//            if(arr[i]>max) max = arr[i];
//        }
//
//        System.out.println(max);

        System.out.println();


        int[] arr1 = {10,20,30,45,46,78,98,124,758,1456,12,18};

        int m = arr1.length;

        int mx = Integer.MIN_VALUE;

        for (int i = 0; i <m ; i++) {

            mx = Math.max(mx,arr1[i]);
        }

        System.out.println(mx);



        int smx = Integer.MIN_VALUE;

        for (int i = 0; i <m ; i++) {
            if (arr1[i] != mx);
            smx = Math.max(smx, arr1[i]);


        }

        System.out.println(smx);


    }
}
