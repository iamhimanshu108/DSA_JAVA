package String;

public class subString {
    public static String substring(String str, int si, int ei){

        String substr = "";
        for (int i = 0; i <ei ; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {

        String str = "HelloWorld";
//        System.out.println(substring(str,0,5));
        System.out.println(str.substring(0,8));

    }
}
