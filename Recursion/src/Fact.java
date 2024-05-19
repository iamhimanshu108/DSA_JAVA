public class Fact {
    public static void main(String[] args) {
        System.out.println(facotial(5));
    }

    private static int facotial(int n) {
        if(n==0) return 1;
        return n*facotial(n-1);
    }
}
