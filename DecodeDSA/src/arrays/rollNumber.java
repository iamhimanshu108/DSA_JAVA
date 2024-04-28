// Q1 Given an array of marks of students, if the mark of any
//student is less than 35 print its roll number. [roll number
//here refers to the index of the array

package arrays;

public class rollNumber {

    public static void main(String[] args) {
        int[] arr = {81,45,67,100,12,34,56,24,89,23};
        int n = arr.length;;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<35){
                System.out.println(i+ " ");
            }
        }

    }
}
