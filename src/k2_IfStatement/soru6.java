package k2_IfStatement;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        //- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3) System.out.println("eşkenar üçgen");
    }
}
