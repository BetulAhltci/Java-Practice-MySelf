package k4_SampleQoestion;

import java.util.Scanner;

public class soru5_KareninÇevreAlan {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın.
        // Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen karenin bir kenar uzunluğunu giriniz");
        double kenar=scan.nextDouble();
        double cevre=4*kenar;
        double alan=kenar*kenar;
        System.out.println("karenin çevresi="+ cevre);
        System.out.println("karenin alanı="+alan);

    }
}
