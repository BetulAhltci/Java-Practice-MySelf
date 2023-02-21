package k9_WhileLoop;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        toplami yazdirin.
         */
        int toplam=0;
        int sayi=0;
        Scanner scan=new Scanner(System.in);
        while(toplam<=500){
            System.out.println("toplamak için bir sayi girinız");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayıların toplamı= "+toplam);

    }
}
