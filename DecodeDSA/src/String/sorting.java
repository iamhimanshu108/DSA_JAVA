package String;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String  s = "Himanshu";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for(char ele : ch){
            System.out.println(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("Yadav");
        char[] arr = sb.toString().toCharArray();
    }
}
