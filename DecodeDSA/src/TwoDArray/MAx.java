package TwoDArray;

import java.util.ArrayList;

public class MAx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(18);
        list.add(16);
        list.add(22);
        list.add(54);
        list.add(9);


        int max = Integer.MIN_VALUE;
        for (int i = 0; i <list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        System.out.println(max);


    }
}
