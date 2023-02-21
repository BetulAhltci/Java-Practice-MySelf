package k9_WhileLoop;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        int rakamtop=0;
        while (sayi!=0){
            int sonrakam=sayi%10;
            rakamtop+=sonrakam;
           sayi= sayi/10;
        }
        System.out.println(" rakamlar toplamı "+rakamtop);
    }
}
