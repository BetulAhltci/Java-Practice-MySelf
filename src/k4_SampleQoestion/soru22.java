package k4_SampleQoestion;

import java.util.Scanner;

public class soru22 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini isteyin,
         ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz.
         İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz");
        int s1=scan.nextInt();
        int s2=scan.nextInt();
        int ebob=1;
        int ekok=1;
        int sayı=0;

        if (s1<s2) sayı=s1;
        else sayı=s2;

        for (int i = 2; i<=sayı ; i++) {
            if (s1 % i == 0 && s2 % i == 0) {
                ebob = i;

            }
        }
        ekok=(s1*s2)/ebob;

        System.out.println(s1+ " ve "+s2+" ebob= "+ ebob);
        System.out.println(s1+ " ve "+s2+" ekok= "+ekok);
    }

}
