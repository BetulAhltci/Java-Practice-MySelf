package k3_IfElseStatetment;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*
        kullanıcıdan kilo(kg)  ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayın (kilo*10000/(boy*boy)
        25-30 arası kilolu
        20-25 arası normal
        20 den küçuk ise zayıf yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kilo giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vke=(kilo*10000/(boy*boy));

        if (vke>=30){
            System.out.println("obez");}
        else if (vke>=25){
            System.out.println("kilolu");}
        else if (vke>=20){
            System.out.println("normal");}
        else{
            System.out.println("zayıf");
        }

    }
}
