package k9_WhileLoop;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
        : Kullanicidan Kullanicidan sifre
        isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
        kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
        - sifrenin son karakteri sayi olmali
         */
        char ilkharf;
        char sonharf;
        boolean sifredogru=false;
        String sifre="";

        Scanner scan=new Scanner(System.in);

        while (!sifredogru){
            System.out.println("sifre belirleyiniz");
            sifre=scan.nextLine();
            ilkharf=sifre.charAt(0);
            sonharf=sifre.charAt(sifre.length()-1);

            if (ilkharf<'a'|| ilkharf>'z'){
                System.out.println("ilk karakter kücük harf olmalı");
            } else if (sonharf<'0'|| sonharf>'9') {
                System.out.println("son karakter rakam olmalı");
            }else System.out.println("Şifre basarılı");
            sifredogru=true;
        }



    }
}
