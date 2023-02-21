package k5_StringManipülaation;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*
        : Kullanicidan isim ve soyismini ayri ayri alin.
        - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
        - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()+" "+
                                soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase() );
        }else {
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()+" "+
                                soyisim.toUpperCase());
        }


    }
}
