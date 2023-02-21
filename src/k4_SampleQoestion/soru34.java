package k4_SampleQoestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soru34 {
    public static void main(String[] args) {
        /*
        Bir String'i parametre olarak kabul eden ve verilen dizede
         Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */


        String str = "ade1r4d3";

        sayılarıTopla(str);
        arraySayılarıTopla(str);


    }

    private static void arraySayılarıTopla(String str) {
        int sayac=0;
        int[] arr=new int[sayac];
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                sayac++;
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
               arr[i]=Integer.valueOf(str.substring(i,i+1));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sayılarıTopla(String str){

        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(toplam);
    }





}

