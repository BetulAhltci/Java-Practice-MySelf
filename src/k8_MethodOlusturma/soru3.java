package k8_MethodOlusturma;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz");
        int sayi = scan.nextInt();
        asalSayimi(sayi);

    }

    private static void asalSayimi(int sayi) {
        String asalSayi = "sayi asal";
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) { // eger burasi calisirsa asal sayi degil
                System.out.println(" asal değildir");
                break;
            }
            System.out.println(asalSayi);
            break;
        }
    }
}
