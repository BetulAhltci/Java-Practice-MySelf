package k4_SampleQoestion;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        //Kullanicidan üc basamaklı bir sayı alin.
        // Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:
        //Matematiksel Islemler konusuna bakalim
        // Bölme islemi kullanarak sayini basamaklarini alalim ve
        // toplam adli bir konteynira (Variable) atalim. (edited)


        Scanner scan=new Scanner(System.in);
        System.out.println("ltfen üç basamaklı bir sayı girini");
        int sayı=scan.nextInt();
        int toplam=0;
        int birbas=0;

        birbas=sayı%10;
        toplam=toplam+birbas;
        sayı=sayı/10;
        birbas=sayı%10;
        toplam=toplam+birbas;
        sayı=sayı/10;
        birbas=sayı%10;
        toplam=toplam+birbas;

        System.out.println(toplam);






    }
}
