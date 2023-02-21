package k3_IfElseStatetment;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // kullanıcan bir üçgenin üc kenarını isteyin
        // ikizkenar ise "ikizkenar üçgen" değise "ikizkenar değil" yadır

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenarlarını girin");
        double knr1=scan.nextDouble();
        double knr2=scan.nextDouble();
        double knr3=scan.nextDouble();

        if (knr1==knr2 && knr2!=knr3){
            System.out.println("ikizkenar üçgen");
        }else{
            System.out.println("ikizkenar değil");
        }
    }
}
