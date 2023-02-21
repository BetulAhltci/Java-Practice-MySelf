package k8_MethodOlusturma;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println(isimSoyisim(isim, soyisim));

    }

    private static String isimSoyisim(String isim, String soyisim) {

        String isimSoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
                            soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return isimSoyisim;

    }
}
