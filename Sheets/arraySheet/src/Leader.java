public class Leader {

    static void LeaderInArray(int[] a){

        for (int i = 0; i <a.length ; i++) {
            boolean isLeader = true;
            for(int j=i+1; j<a.length; j++){
                if(a[j]>=a[i]){
                    isLeader = false;

                    break;
                }
            }
            if(isLeader==true){
                System.out.println(a[i]);
            }

        }
    }


    public static void main(String[] args) {
    int[] a = {8,11,5,11,7,6,3};
        LeaderInArray(a);

    }
}
