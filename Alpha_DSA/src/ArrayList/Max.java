package ArrayList;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(200);
        list.add(345);
        list.add(45);
        list.add(56);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
//            if(max<list.get(i)) {
//                max = list.get(i);
//            }

            max = Math.max(max,list.get(i));

        }
        System.out.println("max element = " + max);
    }
}
