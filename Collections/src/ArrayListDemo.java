import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        int arr[] = new int[10];

        //Create ArrayList

        ArrayList<Integer> al = new ArrayList<>();

        // add object

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

//        System.out.println(al);
        al.remove(4);

        for (int i = 0; i <al.size() ; i++) {

            System.out.println(al.get(i));
        }

        for(Integer data:al){
            System.out.println(data);
        }

    }
}
