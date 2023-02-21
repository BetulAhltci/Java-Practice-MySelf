package k6_Arrays;

import java.util.Arrays;

public class soru3 {
    public static void main(String[] args) {
        //verilen bir string array de istenen bir harfi içeren kelimeleri silip null yazdırın

        String[]arr={"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf="e";

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].contains(silinecekHarf)){

                arr[i]=null;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
