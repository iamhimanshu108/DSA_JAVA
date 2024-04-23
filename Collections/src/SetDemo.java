import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];

        //Create ArrayList

        List<Integer> al = new ArrayList<>();

        // add object

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        al.add(40);
        al.add(50);

        System.out.println(al);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(8787);
        set.add(55454);
        set.add(9788);
        set.add(14);


//        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
