package k1_dataCasting;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

       /* Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        ile 127 arasindaki bir sayiya donusturup yazdirin.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı=(byte) scan.nextDouble();
        System.out.println(sayı);

    }
}
