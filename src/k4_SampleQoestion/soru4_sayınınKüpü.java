package k4_SampleQoestion;

import java.util.Scanner;

public class soru4_sayınınKüpü {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        //Ipuclari:
        //* Sayinin küpü: sayi*sayi*sayi (edited

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı=scan.nextDouble();

        double kup=(sayı*sayı*sayı)/2;
        System.out.println("sayının kupunun yarısı="+kup);

    }
}
