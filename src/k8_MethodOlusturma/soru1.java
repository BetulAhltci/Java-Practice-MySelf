package k8_MethodOlusturma;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
         */

        String input = "Hayat güzeldir";
        aradakiMetin(input);

    }

    private static void aradakiMetin(String input) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Baslangic ve bitis degeri giriniz");
        int bas=scan.nextInt();
        int bit=scan.nextInt();

        if (bit<bas){
            System.out.println("bitiş değeri baslangıcdan kücük olamaz");
        } else if (bas>input.length()-1 && bit>input.length()-1) {
            System.out.println("metnin sınırları dısına cıktınız");
        }else{
            System.out.println(input.substring(bas,bit));
        }

    }
}
