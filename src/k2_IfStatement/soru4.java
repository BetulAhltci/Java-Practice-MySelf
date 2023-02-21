package k2_IfStatement;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
       // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
       // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        char ilkharf=scan.next().charAt(0);

        if(ilkharf=='o'|| ilkharf=='O') System.out.println("Ocak");
        if (ilkharf=='s'|| ilkharf=='S') System.out.println("Subat");
        if (ilkharf=='m'|| ilkharf=='M') System.out.println("mart veya mayıs");
        if(ilkharf=='n'|| ilkharf=='N' ) System.out.println("nisan");
        if(ilkharf=='h'|| ilkharf=='H') System.out.println("haziran");
        if (ilkharf=='t'||ilkharf=='T') System.out.println("temmuz");
        if (ilkharf=='a'||ilkharf=='A') System.out.println("ağustos veya aralık");
        if (ilkharf=='e'||ilkharf=='E') System.out.println("eylül veya ekim");

    }
}
