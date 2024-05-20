public class dublicate {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,50,60,70,20,50,40,20};

        int n = arr.length;

        for (int i = 0; i <n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
