package k7_ForLoop;

public class soru10 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String isteyin ve String’i tersine cevirip
        kaydedin.
         */

        String str="hayat güzeldir";
        String tersstr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersstr+=str.substring(i,i+1);
        }
        System.out.println(tersstr);


    }
}
