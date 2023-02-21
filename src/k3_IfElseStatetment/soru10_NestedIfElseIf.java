package k3_IfElseStatetment;

import java.util.Scanner;

public class soru10_NestedIfElseIf {
    public static void main(String[] args) {
        /*kullanıcıdan yaşını yaşını ve cinsiyetini alın
        kadın 60 yaş ustu erkek 65 yaş üstu olabilir
        cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        veya  "emekli olmak için ... yıl daha çalışman gerek" yazdır
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz\nK:Kadın E:Erkek");
        char cınsıyet = scan.next().charAt(0);

        System.out.println("yaşınızı giriniz");
        int yas = scan.nextInt();

        if (cınsıyet == 'k' || cınsıyet == 'K') {
            if (yas < 18 || yas > 80) System.out.println("geçersiz yaş");
            else if (yas >= 60) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için" + (60 - yas)+"yıl daha çalışmalısın");
        } else if (cınsıyet == 'e' || cınsıyet == 'E') {
            if (yas < 18 || yas > 80) System.out.println("geçersiz yaş");
            else if (yas >= 65) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için" + (65 - yas)+"yıl daha çalışmalısın");
        }else {
            System.out.println("geçersiz bilgi girdiniz");}
        }

    }

