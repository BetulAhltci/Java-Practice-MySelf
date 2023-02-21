package k2_IfStatement;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alıp
        //pozitif ise pozitif sayı,
        //100 ile 999 arasında ise(sınırlar dahil) "pozitif 3 basamaklı sayı"
        //3  ile bölünebiliyorsa "3 ün katı"
        //birler basamağı 7 ise "mükemmel"
        //seçeneklerden uygun olanı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı= scan.nextDouble();

        if(sayı>0){
            System.out.println("pozitif sayı");
        }
        if(sayı>=100 && sayı<=999){
            System.out.println("pozitif üç basamaklı sayı");
        }
        if(sayı%3==0){
            System.out.println("3 ün katı");
        }
        if(sayı%10==7){
            System.out.println("mükemmel");
        }


    }
}
