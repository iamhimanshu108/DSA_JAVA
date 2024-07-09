package Array;

public class reverse {
    public static void reverses (int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            // swap
            int temp  = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};

        reverses(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");

        }

    }
}
