package k1_dataCasting;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //kullanıcıdan bir double bir tam sayı alın
        // doublw sayıyı ikinci sayıya bölun ve sonucun tam sayı kısmını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam bir sayı giriniz");
        int sayı1= scan.nextInt();
        System.out.println("lütfen bir ondalıklı sayı giriniz");
        double sayı2=scan.nextDouble();

        double sonuç=(int)(sayı1/sayı2);
        System.out.println(sonuç);

        System.out.println((int)(sayı1/sayı2));
    }
}
