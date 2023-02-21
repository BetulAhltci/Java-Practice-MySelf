package k4_SampleQoestion;

import java.util.Scanner;

public class soru18 {
    public static void main(String[] args) {
        /*
        Girilen araç hızı ve yol kilometresinden,
         gidilen yere varış süresini hesaplayan bir method yazalım.
          Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("hızınızı giriniz");
        int hız= scan.nextInt();
        System.out.println("yolun km'sini giriniz");
        double yol= scan.nextDouble();

        varışSüresiHesaplama(yol,hız);

    }

    public static void varışSüresiHesaplama(double sayı1,int sayı2){

        double sure=0;
        double varıssuresi =sayı1/sayı2;
        System.out.println(varıssuresi+ " saat");
    }



}
