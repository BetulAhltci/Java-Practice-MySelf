package k2_IfStatement;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
       // - Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı= scan.nextDouble();

        if(sayı%3==0) System.out.println("3 ile bölünebilen sayı");
        if (sayı%5==0) System.out.println("5 ile bölünebilen sayı");
    }
}
