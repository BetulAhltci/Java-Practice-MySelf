package k2_IfStatement;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //öğrençiden notları rakam olarak alın harf olarak yazdırın
        //0-49,999 DD
        //50-64,999 CC
        //65-84,999 BB
        //85-100 AA

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (0<=not && not<50){
            System.out.println("notunuz DD");
        }

        if(50<=not && not<65) {
            System.out.println("notunuz CC");
        }

        if(65<=not && not<85) {
            System.out.println("notunuz BB");
        }

        if (85<=not && not<100){
            System.out.println("notunuz AA");
        }



    }
}
