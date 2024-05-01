public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int largestOfThree;

        if(num1 >= num2 && num1 >=num3){
            largestOfThree = num1;
        }
        else if(num2 >=num1 && num2 >=num3){
            largestOfThree = num2;
        }else {
            largestOfThree = num3;
        }
        System.out.println(largestOfThree);
    }
}
