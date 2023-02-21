package k4_SampleQoestion;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        // Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        //
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin


        Scanner scan=new Scanner(System.in);
        System.out.println("günde kaç bardak cay icersiniz");
        double cay=scan.nextDouble();
        System.out.println("bir bardağa kaç seker atarsınız");
        double seker=scan.nextDouble();

        double yıllıkcay= cay*365;
        double yıllıkseker=(cay*1.5)*365;

        System.out.println("bir yılda tüketilen çay="+ yıllıkcay +"bardak");
        System.out.println("bir yılda tüketilen şeker=" +yıllıkseker+ "gram");

    }
}
