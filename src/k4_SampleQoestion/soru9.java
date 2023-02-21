package k4_SampleQoestion;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        // Girilen zamanı saniyeye çeviriniz.
        //  Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //  Ipucu:
        //  Saati alıp saniyeye cevirebilirsiniz.
        //  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dakika ve saniye ile beraber saati giriniz");
        int saat=scan.nextInt();
        int dakika=scan.nextInt();
        int saniye=scan.nextInt();

        int toplamsaniye=(saat*60*60)+(dakika*60)+saniye;
        System.out.println("girlen saat toplam " + toplamsaniye +" sn. yapar");


    }
}
