public class Frequency {
    static void frequency(int[] a){
        int freq =1;
        int i =1;
        while(i<a.length){
            while(i<a.length && a[i] == a[i-1]){
                freq++;
                i++;
            }
            System.out.println(a[i-1] + " " + freq);
            freq=1;
            i++;
        }
        if(a.length==1 ||   a[i-1] != a[i-2]){
            System.out.println(a[i-1] + " " + freq);
        }
    }


    public static void main(String[] args) {
        int[] a ={20,20,30,30,30,30,40};
        frequency(a);
    }
}
