package k6_Arrays;

import java.util.Arrays;

public class soru4 {
    public static void main(String[] args) {

        //verlen bir array deki pozitif tamsayıları toplayıp sonucu bize döndüren bir metod yazınız

        int[] arr = {1, 2, 3, 4, -5, -6};

        System.out.println(sayılarToplamı(arr));


    }


    public static int sayılarToplamı(int[] sayı) {

        int toplam = 0;

        for (int i = 0; i < sayı.length; i++) {

            if (sayı[i] > 0) {
                toplam += sayı[i];
            }
        }
        return toplam;

    }
}




