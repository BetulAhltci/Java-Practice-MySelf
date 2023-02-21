package k4_SampleQoestion;

import java.util.Scanner;

public class soru2_dikdörtgeninÇevreAlan {
    public static void main(String[] args) {
       /* Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
                * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
                * Dikdortgenin Alani : uzun kenar * kisa kenar (edited*/

        Scanner scan=new Scanner(System.in);
        System.out.println("didörtgenin kenar uzunluklarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        int cevre=2*(kenar1+kenar2);
        System.out.println("dikdörtgenin çevresi="+ cevre);
        int alan=kenar1*kenar2;
        System.out.println("dikdörtgenin alanı="+ alan);









    }
}
