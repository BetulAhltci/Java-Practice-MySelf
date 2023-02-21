package k4_SampleQoestion;

import java.util.Scanner;

public class soru3_ortalama {
    public static void main(String[] args) {
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        //Ipuclari:
        //* Sayilarin ortalamasi: toplam/5 (edited)

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 tam sayı giriniz");

        int s1=scan.nextInt();
        int s2=scan.nextInt();
        int s3=scan.nextInt();
        int s4=scan.nextInt();
        int s5=scan.nextInt();
        int ortalama= (s1+s2+s3+s4+s5)/5;
        System.out.println("beş sayının ortalaması="+ ortalama);
    }
}
