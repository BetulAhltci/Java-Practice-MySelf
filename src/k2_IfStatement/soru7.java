package k2_IfStatement;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        //- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
       // kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=50) System.out.println("sınıfı geçtin");
        if (not<50) System.out.println("maalesef kaidın");

    }
}
