package k4_SampleQoestion;

import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {

    /*
   Kullanıcıdan en az 5 harfli bir kelime alın.
   Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
    Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
    Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
    Loopun içerisinde StringM methodlarından  yararlanalım! */

        Scanner scan = new Scanner(System.in);
        System.out.println("En az beş harfli bir kelime giriniz");
        String str=scan.next();
        String yeni= str.substring(str.length()-3);

        while (str.length()<=5){
            System.out.println("girilen kelimw en az 5 harfli olmalı");
            str=scan.next();

        }

        System.out.println(yeni.repeat(2));





        }

    }
