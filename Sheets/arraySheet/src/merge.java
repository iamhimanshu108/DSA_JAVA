import java.util.Arrays;

//Merge two sorted arrays into a single sorted array
public class merge {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,4,6,8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merge = new int[n1 + n2];

        int i=0, j=0, k=0;

        while(i< n1){
            merge[k++] = arr1[i++];
        }
        while (j<n2){
            merge[k++] = arr2[j++];
        }

        Arrays.sort(merge);

        for (int ele : merge){
            System.out.println(ele);
        }

    }
}
