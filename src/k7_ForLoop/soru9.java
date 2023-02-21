package k7_ForLoop;

public class soru9 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        String str="hayat güzeldir";


        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i, i + 1));
        }

    }
}
