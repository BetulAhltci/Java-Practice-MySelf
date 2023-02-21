package k2_IfStatement;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
       // Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
       //  “Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        double sayı= scan.nextDouble();

        if(sayı%5==0){
            System.out.println("sayı 5'in tam katı");
        }
    }
}
