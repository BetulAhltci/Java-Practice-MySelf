package k1_dataCasting;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı bir sayı alınız ve rakamlar toplamını hesaplayınız
        //imput sayı=4567

        Scanner scan=new Scanner(System.in);
        System.out.println("dört basamaklı sayı giriniz");
        int sayı= scan.nextInt();

        int bırlerbas=0;
        int rakamlartop=0;

        bırlerbas=sayı%10;//7
        rakamlartop=rakamlartop+bırlerbas;//0+7

        sayı=sayı/10;//456
        bırlerbas=sayı%10;//6
        rakamlartop=rakamlartop+bırlerbas;//7+6

        sayı=sayı/10;//45
        bırlerbas=sayı%10;//5
        rakamlartop=rakamlartop+bırlerbas;//13+5

        sayı=sayı/10;//4
        bırlerbas=sayı%10;//4
        rakamlartop=rakamlartop+bırlerbas;//18+4
        System.out.println("rakamlar toplamı:"+rakamlartop);
    }
}
