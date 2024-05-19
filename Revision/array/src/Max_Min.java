public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,60,40};

        int n = arr.length;

        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);


        int mn = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            mn = Math.min(mn,arr[i]);
        }
        System.out.println(mn);
    }
}
