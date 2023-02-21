package k1_dataCasting;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

       /* Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        isleminin sonucununun tamsayi kismini yazdirin.*/

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki doble sayı girin");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();
        System.out.println((int)(sayı1/sayı2));

    }
}
