public class SumOfDigits {
    public static void main(String[] args) {
        int nums = 112345;
        int sum =0;

        while(nums>0){
            sum += nums %10;
            nums /= 10;

        }
        System.out.println(sum);
    }
}
