package k7_ForLoop;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("20 den küçük bir sayi giriniz:");

        int girilenSayi= scan.nextInt();
        int faktoryel=1;
        String aradakiler="";

        if (girilenSayi<20){
            for (int i = girilenSayi; i >=1 ; i--) {
                faktoryel*=i;
                aradakiler+=i;

                if (i != 1) {
                    aradakiler += " * ";
                }
            }
            System.out.print(girilenSayi+"!="+aradakiler+"= " +faktoryel);
        }else System.out.println("Yanlış giriş yaptınız");

    }
}
