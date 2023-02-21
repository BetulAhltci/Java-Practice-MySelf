package k5_StringManipülaation;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String sifre=scan.nextLine();
        int flag=0;

        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("İlk karakter küçük harf olmalı");
            flag++;
        }
        if (!((sifre.charAt(sifre.length()-1)>='0') && (sifre.charAt(sifre.length()-1)<='9'))){
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk içermemeli");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("En az on karakter olmalı");
            flag++;
        }
        if (flag==0){
            System.out.println("Sifre basarıyla olusturuldu");
        }




    }
}
