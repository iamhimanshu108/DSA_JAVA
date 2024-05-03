public class EqulibiriumPointGFG {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        long sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];

        }
        long suml=0;
        long sumr=0;
        long c = 0;

        for (int i = 0; i < arr.length; i++) {
            sumr = sum-suml-arr[i];
            if(sumr==suml){
                return i+1;


            }
            suml+=arr[i];
        }
        return -1;
    }
}
