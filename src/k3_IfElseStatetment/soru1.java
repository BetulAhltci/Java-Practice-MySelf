package k3_IfElseStatetment;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        // kullanıcan bir üçgenin üc kenarını isteyin
        // eşkenar ise "eskenar üçgen" değise "eşkenar deği" yadır

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar üzunluklarını girin");
        double knr1=scan.nextDouble();
        double knr2=scan.nextDouble();
        double knr3= scan.nextDouble();

        if (knr1 == knr2 && knr2 == knr3) {
            System.out.println("eşkenar üçgen");
        }
        else{
            System.out.println("Eşkenar değil");
        }

    }
}
